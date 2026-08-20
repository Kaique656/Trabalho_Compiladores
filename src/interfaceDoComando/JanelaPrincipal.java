package interfaceDoComando;

import javax.swing.*;

public class JanelaPrincipal {

    private JFrame janela;
    private JPanel painel;

    public JanelaPrincipal() {

        janela = new JFrame("Interface do Comando");
        janela.setSize(1500, 800);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);

        painel = new JPanel();
        painel.setLayout(null);

        janela.add(painel);

        adicionarBotoes();

        janela.setVisible(true);
    }

    public void adicionarBotoes() {

        Botoes b = new Botoes();

        JButton novo = b.novo();
        novo.setBounds(10, 10, 150, 50);

        JButton abrir = b.abrir();
        abrir.setBounds(10, 70, 150, 50);

        JButton salvar = b.salvar();
        salvar.setBounds(10, 130, 150, 50);

        JButton copiar = b.copiar();
        copiar.setBounds(10, 190, 150, 50);

        JButton colar = b.colar();
        colar.setBounds(10, 250, 150, 50);

        JButton recortar = b.recortar();
        recortar.setBounds(10, 310, 150, 50);

        JButton compilar = b.compilar();
        compilar.setBounds(10, 370, 150, 50);

        JButton equipe = b.equipe();
        equipe.setBounds(10, 430, 150, 50);

        painel.add(novo);
        painel.add(abrir);
        painel.add(salvar);
        painel.add(copiar);
        painel.add(colar);
        painel.add(recortar);
        painel.add(compilar);
        painel.add(equipe);
    }

    public static void main(String[] args) {
        new JanelaPrincipal();
    }
}