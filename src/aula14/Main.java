package aula14;

import javax.swing.*;
import java.awt.*;

public class Main {


//    public static void main(String[] args) {
//        System.out.println("EU AMO A JÚLIA");
//        //new Mouse(); //usa métodos do mouse
//    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
//                new MulticastFrame().setVisible(true);
                new FirstFrame().setVisible(true);
            }
        });
    }
}
