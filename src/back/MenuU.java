package back;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuU {
    private JPanel panel1;
    private JButton logrosButton;
    private JButton administrarUsuarioButton;
    private JButton nuevaPartidaButton;
    private JButton cargarPartidaButton;


    public MenuU(Player jugador) {

        JFrame window = new JFrame();

        window.setTitle("Login");
        window.setContentPane(panel1);
        window.setSize(1250, 750);
        //setMaximumSize(new Dimension(500, 83));
        window.setResizable(false);
        ///setModal(true);
        ///setLocationRelativeTo(null);
        ///setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        window.setVisible(true);


        nuevaPartidaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                }
                /// se llama a lo que haga iniciar sesion

        });

        logrosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("PENE");
                /// se llama a lo que haga crear el usuario
            }
        });

        cargarPartidaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("PENE");
                /// se llama a lo que haga crear el usuario
            }
        });

        administrarUsuarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("PENE");
                /// se llama a lo que haga crear el usuario
            }
        });
    }

}