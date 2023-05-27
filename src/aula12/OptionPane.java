package aula12;

import javax.swing.*;
import java.awt.*;

public class OptionPane {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
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

        JOptionPane.showMessageDialog(f, "Eggs are not supposed to be green", "Confirm?", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(f, "ERRO: Eggs are not supposed to be green", "ERROOO", JOptionPane.ERROR_MESSAGE);

        int opt = JOptionPane.showConfirmDialog(f, "Você é burro", "Pesquisa", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    }
}
