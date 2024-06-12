package Main;

public class GameManager {
    ControladorDeAcciones ControladorA = new ControladorDeAcciones(this);
    UI ui = new UI(this);

    public static void main(String[] args) {

        new GameManager();
    }

    public GameManager() {


    }
}
