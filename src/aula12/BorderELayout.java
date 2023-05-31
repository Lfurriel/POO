package aula12;


import javax.swing.*;
import java.awt.*;

public class BorderELayout {

    public static void main(String[] args) {
//        try {
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (InstantiationException e) {
//            throw new RuntimeException(e);
//        } catch (IllegalAccessException e) {
//            throw new RuntimeException(e);
//        } catch (UnsupportedLookAndFeelException e) {
//            throw new RuntimeException(e);
//        }

//
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if("Nimbus".equals(info.getName())) {
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (InstantiationException e) {
                    throw new RuntimeException(e);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (UnsupportedLookAndFeelException e) {
                    throw new RuntimeException(e);
                }
                break;
            }
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

//        BorderLayout border = new BorderLayout(5,5);
//        f.setLayout(border);

//        String[] names = {"Hide North", "Hide South", "Hide East", "Hide West", "Hide Center"};
//
//        JButton[] buttons = new JButton[names.length];
//
//        for (int count = 0; count < names.length; count ++) {
//            buttons[count] = new JButton(names[count]);
//        }
//        f.add(buttons[0], BorderLayout.NORTH);
//        f.add(buttons[1], BorderLayout.SOUTH);
//        f.add(buttons[2], BorderLayout.EAST);
//        f.add(buttons[3], BorderLayout.WEST);
//        f.add(buttons[4], BorderLayout.CENTER);

        GridLayout grid = new GridLayout(2,3,5,5);
        f.setLayout(grid);

        String[] names1 = {"yi", "er", "san", "si", "wu", "liu"};
        JButton[] buttons1 = new JButton[names1.length];

        for (int i = 0; i < names1.length; i ++) {
            buttons1[i] = new JButton(names1[i]);
            f.add(buttons1[i]);
        }
    }
}
