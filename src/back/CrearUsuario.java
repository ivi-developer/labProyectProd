package back;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CrearUsuario {
    private JPanel panelCrear;
    private JPasswordField contraUsu;
    private JTextField nombreUsu;
    private JButton crearUsuarioButton;
    private JPasswordField contraConfirmar;


    public CrearUsuario() {
        JFrame window = new JFrame();

        window.setTitle("Login");
        window.setContentPane(panelCrear);
        window.setSize(1250, 750);
        //setMaximumSize(new Dimension(500, 83));
        window.setResizable(false);
//        setModal(true);
//        setLocationRelativeTo(null);
//        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        window.setVisible(true);

        crearUsuarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Admin admin = new Admin();
                String nombreU = nombreUsu.getText();
                String contrasU = String.valueOf(contraUsu.getPassword());
                String contraConfir = String.valueOf(contraConfirmar.getPassword());
                Player jugador= admin.crearPlayer(nombreU, contrasU, contraConfir);
                 if(jugador != null) {
                     window.dispose(); /// hace el cambio de ventana medio hardcore pero bue XD
                     //window.setVisible(false);
                     new MenuU(jugador);
                 }
            }
        });

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

