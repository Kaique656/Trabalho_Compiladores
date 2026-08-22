package interfaceDoComando;//teste

import javax.swing.*;

/**
 * RESPONSÁVEL: Amanda
 *
 * Área de edição de programas (item 4 e 5 do PDF).
 * - Deve mostrar número da linha à esquerda, começando em 1 (não editável).
 *   -> usar o NumberedBorder.java que a professora forneceu.
 * - Deve ter scrollbars horizontal e vertical SEMPRE visíveis, mesmo vazio.
 */
public class Editor {

    private JTextArea textArea;
    private JScrollPane scrollPane;

    public Editor() {
        // TODO: instanciar textArea, aplicar new NumberedBorder() como borda
        // TODO: colocar dentro de um JScrollPane com
        //       setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS)
        //       setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS)
    }

    /** Devolve o componente pronto (com scroll) pra JanelaPrincipal encaixar no layout. */
    public JScrollPane getComponente() {
        return scrollPane;
    }

    /** Devolve a JTextArea "crua", útil pra AcoesArquivo (abrir/salvar) e AcoesEdicao (copiar/colar/recortar). */
    public JTextArea getTextArea() {
        return textArea;
    }

    /** Apaga todo o conteúdo do editor (usado no botão "novo"). */
    public void limpar() {
        // TODO: textArea.setText("");
    }

    /** Coloca um texto no editor (usado no botão "abrir"). */
    public void setConteudo(String texto) {
        // TODO: textArea.setText(texto);
    }

    /** Devolve o texto atual do editor (usado no botão "salvar"). */
    public String getConteudo() {
        // TODO: return textArea.getText();
        return null;
    }
}
