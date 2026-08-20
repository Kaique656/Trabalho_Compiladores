package interfaceDoComando;

import javax.swing.*;

public class JanelaPrincipal {

    public JFrame jenelaPrincipal () {
        JFrame janela = new JFrame();
        janela.setSize(1500,800);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);

        adicionarBotoes();
        return janela;
    }

    public void adicionarBotoes(){
        Botoes b = new Botoes();
        jenelaPrincipal().add(b.novo())
                .setBounds(10, 80, 300, 125);

    }
}
