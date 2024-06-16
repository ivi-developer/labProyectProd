
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

        int opcion = Integer.parseInt(e.getActionCommand());
        System.out.println(e.getActionCommand());

        switch(opcion)
        {

            case 2:

                gm.h.menu(2);


                break;

            case 3:{

                gm.h.menu(3);

                break;

            }

            case 4:{
                gm.h.menu(4);
                break;

            }

            case 5:{
                gm.h.menu(5);
                break;
            }
            case 6: {
                System.out.println("Pene1");
                gm.h.menu(6);
            }
                break;
            case 7: {
                gm.ui.bgPanel[5].setVisible(false);
                System.out.println("Pene2");
                gm.h.menu(7);
            }
                break;

            case 8: {

                System.out.println("Pene3");
                gm.h.menu(8);
            }
                break;
        }



    }
}
