package interfaceDoComando;

import javax.swing.*;
import java.awt.*;

public class Botoes {

    // Tamanho padrão dos ícones
    private static final int TAMANHO_ICONE = 24;

    // Método responsável por carregar e redimensionar os ícones
    private ImageIcon carregarIcone(String caminho) {

        ImageIcon icone = new ImageIcon(caminho);

        Image imagem = icone.getImage();

        Image imagemRedimensionada = imagem.getScaledInstance(
                TAMANHO_ICONE,
                TAMANHO_ICONE,
                Image.SCALE_SMOOTH
        );

        return new ImageIcon(imagemRedimensionada);
    }

    public JButton novo() {
        JButton novo = new JButton("novo [ctrl-n]");
        novo.setBounds(10, 80, 300, 125);
        novo.setIcon(carregarIcone("src/imagens/Novo.png"));
        return novo;
    }

    public JButton abrir() {
        JButton abrir = new JButton("abrir [ctrl-o]");
        abrir.setBounds(10, 80, 300, 125);
        abrir.setIcon(carregarIcone("src/imagens/abrir.png"));
        return abrir;
    }

    public JButton salvar() {
        JButton salvar = new JButton("salvar [ctrl-s]");
        salvar.setBounds(10, 80, 300, 125);
        salvar.setIcon(carregarIcone("src/imagens/Salvar.png"));
        return salvar;
    }

    public JButton copiar() {
        JButton copiar = new JButton("copiar [ctrl-c]");
        copiar.setBounds(10, 80, 300, 125);
        copiar.setIcon(carregarIcone("src/imagens/Copiar.png"));
        return copiar;
    }

    public JButton colar() {
        JButton colar = new JButton("colar [ctrl-v]");
        colar.setBounds(10, 80, 300, 125);
        colar.setIcon(carregarIcone("src/imagens/cola.png"));
        return colar;
    }

    public JButton recortar() {
        JButton recortar = new JButton("recortar [ctrl-x]");
        recortar.setBounds(10, 80, 300, 125);
        recortar.setIcon(carregarIcone("src/imagens/tesoura Background Removed.png"));
        return recortar;
    }

    public JButton compilar() {
        JButton compilar = new JButton("compilar [F7]");
        compilar.setBounds(10, 80, 300, 125);
        compilar.setIcon(carregarIcone("src/imagens/compilar.png"));
        return compilar;
    }

    public JButton equipe() {
        JButton equipe = new JButton("equipe [F1]");
        equipe.setBounds(10, 80, 300, 125);
        equipe.setIcon(carregarIcone("src/imagens/grupos.png"));
        return equipe;
    }
}