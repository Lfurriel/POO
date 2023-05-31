package aula12;

import javax.swing.*;
import java.awt.*;


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
//            label.setVerticalTextPosition(JLabel.BOTTOM);
//            label.setHorizontalTextPosition(JLabel.CENTER);
        f.setLayout(new FlowLayout());
        DefaultListModel listModel = new DefaultListModel();
        listModel.addElement("Mercúrio");
        listModel.addElement("Venus");
        listModel.addElement("Terra");
        listModel.addElement("Marte");
        listModel.addElement("Júpiter");
        listModel.addElement("Saturno");
        listModel.addElement("Urano");
        listModel.addElement("Netuno");
        listModel.addElement("Plutão");

        JList list = new JList(listModel);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setLayoutOrientation(JList.VERTICAL_WRAP);

        f.add(list);
        JScrollPane scroll = new JScrollPane(list);
        f.add(scroll);
        int index = list.getSelectedIndex();
        listModel.remove(index);
        System.out.println("List size: " + listModel.getSize());
    }
}
