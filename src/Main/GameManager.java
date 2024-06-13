package Main;

public class GameManager {

    ControladorDeAcciones ControladorA = new ControladorDeAcciones(this);
    public UI ui = new UI(this);
    public Historia h = new Historia(this);


    public static void main(String[] args) {

        new GameManager();

    }

    public GameManager() {

    }


}
