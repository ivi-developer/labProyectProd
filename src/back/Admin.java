package back;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.*;
import java.util.stream.Collectors;

public class Admin extends User{
    private HashMap<String,Player> players;
    public Admin(){
        super();
        players=new HashMap<>();
        leerDesdeJson("jugadoresLaConchaDeSuMadre");
    }
    public void crearPlayer(){
        Player player=new Player();
        setNick(player);
        setPassword(player);
        agregarPlayer(player);
        guardarEnJson("jugadoresLaConchaDeSuMadre");
    }
    public void cargarLogros(){//FUNCION TEMPORAL PARA CARGAR LOGROS A JSON, LA IDEA SERIA QUE CUANDO SE CREA UN JUGADOR SE CARGUEN LOS LOGROS Y QUE X VENTANA LE CAMBIE EL ESTADO DEL LOGRO A DESBLOQUEADO
        Queue<Logro> logros=new LinkedList<>();
        Gson gson=new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter fileWriter=new FileWriter("logros")){
            gson.toJson(logros,fileWriter);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    private void setNick(Player player){//ESTE SET NICK SE USA PARA VALIDAR EL NICK
        String nick;
        System.out.println("Ingrese su nick");
        Scanner scanner=new Scanner(System.in);
        nick =scanner.nextLine();
        if(players.containsKey(nick)) {
            StringBuilder sb=new StringBuilder();
            sb.append("El nick '").append(nick).append("'").append(" ya existe, pruebe otro");
            System.out.println(sb);
            setNick(player);
        }
        else setNick(nick,player);//EL SET NICK QUE PIDE UN PLAYER LE SETEA ESE NICK A ESE PLAYER
    }
    private void setPassword(Player player){//ESTE SET PASSWORD VERIFICA LA PASSWORD
        System.out.println("Ingrese una contrasenia");
        Scanner scanner=new Scanner(System.in);
        String contrasenia= scanner.nextLine();
        System.out.println("Confirme la contrasenia");
        if(scanner.nextLine().equals(contrasenia))setPassword(contrasenia,player);//EL SET PASSWORD QUE PIDE UN PLAYER LE SETEA ESA PASSWORD A ESE PLAYER
        else {
            System.out.println("las contrasenias no coinciden pruebe de vuelta");
            setPassword(player);
        }
    }
    private void setNick(String nick,Player player){player.setNick(nick);}
    public Player getPlayer(String nick){return players.get(nick);}
    private void setPassword(String password,Player player){player.setPassword(password);}
    private void agregarPlayer(Player player){players.put(player.getNick(),player);}
    public void mostrarPlayers(){System.out.println(players);}
    //private void guardarPartida(Player player){player.setPuntoGuardado(player.ventana.getIndice());}
    public void desbloquearLogro(String nick,LogrosTitle logrosTitle) {
        players.get(nick).logros.get(logrosTitle).setEstadoDeAcceso(EstadoDeAcceso.DESBLOQUEADO);
    }//MODIFICA EL ESTADO DE ACCESO DE UN LOGRO ESPECIFICO DEL PLAYER
    public void guardarEnJson(String filePath){
        Gson gson=new GsonBuilder().registerTypeAdapter(LinkedHashMap.class,new LinkedHashMapAdapter()).setPrettyPrinting().create();
        List<Player>playersList=new ArrayList<>(players.values());
        try(FileWriter fileWriter=new FileWriter(filePath)){
            gson.toJson(playersList,fileWriter);
        }catch (IOException e){
            System.out.println("Error guardando Players. Error: "+e.getMessage());
        }
    }
    public void leerDesdeJson(String filePath){
        Gson gson=new GsonBuilder().registerTypeAdapter(LinkedHashMap.class,new LinkedHashMapAdapter()).create();
        try(FileReader fileReader=new FileReader(filePath)){
            Type type=new TypeToken<List<Player>>(){}.getType();
            List<Player>playersList=gson.fromJson(fileReader,type);
            players= (HashMap<String, Player>) playersList.stream().collect(Collectors.toMap(Player::getNick, player -> player));
        }catch(FileNotFoundException e){
            System.out.println("Primera vez jugando wachin?");
        } catch (IOException e){
            System.out.println("Error leyendo Players. Error: "+e.getMessage());
        }
    }
    public void actualizarPuntoGuardado(Player player,String filePath){
       // guardarPartida(player);
        guardarEnJson(filePath);
    }
}