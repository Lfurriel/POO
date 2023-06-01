package aula14;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleFrame extends JFrame implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
    }
}
