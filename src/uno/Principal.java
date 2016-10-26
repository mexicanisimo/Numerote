package uno;

/**
 * Created by El sabroso on 25/10/2016.
 */

public class Principal {

    public static void main(String args []){
        int tam = JOptionPane.showInputDialog(null, "Ingresa tamaño");

        Numerote nu = new Numerote(10, 10, tam);
        int opcion = nu.Menu();

        do {
            switch (opcion) {
                case 1:
                    nu.elementos();
                    break;
                case 2:
                    nu.llenararreglo();
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
