package aula12;

import javax.swing.*;
import java.awt.*;

public class JComboBox {
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

        String[] pet = {"Pig", "Dog", "Frog", "Bunny", "Cat"};
        javax.swing.JComboBox petCombo = new javax.swing.JComboBox(pet);
        petCombo.setSelectedIndex(4);
        f.add(petCombo);
        String petName = (String)petCombo.getSelectedItem();
    }
}
