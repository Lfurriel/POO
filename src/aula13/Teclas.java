package aula13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Teclas extends JPanel implements KeyListener {
    private JButton botaoAmarelo = new JButton("AMARELO");

    public Teclas() {
        //botaoAmarelo.addKeyListener(this);
        //this.add(botaoAmarelo);
    }


    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {

        System.out.println("A");
        if (e.getKeyCode() == KeyEvent.VK_R) {
            setBackground(Color.RED);
        } else if (e.getKeyCode() == KeyEvent.VK_M) {
            setBackground(Color.MAGENTA);
        } else if (e.getKeyCode() == KeyEvent.VK_B) {
            setBackground(Color.BLUE);
        } else if (e.getKeyCode() == KeyEvent.VK_O) {
            setBackground(Color.ORANGE);
        } else if (e.getKeyCode() == KeyEvent.VK_G) {
            setBackground(Color.GREEN);
        } else if (e.getKeyCode() == KeyEvent.VK_P) {
            setBackground(Color.PINK);
        }
    }


    @Override
    public void keyReleased(KeyEvent e) {

    }
}
