import back.Admin;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){menu();}
    public static void menu(){
        Admin admin=new Admin();
        Scanner scanner=new Scanner(System.in);
        do{
            try{
                System.out.println("elegi");
                switch (scanner.nextInt()) {
                    case 1 -> {
                        admin.crearPlayer();
                        admin.crearPlayer();
                        admin.mostrarPlayers();
                    }
                    case 2 -> admin.guardarPLayers();
                    case 3 -> {
                        admin.mostrarPlayers();
                    }
                    default -> System.out.println("wachin");
                }
                System.out.println("n para cortar");
            }catch (InputMismatchException e){
                System.out.println("Cualquier ingresaste wachin");
            }
        }while(!scanner.next().equalsIgnoreCase("n"));
        scanner.close();
    }

}