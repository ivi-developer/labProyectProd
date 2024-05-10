package back;
import java.time.LocalDateTime;
import java.util.LinkedList;

public class Player extends User{
    protected Player(){
        super();
        logros=new LinkedList<>();
        items=new LinkedList<>();
    }
    protected LinkedList<Logro> logros;
    protected LocalDateTime puntoGuardado;
    protected LinkedList<Item>items;
    protected Player(String nick,String password){
        super(nick, password);
        puntoGuardado=LocalDateTime.now();
        logros=new LinkedList<>();
        items=new LinkedList<>();
    }
    protected void setPuntoGuardado(LocalDateTime localDateTime){this.puntoGuardado=localDateTime;}
    @Override
    public String toString() {
        return super.toString()+ "Player{" +
                "logros=" + logros +
                ", puntoGuardado=" + puntoGuardado +
                ", items=" + items +
                '}';
    }
}
