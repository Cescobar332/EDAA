package clase11.edificio;
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args){
        //teclado
        Edificio e1 = new Edificio();
        Scanner scan = new Scanner(System.in);
        int pisos;
        System.out.println("Digite el numero de pisos:");
        pisos = scan.nextInt();
        e1.setPisos(pisos);
        int inquilinos;
        System.out.println("Digite el numero de inquilinos:");
        inquilinos = scan.nextInt();
        e1.setInquilinos(inquilinos);
        float area;
        System.out.println("Digite el area del piso:");
        area = scan.nextFloat();
        e1.setArea(area);
        float area1ZY = e1.getArea()/e1.getInquilinos();
        System.out.println("El edificio 3 tiene " + e1.getPisos() + " pisos donde viven " + e1.getInquilinos() +
                " inquilinos en un area de " + e1.getArea() + " metros cuadrados, " +
                "el area  por persona es "+ area1ZY + " metros por persona");

        //aleatorio
        Edificio e2 = new Edificio();

        //código fuente
        Edificio e3 = new Edificio();
        e3.setPisos(3);
        e3.setInquilinos(3);
        e3.setArea(30.5f);
        float area3ZY = e3.getArea()/e3.getInquilinos();

        System.out.println("El edificio 3 tiene " + e3.getPisos() + " pisos donde viven " + e3.getInquilinos() +
                " inquilinos en un area de " + e3.getArea() + " metros cuadrados, " +
                "el area  por persona es "+ area3ZY + " metros por persona");
    }
}
