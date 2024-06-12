package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI {

    GameManager gm;
    JFrame window;
    public JTextArea messageText;
    public JPanel bgPanel[]  = new JPanel[10];
    public JLabel bgLabel[] = new JLabel[10];





    public UI(GameManager gm)
    {
        this.gm = gm;
        createMainField();
        GenerarPantalla();
        window.setVisible(true);
    }


    public void createMainField()
    {
        /// Config. de la ventana
        window = new JFrame("Realoc: TimeLine");
        window.setSize(1250, 750);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setResizable(false);

    }

    public void crearFlechaSig(int IndiceFondo, String rutaImagen, String comando) /// Recibe un string con la ruta a la imagen de la flecha
    {
        ImageIcon flechita = new ImageIcon(getClass().getClassLoader().getResource(rutaImagen));

        JButton FlechaSig = new JButton();
        FlechaSig.setBounds(1115,550,100,100);
        FlechaSig.setBackground(null);
        FlechaSig.setFocusPainted(false);
        FlechaSig.setContentAreaFilled(false);
        FlechaSig.setIcon(flechita);
        FlechaSig.addActionListener(gm.ControladorA);
        FlechaSig.setActionCommand(comando);
        FlechaSig.setBorderPainted(false);
        FlechaSig.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        bgPanel[IndiceFondo].add(FlechaSig);
    }


    public void crearTexto(String texto)
    {
        messageText = new JTextArea("Damián se apoyaba en la pared, aturdido y sin comprender lo que pasaba. La sangre que salía del cuerpo sin vida de Gabriel formaba un enorme charco a su alrededor, aunque parecía no notarlo.\n"  +
                   "Con manos torpes y temblorosas tomó su celular y empezó a marcar, 9…1……..1\n" +
                          "Un mensaje automático respondió el llamado, así que Damián espero a que uno de los operadores tome su llamada.");

        messageText.setBounds(120,500,1000,200);
        messageText.setBackground(new Color(255,255,255,100));
        messageText.setForeground(Color.black);
        messageText.setEditable(false);
        messageText.setLineWrap(true);
        messageText.setWrapStyleWord(true);
        messageText.setFont(new Font("Tw Cen MT", Font.PLAIN, 16));
        messageText.setVisible(true);
        bgPanel[1].add(messageText);

    }

    public void createBackground(int indice, String rutaDeImagen) /// Esta funcion recibe el numero de indice del array y el path de la imagen
    {
        // Espacio del fondo
        bgPanel[indice] = new JPanel();
        bgPanel[indice].setBounds(0,0,1250,750);
        bgPanel[indice].setBackground(Color.blue);
        bgPanel[indice].setLayout(null);
        window.add(bgPanel[indice]);

        // config del fondo.
        bgLabel[indice] = new JLabel();
        bgLabel[indice].setBounds(0,0,1250,750);
        ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource(rutaDeImagen));
        bgLabel[indice].setIcon(bgIcon);

    }

    public void crearObjeto(int indice, String rutaImagen) /// Esta funcion pide por parametro X,Y,Alto y Ancho del ImageIcon y la ruta de la imagen. Ademas del indice del fondo
    {
        JLabel objeto = new JLabel();
        objeto.setBounds(400,10,500,500);

        ImageIcon ManuelIcon = new ImageIcon(getClass().getClassLoader().getResource(rutaImagen));
        objeto.setIcon(ManuelIcon);

        /// esto hace que el objeto no quede abajo del fondo jeje
        bgPanel[indice].add(objeto); // el numero es el indice del fondo

    }
    public void crearGabrielArchurado(int indice, String rutaImagen) /// Esta funcion pide por parametro X,Y,Alto y Ancho del ImageIcon y la ruta de la imagen. Ademas del indice del fondo
    {
        JLabel objeto = new JLabel();
        objeto.setBounds(650,180,500,500);

        ImageIcon ManuelIcon = new ImageIcon(getClass().getClassLoader().getResource(rutaImagen));
        objeto.setIcon(ManuelIcon);

        /// esto hace que el objeto no quede abajo del fondo jeje
        bgPanel[indice].add(objeto); // el numero es el indice del fondo

    }

    public void GenerarPantalla()
    {
        //Fondo 1
        createBackground(1,"FondoPasillo.png");
        crearTexto("hola\n");
        crearGabrielArchurado(1,"Gabriel_Achurado.png");
        //crearObjeto(1,"Gabriel_Achurado.png");
        crearFlechaSig(1,"FlechaDerecha.png","Siguiente");
        bgPanel[1].add(bgLabel[1]);
    }
}
