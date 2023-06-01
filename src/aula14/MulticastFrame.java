package aula14;

import javax.swing.*;
import java.awt.*;

public class MulticastFrame extends JFrame {
        public MulticastFrame() {
            this.setTitle("Conta");
            this.setSize(300, 300);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);

            Container container = this.getContentPane();
            container.add(new MulticastPanel());
        }
    }