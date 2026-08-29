package interfaceDoComando;

import javax.swing.*;

/**
 * RESPONSÁVEL: Kaique
 *
 * Barra de status (item 8 do PDF).
 * - Deve mostrar a pasta e o nome do arquivo aberto.
 * - Tamanho m x 25, onde m é a largura máxima visível na horizontal.
 */
public class BarraStatus {

    private JLabel label;
    private JPanel painel;

    public BarraStatus() {
        // TODO: instanciar label (texto inicial vazio ou "nenhum arquivo aberto")
        // TODO: instanciar painel (JPanel) com o label dentro,
        //       altura fixa de 25 -> painel.setPreferredSize(new Dimension(largura, 25))
    }

    public JPanel getComponente() {
        return painel;
    }

    /** Mostra pasta + nome do arquivo (usado por "abrir" e "salvar" quando é arquivo novo). */
    public String  atualizar(String caminhoCompleto) {
        if (label.getText().isEmpty()){
            return "2";
        }
        label.setText(caminhoCompleto);
        return null;
    }

    /** Apaga o texto e "esquece" o arquivo (usado no botão "novo"). */
    public void limpar() {
        TODO: label.setText("");
    }
}
