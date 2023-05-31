package aula12;

import javax.swing.*;
import java.awt.*;

public class Paineis {
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
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        panel1.setBackground(Color.PINK);
        panel1.setPreferredSize(new Dimension(200, 100));

        panel2.setBackground(Color.ORANGE);
        panel2.setPreferredSize(new Dimension(200, 100));

        panel2.setBorder(BorderFactory.createTitledBorder("Painelzin"));

        f.add(panel1);
        f.add(panel2);
    }
}
