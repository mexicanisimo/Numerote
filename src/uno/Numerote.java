package uno;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

/**
 * Created by El sabroso on 25/10/2016.
 */
public class Numerote {
    private int[] arreglo;
    private int[] arreglo2;
    private int tam;

    public Numerote(int ent, int ent1, int tam) {
        this.arreglo = new int[ent];
        this.arreglo2 = new int[ent1];
        this.tam = tam;
    }
    public int elementos() {
        String elemento = JOptionPane.showInputDialog("Dame el numero de elementos");
        return Integer.parseInt(elemento);
    }
    
    public void llenarArreglo() {
        for(int i = 0; i < tam; i++) {
            String a = JOptionPane.showInputDialog("Ingresa elemento uno a uno");
            int arre= Integer.parseInt(a);

            if(arre > 0) {

            }
        }
    }

    public int optenerTamaño() {
        return arreglo.length;
    }

    public int optenenertamaño2() {
        return arreglo2.length;
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

