package interfaceDoComando;

import javax.swing.*;

public class Botoes {


    public JButton novo() {
        JButton salvar = new JButton("novo [ctrl-n]");
        salvar.setBounds(10, 80, 300, 125);

        return salvar;
    }

    public JButton abrir() {
        JButton abrir = new JButton("abrir[ctrl-o]");
        abrir.setBounds(10, 80, 300, 125);

        return abrir;
        }
    public JButton salvar (){
        JButton salvar = new JButton("salvar [ctrl-s]");
        salvar.setBounds(10, 80, 300, 125);
        return salvar;
    }

    public JButton copiar (){
        JButton copiar = new JButton("copiar [ctrl-c]");
        copiar.setBounds(10, 80, 300, 125);
        return copiar;
    }

    public JButton colar (){
        JButton colar = new JButton("colar [ctrl-v]");
        colar.setBounds(10, 80, 300, 125);
        return colar;
    }

    public JButton recortar (){
        JButton recortar = new JButton("recortar [ctrl-x]");
        recortar.setBounds(10, 80, 300, 125);
        return recortar;
    }

    public JButton compilar (){
        JButton compilar = new JButton("F7");
        compilar.setBounds(10, 80, 300, 125);
        return compilar;
    }

    public JButton equipe (){
        JButton equipe = new JButton("F1");
        equipe.setBounds(10, 80, 300, 125);
        return equipe;
    }


}
