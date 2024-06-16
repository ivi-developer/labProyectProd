package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorDeAcciones2 implements ActionListener {

    GameManager gm;

    public ControladorDeAcciones2(GameManager gm) {
        this.gm = gm;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        int opcion = Integer.parseInt(e.getActionCommand());
        System.out.println(e.getActionCommand());

        switch (opcion) {

            case 1:
                gm.ui.bgPanel[2].setVisible(false);
                gm.h.menu(1);
                break;

            case 2:

                gm.ui.bgPanel[3].setVisible(false);
                gm.h.menu(2);

                break;


            case 3:
                gm.ui.bgPanel[4].setVisible(false);
                gm.h.menu(3);
                break;


            case 4:
                gm.ui.bgPanel[5].setVisible(false);
                gm.h.menu(4);
                break;

            case 5:

                if(gm.ui.bgPanel[6] == null)
                {
                    gm.ui.bgPanel[7].setVisible(false);
                }
                else
                {
                    gm.ui.bgPanel[6].setVisible(false);
                }
                gm.h.menu(5);
                break;

            case 6:
                gm.ui.bgPanel[7].setVisible(false);
                gm.h.menu(5);
                break;

        }
    }
}
