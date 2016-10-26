package uno;

/**
 * Created by El sabroso on 25/10/2016.
 */

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String args []) {
        int tam = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa tamaño de los arreglos"));

        Numerote nu = new Numerote(tam, tam);
        int opcion = nu.Menu();

        switch (opcion) {
            case 1:
                nu.llenarArreglo();
                break;
            case 2:
                nu.llenarArreglo2();
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
        }
    }

}
