package clase2;

public class Prueba {
    static int variableGlobal=10;
    public static void metodoPrueba (){
        int variableMetodo=40;
        for (int i=0;i<10;i++){
            System.out.println("La variable i vale "+i);
        }
        //System.out.println("La variable i vale "+i);
        System.out.println("La variable local vale "+variableMetodo);
    }
    public static void main(String[] args) {
        int variableLocal1=20;
        if (variableGlobal==10){
            int variableLocal2=30;
            System.out.println("La variable local 1 vale "+variableLocal1);
            System.out.println("La variable local 2 vale "+variableLocal2);
        }
        System.out.println("La variable local Global vale "+variableGlobal);
        metodoPrueba();
    }

}
