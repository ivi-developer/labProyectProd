package back;

import java.time.LocalDateTime;
import java.util.ArrayList;
public class Admin extends User{
    private ArrayList<Player>players;
    public Admin(){
        super();
        players=new ArrayList<>();
    }
    public void crearPlayer(){Player player=new Player();}
    public void setNick(Player player){
        String nick;
        Boolean existe;
        do{
            System.out.println("Ingrese su nick");
            nick = scanner.nextLine();
            existe=nickExist(nick);
            if(existe) System.out.println("El nick ya existe pruebe con otro");
        }while(existe);
        setNick(nick,player);
    }
    private boolean nickExist(String nick){return players.stream().anyMatch(player->player.getNick().equals(nick));}
    private void setNick(String nick,Player player){player.setNick(nick);}
    public void setPassword(String password,Player player){player.setPassword(password);}
    public void restaurarPassword(String password, Player player){setPassword(password,player);}
    public void guardarPartida(Player player){player.setPuntoGuardado(LocalDateTime.now());}
    public void desbloquearLogro(Player player,Logros logro){player.logros.add(logro);}
}