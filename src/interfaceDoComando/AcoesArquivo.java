package interfaceDoComando;

import java.io.File;
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
        // TODO: editor.limpar();
        // TODO: areaMensagem.limpar();
        // TODO: barraStatus.limpar();
        // TODO: arquivoAtual = null;
    }

    /** Botão "abrir" [ctrl-o] — item 11. */
    public void abrir() {
        // TODO: JFileChooser com filtro .txt

        JFileChooser jf = new JFileChooser();

        FileNameExtensionFilter fileNameExtensionFilter =
                new FileNameExtensionFilter("Arquivos de texto (*.txt)\", \"txt");



        // TODO: if (usuário selecionou um arquivo) {
        //           ler conteúdo do arquivo -> editor.setConteudo(texto);
        //           areaMensagem.limpar();
        //           barraStatus.atualizar(caminhoCompleto);
        //           arquivoAtual = arquivoEscolhido;
        //       }
        //       // se cancelar, NÃO mexe em nada (mantém estado atual)
    }

    /** Botão "salvar" [ctrl-s] — item 12. */
    public void salvar() {
        // TODO: if (arquivoAtual == null) {
        //           // arquivo novo -> abrir JFileChooser pra escolher local/nome
        //           // salvar editor.getConteudo() nesse arquivo
        //           // barraStatus.atualizar(caminhoCompleto)
        //       } else {
        //           // salvar direto no arquivoAtual (sobrescrever)
        //           // barraStatus NÃO muda (mantém)
        //       }
        // TODO: areaMensagem.limpar(); (sempre, nos dois casos)
    }
}
