package aula11;

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

        String []colunas = {"Nome", "Esporte", "Idade", "Vegetariano"};

        Object[][] dados = {
                {"Juloia", "Halterofilismo", 21, false },
                {"Pedrogás", "Corredor", 57, true },
                {"Scarancio", "Rato de academia", 19, false },
                {"Biancalva", "Nado sincronizado", 19, false }
        };

        JTable tabela = new JTable(dados, colunas);
        tabela.setPreferredScrollableViewportSize(new Dimension(500, 80));
        tabela.setFillsViewportHeight(true);

        JScrollPane scrollPane = new JScrollPane(tabela);
        f.add(scrollPane);
    }
}
