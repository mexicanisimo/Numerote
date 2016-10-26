package uno;

/**
 * Created by El sabroso on 25/10/2016.
 */

public class Principal {

    public static void main(String args []){
        Numerote Nu = new Numerote(10,10);
        int opcion = Nu.Menu();

        do {
            switch (opcion) {
                case 1:
                    Nu.elementos();
                    break;
                case 2:
                    Nu.llenararreglo();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    return;
            }
        } while (opcion < 8);
    }

}
