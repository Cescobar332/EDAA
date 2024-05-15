package clase10;

public class Estudiante {
    private String codigo;
    private int edad;
    private String nombre;

    public Estudiante(String nombre, int edad, String codigo){
        this.nombre=nombre;
        this.edad=edad;
        this.codigo=codigo;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre1){
        nombre = nombre1;
    }
    public void Estudiar(){
        System.out.println(nombre + " está estudiando...");
    }
    public void IrAClase(){
        System.out.println(nombre + " se dirige a la Universidad");
    }
    public void Trasnochar(){
        System.out.println(nombre + " no fue a dormirse temprano");
    }
}
