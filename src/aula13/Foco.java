package aula13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Foco extends JPanel {
    private JButton botaoAmarelo = new JButton("AMARELO");
    private JButton botaoAzul = new JButton("AZUL");
    private JButton botaoVermelho = new JButton("VERMELHO");

    class FocusListener extends FocusAdapter {
        @Override
        public void focusGained(FocusEvent e) {
            Object src = e.getComponent();
            if(src == botaoAmarelo) {
                System.out.println("Botão amarelo");
                setBackground(Color.YELLOW);
            } else if (src == botaoAzul) {
                System.out.println("Botão azul");
                setBackground(Color.BLUE);
            } else if (src == botaoVermelho) {
                System.out.println("Botão vermelho");
                setBackground(Color.RED);
            } else {
                System.out.println("Deu erro");
                setBackground(Color.MAGENTA);
            }
        }
    }

    public Foco() {
        this.add(botaoAmarelo);
        this.add(botaoAzul);
        this.add(botaoVermelho);

        botaoAmarelo.addFocusListener(new FocusListener());
        botaoAzul.addFocusListener(new FocusListener());
        botaoVermelho.addFocusListener(new FocusListener());
    }
}
