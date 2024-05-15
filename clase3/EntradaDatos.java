package clase3;

/* Ejemplo de uso de las instrucciones de entrada
(desde el teclado) y salida (en la pantalla).
*/

import java.io.*;

public class EntradaDatos {
    public static void main (String[] args) throws Exception {

        /* Declaraci�n de variables locales */

        int n, m, suma;
        double x, y, producto;
        char inicial;
        boolean femenino;
        String linea, apellidos, genero;
        BufferedReader teclado=new BufferedReader(
                new InputStreamReader(System.in));

        /* Entrada de datos por teclado y salida a trav�s de la pantalla. */

        System.out.println("Introduzca dos n�meros enteros: ");
        linea = teclado.readLine(); n = Integer.parseInt(linea);  // leer entero
        linea = teclado.readLine(); m = Integer.parseInt(linea);
        suma = n + m;
        System.out.println("La suma de los dos n�meros es " + suma + '\n'); // escribir

        System.out.println("Introduzca dos n�meros reales: ");
        linea = teclado.readLine(); x = Double.parseDouble(linea);  // leer real
        linea = teclado.readLine(); y = Double.parseDouble(linea);
        producto = x * y;
        System.out.println("El producto de los dos n�meros es " + producto + '\n');

        System.out.println("Introduzca la inicial de su nombre: ");
        linea = teclado.readLine(); inicial = linea.charAt(0); // leer car�cter
        System.out.println("Introduzca sus apellidos: ");
        apellidos = teclado.readLine();  // leer cadena de caracteres
        System.out.println("Introduzca su g�nero (femenino o masculino): ");
        genero = teclado.readLine();

        if (genero.equals("femenino")) {
            femenino = true;  // asignaci�n de valor a variable booleana
        } else {
            femenino = false;
        }

        if (femenino) {
            System.out.print("Bienvenida ");
        } else {
            System.out.print("Bienvenido ");
        }
        System.out.println(inicial + ". " + apellidos);

    }

}