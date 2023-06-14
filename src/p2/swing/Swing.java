package p2.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing {

   private JFrame frame = new JFrame("Titulo");
   private JPanel painel;

    JButton azul = new JButton("Botão Azul");
    JButton amarelo = new JButton("Botão Amarelo");
    JButton alerta = new JButton("Botão Aviso");

   public Swing() {
       JLabel label = new JLabel("Esse é um label");
       JTextField textField = new JTextField("txt field", 30);
       painel = new JPanel();
       painel.add(label);
       painel.add(textField);

       painel.setVisible(true);
       frame.add(painel);


       painel = new JPanel();

       alerta.addActionListener(new BotoesListener());
       azul.addActionListener(new BotoesListener());
       amarelo.addActionListener(new BotoesListener());

       painel.add(alerta);
       painel.add(azul);
       painel.add(amarelo);
       frame.add(painel);

       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(300, 200);
       frame.setVisible(true);
       frame.setLayout(new FlowLayout(FlowLayout.CENTER));


   }

   class BotoesListener implements ActionListener {

       @Override
       public void actionPerformed(ActionEvent e) {
           if (e.getSource() == azul)
               painel.setBackground(Color.BLUE);
           else if (e.getSource() == amarelo)
               painel.setBackground(Color.YELLOW);
           else if (e.getSource() == alerta) {
               JOptionPane.showMessageDialog(painel, "VOCÊ FOI AVISADO");
           }
       }
   }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Swing());
    }

}
