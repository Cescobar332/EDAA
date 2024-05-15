package clase15;

import java.io.Serializable;

public class Persona implements Serializable {

    public String nombre;
    public String apellido;
    public Mascota mascota = new Mascota();
    public transient int edad;

    /**
     * Rellena los campos a�adiendo i a unos nombres por defecto
     *
     * @param i
     *            Un valor para a�adir al final de los nombres
     */
    public Persona(int i) {
        setPersona(i);
    }

    public void setPersona(int i) {
        nombre = "Carlos" + i;
        apellido = "Escobar" + i;
        mascota.nombre = "Jair" + i;
        mascota.numeroPatas = i;
        edad = i;

    }


    public String toString() {
        return nombre + " " + apellido + " de " + edad + " a�os tiene como mascota a " + mascota.nombre + " de "
                + mascota.numeroPatas + " patas.";
    }



}