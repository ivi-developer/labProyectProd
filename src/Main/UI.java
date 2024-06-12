package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI {

    GameManager gm;
    JFrame window;
    public JTextArea messageText;
    public JPanel bgPanel[] = new JPanel[10];
    public JLabel bgLabel[] = new JLabel[10];
    ///Historia h = new Historia(gm);


    public UI(GameManager gm) {
        this.gm = gm;
        createMainField();


    }

    public UI() {

    }


    public void createMainField() {
        /// Config. de la ventana
        window = new JFrame("Realoc: TimeLine");
        window.setSize(1250, 750);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(null);
        window.setLayout(null);
        window.setResizable(false);

    }
    
    public void crearFlechaSig(int IndiceFondo, String rutaImagen, String comando) { /// Recibe un string con la ruta a la imagen de la flecha{
        ImageIcon flechita = new ImageIcon(getClass().getClassLoader().getResource(rutaImagen));

        JButton FlechaSig = new JButton();
        FlechaSig.setBounds(1115, 550, 100, 100);
        FlechaSig.setBackground(null);
        FlechaSig.setFocusPainted(false);
        FlechaSig.setContentAreaFilled(false);
        FlechaSig.setIcon(flechita);
        FlechaSig.addActionListener(gm.ControladorA);
        FlechaSig.setActionCommand(comando);
        FlechaSig.setBorderPainted(false);
        bgPanel[IndiceFondo].add(FlechaSig);


    }



    public void crearTexto(String texto, int indice)
    {
        messageText = new JTextArea(texto);

        messageText.setBounds(120,500,1000,200);
        messageText.setBackground(new Color(255,255,255,100));
        messageText.setForeground(Color.black);
        messageText.setEditable(false);
        messageText.setLineWrap(true);
        messageText.setWrapStyleWord(true);
        messageText.setFont(new Font("Tw Cen MT", Font.PLAIN, 16));
        messageText.setVisible(true);
        bgPanel[indice].add(messageText);

    }

    public void createBackground(int indice, String rutaDeImagen) /// Esta funcion recibe el numero de indice del array y el path de la imagen
    {
        // Espacio del fondo
        bgPanel[indice] = new JPanel();
        bgPanel[indice].setBounds(0,0,1250,750);
        bgPanel[indice].setBackground(null);
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
}
