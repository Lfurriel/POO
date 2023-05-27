package aula11;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Planetas {
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

        DefaultListModel planetas = new DefaultListModel();
        planetas.addElement("Mercúrio");
        planetas.addElement("Vênus");
        planetas.addElement("Terra");
        planetas.addElement("Marte");
        planetas.addElement("Júpiter");
        planetas.addElement("Saturno");
        planetas.addElement("Urano");
        planetas.addElement("Netuno");

        JList list = new JList(planetas);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setLayoutOrientation(JList.VERTICAL_WRAP);

        f.add(list);
        JScrollPane scroll = new JScrollPane(list);
        f.add(scroll);
//        int index = list.getSelectedIndex();
//        planetas.remove(index);

    }
}
