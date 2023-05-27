package aula11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class ComboBox {
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
        JLabel label = new JLabel("texto da juju");
//            label.setVerticalTextPosition(JLabel.BOTTOM);
//            label.setHorizontalTextPosition(JLabel.CENTER);
        f.add(label);
        f.setLayout(new FlowLayout());
        JTextField tf_field1, tf_field2, tf_field3;
        tf_field1 = new JTextField(10);
        tf_field2 = new JTextField("Enter nome");
        tf_field3 = new JTextField("Não edita");
        tf_field3.setEditable(false);
        f.add(tf_field2);
        f.add(tf_field3);
        f.add(tf_field1);
        JPasswordField password = new JPasswordField("Escondidinho");
        f.add(password);

        JButton b1, b2, b3;
        b1 = new JButton("direita");
        b1.setVerticalTextPosition(AbstractButton.CENTER);
        b1.setHorizontalTextPosition(AbstractButton.LEADING);
        b1.setMnemonic(KeyEvent.VK_D);

        b2 = new JButton("meio");
        b2.setVerticalTextPosition(AbstractButton.BOTTOM);
        b2.setHorizontalTextPosition(AbstractButton.CENTER);
        b2.setMnemonic(KeyEvent.VK_M);

        b3 = new JButton("esquerda");
        b3.setMnemonic(KeyEvent.VK_E);
        b3.setEnabled(false);
        f.add(b1);
        f.add(b2);
        f.add(b3);


        JRadioButton birdButton = new JRadioButton("bird");
        birdButton.setMnemonic(KeyEvent.VK_B);
        birdButton.setSelected(true);

        f.add(birdButton);
        JRadioButton catButton = new JRadioButton("cat");
        birdButton.setMnemonic(KeyEvent.VK_B);
        birdButton.setSelected(true);

        f.add(catButton);
        JRadioButton dogButton = new JRadioButton("dog");
        birdButton.setMnemonic(KeyEvent.VK_B);
        birdButton.setSelected(true);
        f.add(dogButton);

        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(birdButton);
        radioGroup.add(dogButton);
        radioGroup.add(catButton);

        if (birdButton.isSelected()) {
            System.out.println("Bird button selected");
        } else if (catButton.isSelected()) {
            System.out.println("Cat button is selected");
        } else {
            System.out.println("Dog button is selected");
        }

        radioGroup.clearSelection();

        String[] animais = {"Cachorro", "Cavalo", "Gato", "Coelho"};
        JComboBox comboBox = new JComboBox<>(animais);
        comboBox.setSelectedIndex(2);
        f.add(comboBox);
    }
}
