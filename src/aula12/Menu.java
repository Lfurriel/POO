package aula12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

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
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("O Menu");
        menu1.setMnemonic(KeyEvent.VK_A);
        menuBar.add(menu1);

        JMenuItem menuItem = new JMenuItem("A text only menu (um menu de textículo)");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menu1.add(menuItem);

        menuItem = new JMenuItem("Both text and icon (Ambos textos e ícone)", new ImageIcon("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTFJ8NSYDcUBGJTlxxPdtrTxHeagqZrEMvs0g&usqp=CAU"));
        menuItem.setMnemonic(KeyEvent.VK_B);

        menu1.add(menuItem);

//        f.add(menuItem);

        menu1.addSeparator();
        ButtonGroup group = new ButtonGroup();
        JRadioButtonMenuItem rbMenuItem = new JRadioButtonMenuItem("a RADIO BOTÃO DO MEU MENU ITEM");
        rbMenuItem.setSelected(true);

        group.add(rbMenuItem);
        menu1.add(rbMenuItem);
        rbMenuItem = new JRadioButtonMenuItem("oUTRO");
        group.add(rbMenuItem);
        menu1.add(rbMenuItem);

        JCheckBoxMenuItem cbMenuItem = new JCheckBoxMenuItem("cHECK BOX MENU");
        cbMenuItem.setMnemonic(KeyEvent.VK_C);
        menu1.add(cbMenuItem);
        cbMenuItem = new JCheckBoxMenuItem("oUTRO 2");
        cbMenuItem.setMnemonic(KeyEvent.VK_H);
        menu1.add(cbMenuItem);

        JMenu sub = new JMenu("O submenu");
        sub.setMnemonic(KeyEvent.VK_S);

        menuItem =  new JMenuItem("Um item do submenu");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
        sub.add(menuItem);

        menu1.add(sub);
        JMenu menu2 = new JMenu("Outro menu");
        menu2.setMnemonic(KeyEvent.VK_N);

        menuBar.add(menu2);

        f.setJMenuBar(menuBar);
    }
}
