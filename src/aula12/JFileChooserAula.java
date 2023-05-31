package aula12;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.File;

public class JFileChooserAula {
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

        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF images", "jpg", "gif");
        chooser.setFileFilter(filter);
//        int returnVal = chooser.showOpenDialog(f);
        int returnVal = chooser.showSaveDialog(f);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            System.out.println("You choose: " + selectedFile.getName());
        }
    }
}
