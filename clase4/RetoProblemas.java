package clase4;

import java.util.Scanner;
import java.lang.Math;

import static java.lang.Math.pow;

public class RetoProblemas {
    public static void opr(){
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
    public static void cilindro(){
        Scanner scan = new Scanner(System.in);
        boolean cond = true;
        double r = 0.0, h = 0.0;
        while (cond) {
            System.out.println("Digite el valor del radio: ");
            r = scan.nextDouble();
            System.out.println("Digite el valor de la altura: ");
            h = scan.nextDouble();
            if (r < 0 || h < 0 ){
                System.out.println("Los valores del radio y la altura han de ser positivos");
            }else {
                cond=false;
            }
        }
        double A = (2 * (Math.PI * (pow(r, 2)))) + ((2 * Math.PI * r) * h);
        System.out.println("El valor del Área del cilindro es: " + A);
        double V = ((Math.PI * (pow(r, 2))) * h);
        System.out.println("El valor del volumen del cilindro es: " + V);
    }
    public static void elipsoide(){
        Scanner scan = new Scanner(System.in);
        boolean cond = true;
        double a = 0.0, b = 0.0, c = 0.0;
        while (cond){
            System.out.println("Digite el valor de la longitud: ");
            a = scan.nextDouble();
            System.out.println("Digite el valor de la anchura: ");
            b = scan.nextDouble();
            System.out.println("Digite el valor de la altura: ");
            c = scan.nextDouble();
            if (a < 0 || b < 0 || c < 0){
                System.out.println("Los valores han de ser positivos");
            }else {
                cond=false;
            }
        }
        double V = ((4/3) * Math.PI * a * b * c);
        System.out.println("El valor del volumen de la elipsoide es: " + V);
    }
    public static void llamada(){
        Scanner scan = new Scanner(System.in);
        int minutos;
        double IVA = 0.2;
        System.out.println("Cuantos minutos desea comprar?");
        minutos = scan.nextInt();
        int valor = 355;
        double total;
        total = (minutos * valor) + ((valor*minutos)*IVA);
        System.out.println("El valor total es: $" + total);
    }
    public static void farmacia(){
        Scanner scan = new Scanner(System.in);
        boolean cond = true;
        String medicamento = "";
        int precio=0;
        System.out.println("Digite el 2 para salir del programa, cualquier otro número para ejecutarlo");
        int op;
        while (cond){
            op = scan.nextInt();
            if (op == 2){
                cond = false;
            }else {
                System.out.println("Digite el nombre del medicamento: ");
                medicamento = scan.nextLine();
                System.out.println("Digite el precio del medicamento: ");
                precio = scan.nextInt();
                float descuento = (precio*13)/100;
                System.out.println("El valor del descuento es: $" + descuento);
                float result = precio - ((precio*13)/100);
                System.out.println("El valor total a pagar del medicamento " + medicamento + " es: $" + result);
            }
        }
    }
    public static void main(String[] args){
        opr();
        cilindro();
        elipsoide();
       llamada();
        farmacia();
    }
}
