package clase13;

import java.io.*;

public class RetoPersistencia {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        escritura();
        System.out.println(lectura());
    }

    public static String lectura() {
        String texto = new String();
        try {
            FileReader fr = new FileReader("Carlos.txt");
            BufferedReader entrada = new BufferedReader(fr);
            String s;
            while ((s = entrada.readLine()) != null) {
                texto += s;
                texto += "\n";
            }
            entrada.close();
        } catch (java.io.FileNotFoundException fnfex) {
            System.out.println("Archivo no encontrado: " + fnfex);
        } catch (java.io.IOException ioex) {
        }
        return texto;
    }

    public static void escritura() {
        try {
            FileWriter fw = new FileWriter("Carlos.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            salida.println("Fecha de nacimiento: 28/04/2004\n" +
                    "Nombre: Carlos Fernando Escobar Silva\n" +
                    "U00056221\n" +
                    "Clase: Estructura de datos y análisis de algoritmos\n" +
                    "Correo: cescobar332@unab.edu.co\n" +
                    "Wp: 3166071650\n" +
                    "Semestre: 3\n" +
                    "De donde eres? Bucaramanga\n" +
                    "Estado civil: Soltero\n");
            salida.close();
        } catch (java.io.IOException ioex) {
        }
    }
}
