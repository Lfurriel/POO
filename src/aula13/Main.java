package aula13;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BOTÕES");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Listener panel = new Listener();
        //Foco panel = new Foco();
        Teclas panel = new Teclas();
        frame.add(panel);
        frame.addKeyListener(panel);

        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
