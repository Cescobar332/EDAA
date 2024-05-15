package clase5;

import java.util.Scanner;
public class multiple {
    public static void main(String[] args){
        int nota = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite la nota: ");
        nota = scan.nextInt();
        if (nota>0 && nota <10){
            if (nota==1){
                System.out.println("UNO");
            } else if (nota == 2) {
                System.out.println("DOS");
            }else if (nota == 3) {
                System.out.println("TRES");
            }else if (nota == 4) {
                System.out.println("CUATRO");
            }else if (nota == 5) {
                System.out.println("CINCO");
            }else if (nota == 6) {
                System.out.println("SEIS");
            }else if (nota == 7) {
                System.out.println("SIETE");
            }else if (nota == 8) {
                System.out.println("OCHO");
            }else if (nota == 9) {
                System.out.println("NUEVE");
            }else if (nota == 10) {
                System.out.println("DIEZ");
            }
        }else {
            System.out.println("Nota no valida");
        }
        Switch();
        Ejercicio1();
    }
    public static void Switch(){
        int nota = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite la nota: ");
        nota = scan.nextInt();
        switch (nota){
            case 1:
                System.out.println("UNO");
                break;
            case 2:
                System.out.println("DOS");
                break;
            case 3:
                System.out.println("TRES");
                break;
            case 4:
                System.out.println("CUATRO");
                break;
            case 5:
                System.out.println("CINCO");
                break;
            case 6:
                System.out.println("SEIS");
                break;
            case 7:
                System.out.println("SIETE");
                break;
            case 8:
                System.out.println("OCHO");
                break;
            case 9:
                System.out.println("NUEVE");
                break;
            case 10:
                System.out.println("DIEZ");
                break;
            default:
                System.out.println("Numero errado");
                break;
        }
    }
    public static void Ejercicio1(){
        Scanner scan = new Scanner(System.in);
        boolean cond = true;
        int num1 = 0;
        int num2 = 0;
        while(cond) {
            System.out.println("Por favor ingrese dos números enteros positivos: ");
            num1 = scan.nextInt();
            num2 = scan.nextInt();
            if (num1 < 0 || num2 < 0) {
                System.out.println("Alguno de los dos números es negativo. Por favor digítelo positivo.");
            }else {
                cond = false;
            }
        }
        boolean flag = true;
        while (flag){
            System.out.println("Por favor escriba el tipo de operación que quiere realizar: 1. Suma, 2. Resta, 3. Multiplicación, 4. División 5. Para salir del programa");
            int opc = scan.nextInt();
            int resultado = 0;
            switch (opc) {
                case 1: {
                    resultado = num1 + num2;
                    break;
                }
                case 2: {
                    resultado = num1 - num2;
                    break;
                }
                case 3: {
                    resultado = num1 * num2;
                    break;
                }
                case 4: {
                    resultado = num1 / num2;
                    break;
                }
                case 5: {
                    flag=false;
                    break;
                }
                default: {
                    System.out.println("Número equivocado");
                    break;
                }
            }
            System.out.println("El resultado es " + resultado);
        }
    }
}
