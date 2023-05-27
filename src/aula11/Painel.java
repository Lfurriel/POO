package aula11;

import javax.swing.*;
import javax.swing.plaf.BorderUIResource;
import java.awt.*;

public class Painel {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() { // garante que o código relacionado a criação e exibição seja executado na EDT
                                       public void run() {
                                           createAndShowGUI();
                                       }
                                   }
        );
    }

    private static void createAndShowGUI() {
        JFrame f = new JFrame("Swing hello world");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(250, 250);
        f.setVisible(true);
        f.setLayout(new FlowLayout());

        JPanel painel1 = new JPanel();
        JPanel painel2 = new JPanel();

        painel1.setBackground(Color.MAGENTA);
        painel1.setPreferredSize(new Dimension(100, 100));

        painel2.setBackground(Color.ORANGE);
        painel2.setPreferredSize(new Dimension(200, 200));
        painel2.setBorder(BorderFactory.createTitledBorder("Laranja"));

        f.add(painel1);
        f.add(painel2);


    }
}

