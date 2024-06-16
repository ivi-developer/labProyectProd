
package Main;

import Discarted.ControladorDeAcciones3Botones;

public class GameManager {

    ControladorDeAcciones ControladorA = new ControladorDeAcciones(this);
    ControladorDeAcciones2 ControladorB = new ControladorDeAcciones2(this);
    ControladorDeAcciones3Botones Controlador3 = new ControladorDeAcciones3Botones(this);
    public UI ui = new UI(this);
    public Historia h = new Historia(this);



    public static void main(String[] args) {

        GameManager gm = new GameManager();
        Historia h = new Historia(gm);
       // gm.nuevaPartida();
        gm.cargarPartida(5);

    }

    public GameManager() {


    }

    public void nuevaPartida()
    {
        h.menu(1);
        ui.window.setVisible(true); // ESTO HACE QUE LA VENTANA SE MUESTRE DESPUES DE CREAR LA VIÑETA CON LA HISTORIA.
    }

    public void cargarPartida(int checkpoint)
    {
        h.menu(checkpoint);
        ui.window.setVisible(true); // ESTO HACE QUE LA VENTANA SE MUESTRE DESPUES DE CREAR LA VIÑETA CON LA HISTORIA.
    }


}
