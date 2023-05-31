package aula13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Trata as chamadas de botão
 */
public class Listener extends JPanel implements ActionListener {

    private JButton botaoAmarelo = new JButton("AMARELO");
    private JButton botaoAzul = new JButton("AZUL");
    private JButton botaoVermelho = new JButton("VERMELHO");

    public Listener() {
        this.add(botaoAmarelo);
        this.add(botaoAzul);
        this.add(botaoVermelho);

        botaoAmarelo.addActionListener(this); //this serve para mostrar que esse objeto mesmo que trata os events
        botaoAzul.addActionListener(this);
        botaoVermelho.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object src = e.getSource();

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
