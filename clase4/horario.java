package clase4;
import java.util.Scanner;

public class horario {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int hora;
        System.out.println("Ingrese la hora de llegada: ");
        hora = scan.nextInt();
        if (hora >= 0 && hora <= 24){
            if (hora == 0){
                System.out.println("Debería ir ya para la casa");
            } else if (hora == 1) {
                System.out.println("Me echan mis papás");
            } else if (hora == 2) {
                System.out.println("Muy bonito");
            } else if (hora == 3) {
                System.out.println("Tempranito pa");
            } else if (hora == 4) {
                System.out.println("Juan se levanta a clase de 6");
            } else if (hora == 5) {
                System.out.println("A esa hora se levantan Mario, Jhan, Marcos y Robinson");
            } else if (hora >= 6 && hora <= 11) {
                System.out.println("Buenos días");
            } else if (hora >= 12 && hora <= 19) {
                System.out.println("Buenas tardes");
            } else if (hora >= 20 && hora <= 23) {
                System.out.println("Buenas noches");
            }
        }else {
            System.out.println("La hora no es valida");
        }
    }
}
