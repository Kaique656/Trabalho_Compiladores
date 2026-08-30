package interfaceDoComando;

import java.awt.*;
import javax.swing.*;

public class Botoes {

    // Tamanho padrão dos ícones
    private static final int TAMANHO_ICONE = 24;

    // Método responsável por carregar e redimensionar os ícones.
    // Usa getClass().getResource(...) em vez de um caminho de arquivo comum,
    // porque assim funciona tanto rodando pelo VS Code quanto de dentro do
    // .jar exportado (onde não existe mais uma pasta "src" no disco).
    private ImageIcon carregarIcone(String caminho) {
        java.net.URL url = getClass().getResource(caminho);
        ImageIcon icone = new ImageIcon(url);
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
        novo.setIcon(carregarIcone("/imagens/Novo.png"));
        return novo;
    }

    public JButton abrir() {
        JButton abrir = new JButton("abrir [ctrl-o]");
        abrir.setBounds(10, 80, 300, 125);
        abrir.setIcon(carregarIcone("/imagens/abrir.png"));
        return abrir;
    }

    public JButton salvar() {
        JButton salvar = new JButton("salvar [ctrl-s]");
        salvar.setBounds(10, 80, 300, 125);
        salvar.setIcon(carregarIcone("/imagens/Salvar.png"));
        return salvar;
    }

    public JButton copiar() {
        JButton copiar = new JButton("copiar [ctrl-c]");
        copiar.setBounds(10, 80, 300, 125);
        copiar.setIcon(carregarIcone("/imagens/Copiar.png"));
        return copiar;
    }

    public JButton colar() {
        JButton colar = new JButton("colar [ctrl-v]");
        colar.setBounds(10, 80, 300, 125);
        colar.setIcon(carregarIcone("/imagens/cola.png"));
        return colar;
    }

    public JButton recortar() {
        JButton recortar = new JButton("recortar [ctrl-x]");
        recortar.setBounds(10, 80, 300, 125);
        recortar.setIcon(carregarIcone("/imagens/tesoura Background Removed.png"));
        return recortar;
    }

    public JButton compilar() {
        JButton compilar = new JButton("compilar [F7]");
        compilar.setBounds(10, 80, 300, 125);
        compilar.setIcon(carregarIcone("/imagens/compilar.png"));
        return compilar;
    }

    public JButton equipe() {
        JButton equipe = new JButton("equipe [F1]");
        equipe.setBounds(10, 80, 300, 125);
        equipe.setIcon(carregarIcone("/imagens/grupos.png"));
        return equipe;
    }
}