package aula14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWorkPanel extends JPanel {
    private JButton edt = new JButton("EDT");
    private JButton sw = new JButton("SwingWorker");

    public MyWorkPanel() {
        this.add(edt);
        this.add(sw);
        edt.addActionListener(new ButtonListener());
        sw.addActionListener(new ButtonListener());
    }

    class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Object src = e.getSource();
            int sleepTime = 500;
            if(src == edt) {
                setBackground(Color.PINK);
                try {
                    Thread.sleep(sleepTime);
                    JOptionPane.showMessageDialog(null, "Finished at: " + sleepTime, "event dispatch", JOptionPane.INFORMATION_MESSAGE);

                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            } else {
                setBackground(Color.magenta);

                ButtonWorker bw = new ButtonWorker(sleepTime);
                bw.execute();
            }
        }
    }


}
