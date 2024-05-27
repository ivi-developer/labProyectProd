package back;
import front.Ventana;
import front.VentanaInfo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Player extends User{
    protected Player(){
        super();
        logros=new LinkedList<>();
        items=new LinkedList<>();
        ventana=new Ventana(new ArrayList<>());
    }
    protected LinkedList<Logro> logros;
    protected Integer puntoGuardado;
    protected Ventana ventana;
    protected LinkedList<Item>items;
    protected Player(String nick,String password){
        super(nick, password);
        puntoGuardado=0;
        logros=new LinkedList<>();
        items=new LinkedList<>();
    }
    protected void setPuntoGuardado(Integer puntoGuardado){this.puntoGuardado=puntoGuardado;}
    @Override
    public String toString() {
        return super.toString()+ "Player{" +
                "logros=" + logros +
                ", puntoGuardado=" + puntoGuardado +
                ", items=" + items +
                '}';
    }
}
