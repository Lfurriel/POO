package aula12;

import javax.swing.*;
import java.awt.*;

public class Tabela {
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

        String[] col = {"Name", "Sport", "Years", "Vegetarian"};
        Object[][] data = {
                {"Pedro", "Corrida", new Integer(52),new Boolean(true)},
                {"Gabriel", "Handball", new Integer(19), new Boolean(false)},
                {"Lucas", "Kung Fu", new Integer(21),  new Boolean(false)},
                {"Bianca", "Atletismo", new Integer(19),  new Boolean(false)},
                {"Júlia", "Halterofilismo", new Integer(21),  new Boolean(false)}
        };

        JTable table = new JTable(data, col);
        table.setPreferredScrollableViewportSize(new Dimension(500, 80));
        table.setFillsViewportHeight(true);

        JScrollPane scroll = new JScrollPane(table);
        f.add(scroll);
    }
}
