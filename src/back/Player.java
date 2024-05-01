package back;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;

public class Player extends User{
    protected Player(){super();}
    protected LinkedList<Logro> logros;
    protected LocalDateTime puntoGuardado;
    protected LinkedList<Item>items;
    protected Player(String nick,String password){
        super(nick, password);
        puntoGuardado=LocalDateTime.now();
        logros=new LinkedList<>();
        items=new LinkedList<>();
    }
    protected void setNick(String nick){super.setNick(nick);}
    protected String getNick(){return super.getNick();}
    protected void setPassword(String password){super.setPassword(password);}
    protected void setPuntoGuardado(LocalDateTime localDateTime){this.puntoGuardado=localDateTime;}
}
