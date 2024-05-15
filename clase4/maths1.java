package clase4;
import java.util.Scanner;

public class maths1 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        float nota;
        System.out.println("Digite la nota del alumno: ");
        nota = in.nextFloat();
        if (nota <= 5 && nota >= 0){
            if (nota >= 3){
                System.out.println("Usted ha aprobado");
            }else {
                System.out.println("Ud ha reprobado");
            }
        } else {
            System.out.println("Nota no válida");
        }
    }
}
