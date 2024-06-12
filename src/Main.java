import back.Admin;
import back.ReproducirMusica;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        menu(scanner);
    }
    public static void menu(Scanner scanner){
        Admin admin=new Admin();
        do{
            System.out.println("elegi");
            switch(scanner.nextInt()){
                case 1:
                    admin.crearPlayer();
                    admin.crearPlayer();
                    admin.mostrarPlayers();
                    break;
                case 2:
                    admin.guardarEnJson("jugadoresLaConchaDeSuMadre");
                    break;
                case 3:
                    admin.getPlayer("ivi").verLogros();
                    break;
                case 4:
                    admin.guardarEnJson("jugadoresLaConchaDeSuMadre");
                    break;
                case 5:
                    admin.leerDesdeJson("jugadoresLaConchaDeSuMadre");
                    admin.mostrarPlayers();
                    break;
                case 6:
                    admin.mostrarPlayers();
                    break;
                case 7:
                    admin.cargarLogrosAJson();
                    break;
                case 8:
                    ReproducirMusica reproducirMusica=new ReproducirMusica();
                    reproducirMusica.cargarSonido("./SoundFx/blackRussian.wav");
                    reproducirMusica.reproducirSonidoEnBucle();
                    ReproducirMusica reproducirMusica1=new ReproducirMusica();
                    reproducirMusica1.cargarSonido("./SoundFx/rockParaElNegroAtila.wav");
                    reproducirMusica1.reproducirSonido();
                    break;
                default:
                    System.out.println("wachin");
                    break;
            }
            System.out.println("n para cortar");
        }while(!scanner.next().equalsIgnoreCase("n"));
    }
    public static void guardarUsarios(){
        Admin admin=new Admin();
        admin.mostrarPlayers();
        admin.crearPlayer();
        admin.crearPlayer();
        admin.crearPlayer();
        admin.mostrarPlayers();
    }
}