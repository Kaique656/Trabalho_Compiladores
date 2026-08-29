package interfaceDoComando;

import javax.swing.*;

/**
 * RESPONSÁVEL: Kaique
 *
 * Barra de ferramentas (item 9 do PDF).
 * Cada método só cria e devolve o JButton pronto -- a lógica de cada
 * ação (o que acontece quando o botão é clicado) fica nas classes de
 * ação (AcoesArquivo, AcoesEdicao, AcoesCompilador) e é conectada
 * lá na JanelaPrincipal, não aqui.
 */
public class Botoes {

    public JButton novo() {
        JButton novo = new JButton("novo [ctrl-n]");
        novo.setBounds(10, 80, 300, 125);
        return novo;
    }

    public JButton abrir() {
        JButton abrir = new JButton("abrir [ctrl-o]");
        abrir.setBounds(10, 80, 300, 125);
        return abrir;
    }

    public JButton salvar() {
        JButton salvar = new JButton("salvar [ctrl-s]");
        salvar.setBounds(10, 80, 300, 125);
        return salvar;
    }

    public JButton copiar() {
        JButton copiar = new JButton("copiar [ctrl-c]");
        copiar.setBounds(10, 80, 300, 125);
        return copiar;
    }

    public JButton colar() {
        JButton colar = new JButton("colar [ctrl-v]");
        colar.setBounds(10, 80, 300, 125);
        return colar;
    }

    public JButton recortar() {
        JButton recortar = new JButton("recortar [ctrl-x]");
        recortar.setBounds(10, 80, 300, 125);
        return recortar;
    }

    public JButton compilar() {
        JButton compilar = new JButton("compilar [F7]");
        compilar.setBounds(10, 80, 300, 125);
        return compilar;
    }

    public JButton equipe() {
        JButton equipe = new JButton("equipe [F1]");
        equipe.setBounds(10, 80, 300, 125);
        return equipe;
    }

    // TODO (Kaique): adicionar ícone em cada botão (item 9 exige
    // ícone + nome completo + atalho), ex:
    // novo.setIcon(new ImageIcon("caminho/para/icone.png"));
}