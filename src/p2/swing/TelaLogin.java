package p2.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaLogin extends JFrame {
    private final JLabel usuarioLabel = new JLabel("Usuário");
    private final JLabel senhaLabel = new JLabel("Senha");
    private JTextField usuario = new JTextField(20);
    private JPasswordField senha = new JPasswordField(20);

    private JButton login = new JButton("LOGIN");

    public TelaLogin() {
        setTitle("TELA LOGIN");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.CENTER));

        add(usuarioLabel);
        add(usuario);

        add(senhaLabel);
        add(senha);

        add(login, BorderLayout.SOUTH);

        login.addActionListener(new LoginButaoListener());
        senha.addKeyListener(new LoginEnterListener());
    }


    class LoginButaoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            login();
        }
    }

    class LoginEnterListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                login();
            }
        }
    }

    public void login() {
        StringBuilder senhaStr = new StringBuilder();
        for (char c : senha.getPassword())
            senhaStr.append(c);
        if (usuario.getText().equals("") || senhaStr.toString().equals(""))
            System.out.println("PREENCHA OS CAMPOS");

        else if (usuario.getText().equals("Fufurri") && senhaStr.toString().equals("123"))
            System.out.println("Logou");
        else
            System.out.println("Não logou");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaLogin();
            }
        });
    }

}
