package back;
import java.time.LocalDateTime;
import java.util.ArrayList;
public class Admin extends User{
    private ArrayList<Player>players;
    public Admin(){
        super();
        players=new ArrayList<>();
    }
    public void crearPlayer(){
        Player player=new Player();
        setNick(player);
        setPassword(player);
        agregarPlayer(player);
    }
    private void setNick(Player player){//ESTE SET NICK SE USA PARA VALIDAR EL NICK
        String nick;
        System.out.println("Ingrese su nick");
        nick = scanner.nextLine();
        if(nickExist(nick)) {
            StringBuilder sb=new StringBuilder();
            sb.append("El nick '").append(nick).append("'").append(" ya existe, pruebe otro");
            System.out.println(sb);
            setNick(player);
        }
        else setNick(nick,player);//EL SET NICK QUE PIDE UN PLAYER LE SETEA ESE NICK A ESE PLAYER
    }
    private void setPassword(Player player){//ESTE SET PASSWORD VERIFICA LA PASSWORD
        System.out.println("Ingrese una contrasenia");
        String contrasenia= scanner.nextLine();
        System.out.println("Confirme la contrasenia");
        if(scanner.nextLine().equals(contrasenia))setPassword(contrasenia,player);//EL SET PASSWORD QUE PIDE UN PLAYER LE SETEA ESA PASSWORD A ESE PLAYER
        else {
            System.out.println("las contrasenias no coinciden pruebe de vuelta");
            setPassword(player);
        }
    }
    private boolean nickExist(String nick){return players.stream().anyMatch(player->player.getNick().equals(nick));}
    private void setNick(String nick,Player player){player.setNick(nick);}
    private void setPassword(String password,Player player){player.setPassword(password);}
    private void agregarPlayer(Player player){players.add(player);}
    public void mostrarPlayers(){players.stream().forEach(player -> System.out.println(player.toString()));}
    public void guardarPartida(Player player){player.setPuntoGuardado(LocalDateTime.now());}
    public void desbloquearLogro(Player player, Logro logro){player.logros.add(logro);}
    public void agregarItem(Player player,Item item){player.items.add(item);}
}