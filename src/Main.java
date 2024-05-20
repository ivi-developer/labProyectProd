import back.Admin;
import back.Inicio;
import front.Juego;
import front.Ventana;
import front.VentanaInfo;

import javax.swing.*;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        menu(scanner);
    }
    public static void menu(Scanner scanner){
        do{
            System.out.println("elegi");
            switch(scanner.nextInt()){
                case 1:
                    guardarUsarios();
                    break;
                case 2:
                    probandoVentana();
                    break;
                case 3:
                    probandoIncio();
                    break;
            }
            System.out.println("n para cortar");
        }while(!scanner.next().equalsIgnoreCase("n"));
    }
    public static void guardarUsarios(){
        Admin admin=new Admin();
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