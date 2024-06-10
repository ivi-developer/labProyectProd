package Main;

import javax.swing.*;
import java.awt.*;

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
        createBackground();
        crearObjeto();


        window.setVisible(true);
    }

    public void createMainField()
    {
        /// Config. de la ventana
        window = new JFrame("aventura re loca 8");
        window.setSize(1250, 750);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setResizable(false);


        // Espacio del texto
        messageText = new JTextArea("Damián se apoyaba en la pared, aturdido y sin comprender lo que pasaba. La sangre que salía del cuerpo sin vida de Gabriel formaba un enorme charco a su alrededor, aunque parecía no notarlo. \n" +
                "Con manos torpes y temblorosas tomó su celular y empezó a marcar, 9…1……..1\n" +
                "Un mensaje automático respondió el llamado, así que Damián espero a que uno de los operadores tome su llamada.");
        messageText.setBounds(120,500,1000,200);
        messageText.setBackground(new Color(255,255,255,100));
        //messageText.setOpaque(false);
        messageText.setForeground(Color.black);
        messageText.setEditable(false);
        messageText.setLineWrap(true);
        messageText.setWrapStyleWord(true);
        messageText.setFont(new Font("Tw Cen MT", Font.PLAIN, 16));
        window.add(messageText);

    }

    public void createBackground()
    {
        // Espacio del fondo
        bgPanel[1] = new JPanel();
        bgPanel[1].setBounds(0,0,1250,750);
        bgPanel[1].setBackground(Color.blue);
        bgPanel[1].setLayout(null);
        window.add(bgPanel[1]);


        // config del fondo.
        bgLabel[1] = new JLabel();
        bgLabel[1].setBounds(0,0,1250,750);
        ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource("fondo destiny nessus.png"));
        bgLabel[1].setIcon(bgIcon);

    }

    public void crearObjeto()
    {
        JLabel objeto = new JLabel();
        objeto.setBounds(400,10,300,500);

        ImageIcon ManuelIcon = new ImageIcon(getClass().getClassLoader().getResource("Manuel.png"));
        objeto.setIcon(ManuelIcon);

        bgPanel[1].add(objeto);
        bgPanel[1].add(bgLabel[1]);
    }
}
