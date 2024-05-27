package front;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inicio extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton cancelButton;

    public Inicio() {
        setTitle("Inicio de Sesión");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        usernameField = new JTextField(15);
        passwordField = new JPasswordField(15);
        loginButton = new JButton("Iniciar sesión");
        cancelButton = new JButton("Cancelar");

        panel.add(new JLabel("Usuario:"));
        panel.add(usernameField);
        panel.add(new JLabel("Contraseña:"));
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(cancelButton);

        add(panel);
        setVisible(true);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (username.equals("admin") && password.equals("admin")) {
                    JOptionPane.showMessageDialog(Inicio.this, "Inicio de sesión exitoso");
                    // Aquí puedes abrir una nueva ventana o realizar otras acciones después del inicio de sesión exitoso
                } else {
                    JOptionPane.showMessageDialog(Inicio.this, "Usuario o contraseña incorrectos");
                }
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}