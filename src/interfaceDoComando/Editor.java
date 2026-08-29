package interfaceDoComando;

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
    // instancia a JTextArea e aplica a numeração de linha como borda
    textArea = new JTextArea();
    textArea.setBorder(new NumberedBorder());

    // coloca dentro do JScrollPane com as scrollbars sempre visíveis
    scrollPane = new JScrollPane(textArea);
    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
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
    textArea.setText("");
}

/** Coloca um texto no editor (usado no botão "abrir"). */
public void setConteudo(String texto) {
    textArea.setText(texto);
}

/** Devolve o texto atual do editor (usado no botão "salvar"). */
public String getConteudo() {
    return textArea.getText();
}
}
