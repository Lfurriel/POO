package aula14.paint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Paint extends JFrame {
    private int lastX, lastY;
    private Color currentColor = Color.BLACK;

    public Paint() {
        setTitle("Paint Program");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria um painel de desenho personalizado
        JPanel drawingPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(currentColor);
                g.drawLine(lastX, lastY, getX(), getY());
            }
        };

        drawingPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                lastX = e.getX();
                lastY = e.getY();
            }
        });

        drawingPanel.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Graphics g = drawingPanel.getGraphics();
                g.setColor(currentColor);
                g.drawLine(lastX, lastY, e.getX(), e.getY());
                lastX = e.getX();
                lastY = e.getY();
            }
        });

        JButton colorButton = new JButton("Escolher cor");
        colorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentColor = JColorChooser.showDialog(Paint.this, "Escolha uma cor", currentColor);
            }
        });

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(drawingPanel, BorderLayout.CENTER);
        contentPane.add(colorButton, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Paint paintProgram = new Paint();
                paintProgram.setVisible(true);
            }
        });
    }
}
