package clase15;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Crea y escribe en un fichero 10 objetos de la clase Persona. Luego los lee y
 * los muestra por pantalla.
 *
 */
public class EscribirYLeer {

    public static ArrayList<Persona> personas = new ArrayList<Persona>();

    /**
     * main del ejemplo. Escribe el fichero y lo lee.
     *
     * @param args
     *            se ignoran
     */
    public static void main(String[] args) {
        EscribirYLeer eyl = new EscribirYLeer();
        eyl.escribeFichero("mimascotajair.dat");
        eyl.leeFichero("mimascotajair.dat");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }

    /**
     * Escribe en el fichero que se le pasa y empezandolo desde cero, 5 objetos
     * de la clase Persona.
     *
     * @param fichero
     *            Path completo del fichero que se quiere escribir
     */
    public void escribeFichero(String fichero) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero));
            for (int i = 0; i < 5; i++) {
                // ojo, se hace un new por cada Persona. El new dentro
                // del bucle.
                Persona p = new Persona(i);
                oos.writeObject(p);
            }
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    /**
     * Se leen todas las Persona en el fichero y se escriben por pantalla.
     *
     * @param fichero
     *            El path completo del fichero que contiene las Persona.
     */
    public void leeFichero(String fichero) {
        try {

            // Se crea un ObjectInputStream
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero));

            // Se lee el primer objeto
            Object aux;

            // Mientras haya objetos
            do {
                aux = ois.readObject();
                if (aux instanceof Persona)
                    personas.add((Persona) aux);

            }while (aux != null);
            ois.close();

        } catch (EOFException e1) {
            System.out.println("Fin de fichero");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
