

package Main;


import imagenes.Fondos;
import imagenes.Personajes;
import imagenes.Principales;
import imagenes.Varios;


public class Historia{

    GameManager gm;

    public Historia(GameManager gm) {

        this.gm = gm;


    }


    public void menu(int pagina) {

        if (pagina != 4000) {

            switch (pagina) {

                case 1:

                   pagina1();

                    break;
                case 2:
                    pagina2();
                    break;
                case 3:
                   pagina3();
                    break;
                case 4:
                   pagina4();
                    break;
                case 5:
                    pagina5();
                    break;
                case 6:
                    pagina6();
                    break;
                case 7:
                    pagina7();
                    break;
                case 8:

                    break;

                default:
                    break;
            }
        }



    }


    public void pagina1() {


        String pag1= new String("Damián se apoyaba en la pared, aturdido y sin comprender lo que pasaba. La sangre que salía del cuerpo sin vida de Gabriel formaba un enorme charco a su alrededor, aunque parecía no notarlo. \n" +
                "Con manos torpes y temblorosas tomó su celular y empezó a marcar, 9…1……..1\n" +
                "Un mensaje automático respondió el llamado, así que Damián espero a que uno de los operadores tome su llamada. \n" +
                "\n" +  
                "Pero no pudo.\n");
        gm.ui.crearEscenarioGabrielAchurado(1, pag1, Fondos.F_PASILLO, Principales.G_ACHURADO, "2",null);


    }

    public void pagina2(){


        String pag2= new String("Una fuerte luz ilumino el pasillo, obligándolo a entrecerrar sus ojos. A través de la pared de hormigón que tenía justo en frente, emergió un grupo de personas. \n" +

                "-Rápido, quiero que acordonen el área e instalen un prolongador espacial, cualquier persona que quiera atravesar este pasillo debe entrar en un bucle indefinido, por lo menos hasta que terminemos-.\n" +
                "\n" +
                "Damián, devastado y sin entender nada, miraba hacia todos lados. ¿Cómo habían atravesado la pared? ¿Quiénes eran? El grupo se movía como si el no estuviera allí, ignorando completamente su presencia.\n" +

                "El hombre, de estatura promedio y un pelo muy canoso para la edad que aparentaba, caminaba nervioso en todas direcciones, dando ordenes al grupo.\n" +
                "-No quiero que pasen nada por alto, conocemos su modus operandi, sabemos que siempre es mas rapido, pero todos cometen errores. Y mucho mas si se confian.\n" +
                        "\n" );

        gm.ui.crearEscenarioUnPersonaje(2, pag2, Fondos.F_PASILLO, Principales.M_COSTADO, "3", "1");



    }
    public void pagina3() {

        String pag3= new String("Frente a vos, paso caminando una mujer. Ella iba vestida igual que el hombre que acelerado, con un traje gris y una camisa blanca. Los demás vestían una especie de uniforme negro que te hacía acordar a la policía.\n" +
                "\n" +
                "Mirandote, se detuvo y se dirigio al hombre de traje- Eu, Manuel, parece que tenemos un testigo, listo para el bardo del papeleo?-.\n");

        gm.ui.crearEscenarioUnPersonaje(3, pag3, Fondos.F_PASILLO, Principales.P_FRENTE, "4", "2");


    }

    public void pagina4(){

        String pag4=("-S...Son la policía?-preguntaste, aun descolocado por la situación.\n" +
                "-Si, si, algo muy similar- dijo el hombre, tomándote del brazo para ayudarte a levantarte. –Soy Manuel, detective de la YTP y bla, bla, bla.- Sin dejarte decir nada, te enseña rápidamente una placa y de un bolsillo, saca una especie de lapicera. –Y ahora necesito que mires acá par…\n");
        gm.ui.crearEscenarioDosPersonajes(4, pag4, Fondos.F_PASILLO, Principales.M_SERIO, Principales.P_FRENTE, "5","3");

    }
    public void pagina5() {

        String pag5 =("AAAAAAAAAAAAAA");
        gm.ui.ventanaJBotones(5,pag5,Fondos.F_PASILLO,"6","7","7",Principales.M_COSTADO,Principales.P_FRENTE);


    }
    public void pagina6()
    {
        String pag6=("Pagina 6");
        gm.ui.crearEscenarioDosPersonajes(6, pag6, Fondos.F_PASILLO, Principales.M_SERIO, Principales.P_FRENTE, "8",null);
    }

    public void pagina7()
    {
        String pag7=("pagina 7");
        gm.ui.crearEscenarioDosPersonajes(7, pag7, Fondos.F_COMICCON, Principales.D_COSTADO, Principales.P_APUNTANDO, "8",null);
    }




}
