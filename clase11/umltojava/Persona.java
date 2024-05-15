package clase11.umltojava;

public class Persona {
    private String cedula;
    private int edad;
    Persona(){
    }

    public String getCedula(){
        return cedula;
    }
    public void setCedula(String cedula){
        this.cedula = cedula;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
}
