package aula11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.security.Key;

public class Menu {
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

        JMenuBar  menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("O Menu");
        menu1.setMnemonic(KeyEvent.VK_A);
        menuBar.add(menu1);

        JMenuItem menuItem = new JMenuItem("Menu de texto");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.ALT_MASK));
        menu1.add(menuItem);

        menuItem = new JMenuItem("Texto e ícone", new ImageIcon("data:image/png;base64,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"));
        menuItem.setMnemonic(KeyEvent.VK_B);

        menu1.add(menuItem);

        menu1.addSeparator();
        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButtonMenuItem rbMenu = new JRadioButtonMenuItem("Menu vom botao radio");
        rbMenu.setSelected(true);
        buttonGroup.add(rbMenu);
        menu1.add(rbMenu);

        rbMenu = new JRadioButtonMenuItem("Outro");
        buttonGroup.add(rbMenu);
        menu1.add(rbMenu);

        JCheckBoxMenuItem cbMenu = new JCheckBoxMenuItem("Menu e checkbox");
        cbMenu.setMnemonic(KeyEvent.VK_C);
        menu1.add(cbMenu);

        cbMenu = new JCheckBoxMenuItem("Outro dois");
        cbMenu.setMnemonic(KeyEvent.VK_H);
        menu1.add(cbMenu);

        JMenu submenu = new JMenu("Submenu");
        submenu.setMnemonic(KeyEvent.VK_S);

        menuItem = new JMenuItem("sei lá");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
        submenu.add(menuItem);

        menuItem = new JMenuItem("Outro menu Item");
        submenu.add(menuItem);

        menu1.add(submenu);

        JMenu menu2 = new JMenu("Outro menu");
        menu2.setMnemonic(KeyEvent.VK_N);

        menuBar.add(menu2);

        f.setJMenuBar(menuBar);
    }
}
