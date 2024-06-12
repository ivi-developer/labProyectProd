package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorDeAcciones implements ActionListener {


    GameManager gm;


    public ControladorDeAcciones(GameManager gm)
    {
        this.gm = gm;

    }

    public void actionPerformed(ActionEvent e) {

        String opcion = e.getActionCommand();
        System.out.println(e.getActionCommand());

        switch(opcion)
        {

            case "Pag1":gm.h.menu(2);break;





            case "Pag2":{
                gm.h.menu(3);
                break;

            }
        }


    }







}





