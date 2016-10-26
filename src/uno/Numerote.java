package uno;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

/**
 * Created by El sabroso on 25/10/2016.
 */
public class Numerote {
    private int[] arreglo;
    private int[] arreglo2;

    public Numerote(int ent, int ent1) {
        this.arreglo = new int[ent];
        this.arreglo2 = new int[ent1];
    }
   /* public int elementos() {
        String elemento = JOptionPane.showInputDialog("Dame el numero de elementos");
        return Integer.parseInt(elemento);
        }
   */
    
    public void llenarArreglo() {
        for(int i = 0; i < arreglo.length; i++) {
            String a = JOptionPane.showInputDialog("Ingresa elemento " + (i + 1));
            arreglo[i] = Integer.parseInt(a);
        }
    }

    public void llenarArreglo2() {
        for(int i = 0; i < arreglo2.length; i++) {
            String a = JOptionPane.showInputDialog("Ingresa elemento " + (i + 1));
            arreglo2[i] = Integer.parseInt(a);
        }
    }

    public int obtener(int f) {
        return arreglo[f];
    }

    public int obtener2(int a) {
        return arreglo2[a];
    }

    public int Menu() {
        String option = JOptionPane.showInputDialog(null, "BIENVENIDO A NUMEROTE \n    1  Ingresa vector   \n    2  Ingresa vector dos \n    3  Suma \n    4  Resta \n    5  Divicion  \n    6  Multiplicacion  \n    7  Salir");
        return Integer.parseInt(option);

    }
}

