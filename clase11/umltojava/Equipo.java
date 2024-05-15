package clase11.umltojava;

public class Equipo {
    private int integrantes;
    private String nombre;
    private Persona persona = new Persona();
    Equipo(){
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getIntegrantes(){
        return integrantes;
    }
    public void setIntegrantes(int integrantes) {
        this.integrantes = integrantes;
    }
}
