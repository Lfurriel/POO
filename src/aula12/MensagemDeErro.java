package aula12;

import javax.swing.*;
import java.awt.*;

public class MensagemDeErro {
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

        FlowLayout flow = new FlowLayout();
        flow.setAlignment(FlowLayout.CENTER);
        f.setLayout(flow);

        JButton direita = new JButton("hULK DIREITO");
        JButton centro = new JButton("hULK CENTRAL");
        JButton esquerda = new JButton("hULK ESQUERDISTA");

        f.add(esquerda); f.add(centro); f.add(direita);

        JOptionPane.showMessageDialog(f, "Ovos não são verdes, você não é o Hulk", "Insane error", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(f, "Já disse que não é o Hulk", "A plain message", JOptionPane.PLAIN_MESSAGE);

        int opt = JOptionPane.showConfirmDialog(f, "Você entende que não é o Hulk?", "RESPONDA PF", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);



    }
}
