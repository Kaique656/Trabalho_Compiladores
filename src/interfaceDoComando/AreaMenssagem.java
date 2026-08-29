package interfaceDoComando;

import javax.swing.*;

/**
 * RESPONSÁVEL: Amanda
 *
 * Área para visualização das mensagens (item 6 e 7 do PDF). - NÃO pode ser
 * editável. - Deve ter scrollbars horizontal e vertical SEMPRE visíveis, mesmo
 * vazia. - Só a mensagem correspondente à última ação deve aparecer (ou seja,
 * toda ação de compilar/equipe deve limpar antes de escrever a nova mensagem).
 */
public class AreaMenssagem {

    private JTextArea textArea;
    private JScrollPane scrollPane;

    public AreaMenssagem() {
        textArea = new JTextArea();
        textArea.setEditable(false);

        scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    }

    public JScrollPane getComponente() {
        return scrollPane;
    }

    /**
     * Limpa e escreve uma nova mensagem (usado por compilar, equipe, novo,
     * abrir, salvar).
     */
    public void mostrarMensagem(String texto) {
        textArea.setText(texto);
    }

    /**
     * Apaga o conteúdo (usado no botão "novo" e sempre que
     * abrir/salvar/compilar rodar).
     */
    public void limpar() {
        textArea.setText("");
    }
}
