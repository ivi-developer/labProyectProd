import back.Admin;
import front.Inicio;
import front.Juego;
import front.Ventana;
import front.VentanaInfo;


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
                    probandoVentana();
                    break;
                case 3:
                    probandoIncio();
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
    public static void probandoVentana(){
        VentanaInfo inicio=new VentanaInfo("db (1).png","hola persona de elevado indeice de grasa corporal homosexual");
        VentanaInfo bulma=new VentanaInfo("bulma.png","BULMA WACHOaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        VentanaInfo indio=new VentanaInfo("goku.jpg","VAMO REDONDO CON HUEVO VAYA AL FRENTE");
        Juego juego=new Juego();
        juego.agregarVentanaInfo(inicio);juego.agregarVentanaInfo(bulma);juego.agregarVentanaInfo(indio);
        Ventana ventana=new Ventana(Juego.getVentanasInfo());
    }
    public static void probandoIncio(){Inicio inicio=new Inicio();}

}