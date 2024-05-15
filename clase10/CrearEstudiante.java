package clase10;

public class CrearEstudiante {
    public static void main(String[] args){
        Estudiante e1 = new Estudiante("Sex", 69, "U00056221");
        e1.Estudiar();
        //e1.setNombre("Coito");
        System.err.println("El estudiante se llama " + e1.getNombre());
    }
}
