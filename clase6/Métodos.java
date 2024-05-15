package clase6;

public class Métodos {
    public static void main(String[] args){
        int operador1 = 3;
        int operador2 = 5;
        int resultado = sumaNumeros(operador1, operador2);
        System.out.println("El resultado de la suma es "+ resultado);
        int resultado2 = restaNumeros(operador1, operador2);
        System.out.println("El resultado de la resta es: " + resultado2);
        int resultado3 = multiNumeros(operador1, operador2);
        System.out.println("El resultado de la multiplicación es: " + resultado3);
        int resultado4 = diviNumeros(operador1, operador2);
        System.out.println("El resultado de la división es: " + resultado4);
    }
    public static int sumaNumeros(int num1, int num2){
        int resultado = num1+num2;
        return resultado;
    }
    public static int restaNumeros(int num1, int num2){
        int resultado = num1-num2;
        return resultado;
    }
    public static int multiNumeros(int num1, int num2){
        int resultado = num1*num2;
        return resultado;
    }
    public static int diviNumeros(int num1, int num2){
        int resultado = num1/num2;
        return resultado;
    }
}
