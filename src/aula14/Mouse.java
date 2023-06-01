package aula14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Mouse extends JFrame {

    private JLabel positionLabel; // Rótulo para exibir a posição do mouse

    public Mouse() {

        setTitle("Mouse Events Example");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        positionLabel = new JLabel("Position: "); // Rótulo inicializado com "Position: "

        add(positionLabel, BorderLayout.SOUTH); // Adiciona o rótulo ao painel sul (parte inferior) do JFrame

        // Adiciona os ouvintes de mouse ao JFrame

        addMouseListener(new MouseListener()); // Ouvinte para eventos de clique do mouse

        addMouseMotionListener(new MouseMotionListener()); // Ouvinte para eventos de movimento do mouse



        setSize(300, 200); // Define o tamanho do JFrame
        setResizable(false);

        setVisible(true); // Torna o JFrame visível

    }

    // Classe interna anônima que estende MouseAdapter e implementa MouseListener

    class MouseListener extends MouseAdapter {

        // Método chamado quando o mouse é clicado

        public void mouseClicked(MouseEvent e) {

            int x = e.getX(); // Obtém a posição x do clique

            int y = e.getY(); // Obtém a posição y do clique

            int clickCount = e.getClickCount(); // Obtém o número de cliques

            int button = e.getButton(); // Obtém o botão do mouse que foi clicado

            System.out.println("Mouse clicked at (" + x + ", " + y + ")"); // Imprime as coordenadas do clique

            System.out.println("Click count: " + clickCount); // Imprime o número de cliques

            System.out.println("Button: " + button); // Imprime o botão do mouse

        }

    }

    // Classe interna anônima que estende MouseMotionAdapter e implementa MouseMotionListener

    class MouseMotionListener extends MouseMotionAdapter {

        // Método chamado quando o mouse é movido

        public void mouseMoved(MouseEvent e) {

            int x = e.getX(); // Obtém a posição x do movimento

            int y = e.getY(); // Obtém a posição y do movimento

            positionLabel.setText("Position: (" + x + ", " + y + ")"); // Atualiza o texto do rótulo com a posição do mouse

        }

    }

}