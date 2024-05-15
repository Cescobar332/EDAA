package RetoGrupal;

import java.util.Random;

public class Ejercicio2 {
    public static int [] llenarArrayAleatorio(int desde, int hasta, int tam){
        int[] numeros = new int[tam];
        Random rnd = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(hasta - desde + 1) + desde;
            System.out.println(numeros[i]);
        }
        return numeros;
    }
    public static void main(String[] args){
        llenarArrayAleatorio(0, 20, 8);
    }
}