
package Main;

public class Historia {

    GameManager gm;

    public Historia(GameManager gm) {

        this.gm = gm;

        menu(1);
    }


    public void menu(int pagina) {

        if (pagina != 4000) {
            switch (pagina) {

                case 1:

                    pagina= pagina1();

                    break;
                case 2:
                    pagina= pagina2();
                    break;
                case 3:
                    pagina= pagina3();
                    break;
                case 4:
                    pagina= pagina4();
                    break;
                case 5:
                    pagina= pagina5();
                    break;
                default:
                    break;
            }
        }



    }


    public int pagina1() {

        String pag1= new String("Damián se apoyaba en la pared, aturdido y sin comprender lo que pasaba. La sangre que salía del cuerpo sin vida de Gabriel formaba un enorme charco a su alrededor, aunque parecía no notarlo. \n" +
                "Con manos torpes y temblorosas tomó su celular y empezó a marcar, 9…1……..1\n" +
                "Un mensaje automático respondió el llamado, así que Damián espero a que uno de los operadores tome su llamada. \n" +
                "\n" +
                "Pero no pudo.\n");

        gm.ui.createBackground(1, "FondoPasillo.png");
        gm.ui.crearGabrielArchurado(1, "Gabriel_Achurado.png");
        gm.ui. crearTexto(pag1,1);
        gm.ui.crearFlechaSig(1, "FlechaDerecha.png", "Pag1");
        gm.ui.bgPanel[1].add(gm.ui.bgLabel[1]);
        gm.ui.bgPanel[1].setVisible(true);
        gm.ui.window.setVisible(true);
        return 2;
    }

    public int pagina2(){

        gm.ui.bgPanel[1].setVisible(false);
        String pag2= new String("Una fuerte luz ilumino el pasillo, obligándolo a entrecerrar sus ojos. A través de la pared de hormigón que tenía justo en frente, emergió un grupo de personas. \n" +
                "\n" +
                "-Rápido, quiero que acordonen el área e instalen un prolongador espacial, cualquier persona que quiera atravesar este pasillo debe entrar en un bucle indefinido, por lo menos hasta que terminemos-.\n" +
                "\n" +
                "Damián, devastado y sin entender nada, miraba hacia todos lados. ¿Cómo habían atravesado la pared? ¿Quiénes eran? El grupo se movía como si el no estuviera allí, ignorando completamente su presencia.\n");
        gm.ui.createBackground(2, "FondoPasillo.png");
        gm.ui.crearObjeto(2, "ManuelCostado.png");
        gm.ui.crearTexto(pag2,2);
        gm.ui.crearFlechaSig(2, "FlechaDerecha.png", "Pag2");
        gm.ui.bgPanel[2].add(gm.ui.bgLabel[2]);
        return 3;
    }
    public int pagina3() {
        gm.ui.bgPanel[2].setVisible(false);
        String pag3= new String("El hombre, de estatura promedio y un pelo muy canoso para la edad que aparentaba, caminaba nervioso en todas direcciones, dando ordenes al grupo.\n" +
                "-No quiero que pasen nada por alto, conocemos su modus operandi, sabemos que siempre es mas rapido, pero todos cometen errores. Y mucho mas si se confian.\n" +
                "\n" +
                "Frente a vos, paso caminando una mujer. Ella iba vestida igual que el hombre que acelerado, con un traje gris y una camisa blanca. Los demás vestían una especie de uniforme negro que te hacía acordar a la policía.\n" +
                "\n" +
                "Mirandote, se detuvo y se dirigio al hombre de traje- Eu, Manuel, parece que tenemos un testigo, listo para el bardo del papeleo?-.\n");
        gm.ui.createBackground(3, "FondoPasillo.png");
       gm.ui. crearObjeto(3, "PazCostado.png");
       gm.ui. crearTexto(pag3, 3);
        gm.ui.crearFlechaSig(3, "FlechaDerecha.png", "Pag3");
        gm.ui.bgPanel[3].add(gm.ui.bgLabel[3]);

        return 4;
    }

    public int pagina4(){

        return 0;
    }
    public int pagina5() {
        return 0;
    }



}
