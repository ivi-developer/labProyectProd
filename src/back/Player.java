package back;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Player extends User{
    protected Player(){super();}
    protected ArrayList<Logros>logros;
    protected LocalDateTime puntoGuardado;
    protected Player(String nick,String password){
        super(nick, password);
        puntoGuardado=LocalDateTime.now();
        logros=new ArrayList<>();
    }
    protected void setNick(String nick){super.setNick(nick);}
    protected String getNick(){return super.getNick();}
    protected void setPassword(String password){super.setPassword(password);}
    protected void setPuntoGuardado(LocalDateTime localDateTime){this.puntoGuardado=localDateTime;}
}
