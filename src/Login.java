import back.Admin;
import back.MenuU;
import back.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JDialog{
    protected JTextField tfUsuario;
    protected JPasswordField pfContraseña;
    private JButton btnInicSesion;
    private JButton btnCrearUsuario;
    private JPanel loginPanel;
    Controladora controladora = new Controladora(this);



  /*  public static void main(String[] args)
    {
        Login login= new Login();

    }
*/

    public  Login ()
    {

        JFrame window = new JFrame();

        window.setTitle("Login");
        window.setContentPane(loginPanel);
        window.setSize(1250,750);
        //setMaximumSize(new Dimension(500, 83));
        window.setResizable(false);
        setModal(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        window.setVisible(true);

        btnInicSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario= tfUsuario.getText();
                String contraseña= String.valueOf(pfContraseña.getPassword());
                Admin admin=new Admin();
                admin.mostrarPlayers();
                Player jugador= admin.cargarUsuario(usuario, contraseña);
                if(jugador!=null) {

                    window.dispose(); /// hace el cambio de ventana medio hardcore pero bue XD
                    //window.setVisible(false);

                    new MenuU(jugador);


                }
                /// se llama a lo que haga iniciar sesion
            }
        });
        btnCrearUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("PENE");
                /// se llama a lo que haga crear el usuario
            }
        });
    }


}
