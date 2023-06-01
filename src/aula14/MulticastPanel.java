package aula14;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MulticastPanel extends JPanel implements ActionListener {

    private int contaJanela = 0;
    private JButton botaoFecha = new JButton("FECHA TUDO");
    private JButton botaoNova = new JButton("NOVA JANELA");

    public MulticastPanel(){

        this.add(botaoFecha);
        this.add(botaoNova);

        botaoNova.addActionListener(this);
        botaoFecha.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == botaoNova) {
            SimpleFrame f = new SimpleFrame();
            contaJanela++;
            f.setTitle("Eu amo a Júlia " + contaJanela + " vezes");
            f.setBounds(30*contaJanela, 30*contaJanela, 200, 200);
            f.setVisible(true);

            botaoFecha.addActionListener(f);
        } else {
            contaJanela = 0;

        }

    }
}
