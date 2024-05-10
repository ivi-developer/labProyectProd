package front;

import java.util.ArrayList;

public class Juego {
    static ArrayList<VentanaInfo>ventanasInfo;
    public Juego(){ventanasInfo=new ArrayList<>();}
    public void agregarVentanaInfo(VentanaInfo ventanaInfo){ventanasInfo.add(ventanaInfo);}
    public static ArrayList<VentanaInfo> getVentanasInfo(){return ventanasInfo;}
}
