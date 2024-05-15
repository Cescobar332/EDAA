package clase2;

public class CalculadoraDeBonos {
    public static void main(String[] args) {
        int salario; // salario de una persona
        String mensajeDeBono; // especifica el bono de trabajo
        salario = 50000;
        mensajeDeBono = "Bono $" + (.02 * salario);
        System.out.println(mensajeDeBono);
    } // fin del main
}
