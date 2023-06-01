package aula14;

import javax.swing.*;
import java.awt.*;

public class FirstFrame extends JFrame {
    public FirstFrame(){
        setTitle("Oi");
        setSize(500, 590);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.add(new MyWorkPanel());
    }

}
