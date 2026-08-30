package interfaceDoComando;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * RESPONSÁVEL: Gustavo
 *
 * Ações de manipulação de arquivo (itens 10, 11 e 12 do PDF): novo, abrir, salvar.
 * Recebe as outras classes prontas (Editor, AreaMenssagem, BarraStatus) e só
 * chama os métodos delas — não recria nada.
 */
public class AcoesArquivo {

    private Editor editor;
    private AreaMenssagem areaMensagem;
    private BarraStatus barraStatus;

    // guarda o arquivo atualmente aberto; null enquanto for "novo"/ainda não salvo
    private File arquivoAtual;

    public AcoesArquivo(Editor editor, AreaMenssagem areaMensagem, BarraStatus barraStatus) {
        this.editor = editor;
        this.areaMensagem = areaMensagem;
        this.barraStatus = barraStatus;
    }

    /** Botão "novo" [ctrl-n] — item 10. */
    public void novo() {
        editor.limpar();
        areaMensagem.limpar();
        barraStatus.limpar();
        arquivoAtual = null;
    }

    /** Botão "abrir" [ctrl-o] — item 11. */
    public void abrir() {
        JFileChooser seletor = criarSeletor("Abrir");

        // Se o usuário cancelar, nada da interface é alterado.
        if (seletor.showOpenDialog(editor.getComponente()) != JFileChooser.APPROVE_OPTION) {
            return;
        }

        File escolhido = seletor.getSelectedFile();

        try (FileReader leitor = new FileReader(escolhido)) {
            // read() monta o documento novo e só troca no final: se der erro no
            // meio, o texto que estava sendo editado continua intacto. Também
            // converte \r\n para \n, senão o \r apareceria como caractere solto.
            editor.getTextArea().read(leitor, null);
        } catch (IOException e) {
            areaMensagem.mostrarMensagem("Erro ao abrir o arquivo: " + e.getMessage());
            return;
        }

        arquivoAtual = escolhido;
        areaMensagem.limpar();
        barraStatus.atualizar(escolhido.getAbsolutePath());
    }

    /** Botão "salvar" [ctrl-s] — item 12. */
    public void salvar() {
        boolean arquivoNovo = (arquivoAtual == null);
        File destino = arquivoAtual;

        if (arquivoNovo) {
            JFileChooser seletor = criarSeletor("Salvar");
            if (seletor.showSaveDialog(editor.getComponente()) != JFileChooser.APPROVE_OPTION) {
                return;
            }
            destino = garantirExtensaoTxt(seletor.getSelectedFile());
        }

        try {
            gravar(destino);
        } catch (IOException e) {
            areaMensagem.mostrarMensagem("Erro ao salvar o arquivo: " + e.getMessage());
            return;
        }

        // O editor não é tocado em nenhum dos dois casos, então o texto que
        // está sendo editado se mantém sozinho.
        arquivoAtual = destino;
        areaMensagem.limpar();

        // Arquivo novo atualiza a barra de status; arquivo já existente mantém.
        if (arquivoNovo) {
            barraStatus.atualizar(destino.getAbsolutePath());
        }
    }

    /** Grava o conteúdo do editor no arquivo, em formato compatível com o Notepad. */
    private void gravar(File destino) throws IOException {
        // O editor guarda as quebras como \n; o Notepad do Windows espera \r\n.
        String texto = editor.getConteudo().replace("\n", "\r\n");

        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(destino))) {
            escritor.write(texto);
        }
    }

    /** Monta o seletor de arquivos aceitando apenas .txt. */
    private JFileChooser criarSeletor(String titulo) {
        JFileChooser seletor = new JFileChooser();
        seletor.setDialogTitle(titulo);
        seletor.setAcceptAllFileFilterUsed(false);
        seletor.setFileFilter(new FileNameExtensionFilter("Arquivos de texto (*.txt)", "txt"));

        if (arquivoAtual != null) {
            seletor.setCurrentDirectory(arquivoAtual.getParentFile());
        }
        return seletor;
    }

    /** Acrescenta .txt quando o usuário digita o nome sem a extensão. */
    private File garantirExtensaoTxt(File arquivo) {
        if (arquivo.getName().toLowerCase().endsWith(".txt")) {
            return arquivo;
        }
        return new File(arquivo.getAbsolutePath() + ".txt");
    }
}
