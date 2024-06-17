

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
                    pagina8();
                    break;
                case 9:
                    pagina9();
                    break;
                case 10:
                    pagina10();
                    break;
                case 11:
                    pagina11();
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

    public void pagina8()
    {
        String pag8=("Torres...");
        gm.ui.generarEscenaHojasTorre(8,pag8, Fondos.F_OFICINA,"9",Varios.HOJA_TORRE);
    }

    public void pagina9()
    {
        String pag9 = ("Oscuridad ...");
        gm.ui.generarEscenaHojasOscuridad(9,pag9,Fondos.F_OFICINA,"10",Varios.HOJA_OSCURA);
    }

    public void pagina10()
    {
        String pag10 = ("Reyes...");
        gm.ui.generarEscenaHojasRey(10,pag10, Fondos.F_OFICINA,"11",Varios.HOJA_REY);
    }

    public void pagina11()
    {
        String pag11 = ("A");
       // gm.ui.crearEscenarioUnPersonaje();
    }
    public void pagina12()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }
    public void pagina13()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }
    public void pagina14()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }
    public void pagina15()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }
    public void pagina16()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }
    public void pagina17()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }
    public void pagina18()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }
    public void pagina19()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }
    public void pagina20()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }
    public void pagina21()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }
    public void pagina22()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }
    public void pagina23()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }
    public void pagina24()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }
    public void pagina25()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }
    public void pagina26()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }
    public void pagina27()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }

    public void pagina28()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }
    public void pagina29()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }
    public void pagina30()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }
    public void pagina31()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }
    public void pagina32()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }
    public void pagina33()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina34()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina35()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina36()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina37()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina38()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina39()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina40()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina41()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina42()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina43()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina44()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina45()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina1146()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina47()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina48()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina49()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina50()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina51()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina52()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina53()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina54()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina55()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina56()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina57()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina58()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina59()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina60()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina61()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina62()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina63()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina64()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina65()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina66()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina67()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina68()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina69()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina70()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina71()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina72()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina73()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina74()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina75()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina76()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina77()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina78()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina79()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina80()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina81()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina82()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina83()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina84()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina85()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina86()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina87()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina88()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina89()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina90()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina91()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina92()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina93()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina94()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina95()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina96()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina97()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina98()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina99()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina100()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina101()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina102()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina103()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina104()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina105()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina106()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina107()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina108()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina109)
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina110()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina111()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina112()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina113()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina114()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina115()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina116()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina117()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina118()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina119()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina120()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina121()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina121()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina122()

        String pag122 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina123()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina124()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina125
        ()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina126()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina127()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina128()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina129()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina130()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina131()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina132()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina133()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina134()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina135()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina136()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina136()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina137()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina138()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina139()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina140()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina141()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina142()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina143()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina144()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina145()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina146()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina147()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina148()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina149()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina150()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina151()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina152()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina153()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina154()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina155()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina156()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina157()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina158()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina159()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina160()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina161()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina162()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina163()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina164()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina165()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina166()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina167()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina168()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina169()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina170()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina171()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina172()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina173()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina174()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina175()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina176()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina177()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina178()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina179()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina180()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina181()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina182()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina183()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina184()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina185()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina1186()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina187()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina188()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina189()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina190()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina191()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina192()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina193()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina194()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina195()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina196()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina197()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina198()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina199()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina200()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina201()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina202()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina203()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina204()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina205()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina206()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina207()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina208()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina209()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagin210()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina211()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina212()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina213()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina214()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina215()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina216()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina217()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina218()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina219()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina220()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina221()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina222()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina223()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina224()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina225()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina226()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina227()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina228()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina229()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina230()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina231()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina232()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina233()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina234()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina235()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina236()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina237()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina238()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina239()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina240()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina241()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina242()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina243()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina244()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina245()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina246()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina247()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }public void pagina11()
    {
        String pag11 = ("A");
        // gm.ui.crearEscenarioUnPersonaje();
    }



}
