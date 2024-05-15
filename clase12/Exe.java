package clase12;

import java.util.Random;

import java.util.Scanner;

public class Exe {
    public static void main(String[] args){
        //teclado
        NaveEspacial n1 = new NaveEspacial();
        Scanner scan = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        int ctripulantes;
        System.out.println("Digite el numero de tripulantes:");
        ctripulantes = scan.nextInt();
        n1.setCtripulantes(ctripulantes);
        int nturbinas;
        System.out.println("Digite el numero de turbinas: ");
        nturbinas = scan.nextInt();
        n1.setNturbinas(nturbinas);
        float dfuselaje;
        System.out.println("Digite el diámetro del fuselaje: ");
        dfuselaje = scan.nextFloat();
        n1.setDfuselaje(dfuselaje);
        String nombre;
        System.out.println("Digite el nombre oficial de la nave: ");
        nombre = teclado.nextLine();
        n1.setNombre(nombre);
        System.out.println("La nave tiene " + n1.getCtripulantes() + " tripulantes, " + n1.getNturbinas() +
                " turbinas, se llama " + n1.getNombre() + " y su fuselaje tiene un diámetro de " + n1.getDfuselaje() + " metros cuadrados");

        //aleatorio
        NaveEspacial n2 = new NaveEspacial();
        int ctripulantes2 = (int) (Math.random()*10);
        n2.setCtripulantes(ctripulantes2);
        int nturbinas2 = (int) (Math.random()*10);
        n2.setNturbinas(nturbinas2);
        float dfuselaje2 = (float) Math.random()*50;
        n2.setDfuselaje(dfuselaje2);
        int num = (int) (Math.random()*5);
        String nombre2[] = {"Kylian", "Messi", "Elon", "Steve", "Francia"};
        n2.setNombre(nombre2[num]);
        System.out.println("La nave tiene " + n2.getCtripulantes() + " tripulantes, " + n2.getNturbinas() +
                " turbinas, se llama " + n2.getNombre() + " y su fuselaje tiene un diámetro de " + n2.getDfuselaje() + " metros cuadrados");

        //código fuente
        NaveEspacial n3 = new NaveEspacial();
        n3.setNombre("Cristiano");
        n3.setCtripulantes(6);
        n3.setNturbinas(4);
        n3.setDfuselaje(50.5f);


        System.out.println("La nave tiene " + n3.getCtripulantes() + " tripulantes, " + n3.getNturbinas() +
                " turbinas, se llama " + n3.getNombre() + " y su fuselaje tiene un diámetro de " + n3.getDfuselaje() + " metros cuadrados");
    }
}
