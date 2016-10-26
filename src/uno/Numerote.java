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
        arreglo = new int[ent];
        arreglo2 = new int[ent1];
    }
    public int elementos(){
        String elemento;
        int elemen;
        elemento =JOptionPane.showInputDialog("Dame el numero de elmentos");
        elemen=Integer.parseInt(elemento);
        return elemen;
    }
    public void llenararreglo(){
        int i,tam=1,arre;
        String a;
        for(i=0;i<=tam;i++){
            a= JOptionPane.showInputDialog("Ingresa elemento uno a uno");
            arre= Integer.parseInt(a);
           if(arre>0){

           }
        }
    }


    public int optenertamaño() {
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

