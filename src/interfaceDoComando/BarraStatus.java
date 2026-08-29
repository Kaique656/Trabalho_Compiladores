package interfaceDoComando;

import javax.swing.*;

public class BarraStatus {

    private JLabel label;
    private JPanel painel;

    public BarraStatus() {
        label = new JLabel("nenhum arquivo aberto");
        painel = new JPanel();
        painel.add(label);
    }

    public JPanel getComponente() {
        return painel;
    }

    public void atualizar(String caminhoCompleto) {
        label.setText(caminhoCompleto);
    }

    public void limpar() {
        label.setText("");
    }
}