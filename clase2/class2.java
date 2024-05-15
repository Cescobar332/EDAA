package clase2;

public class class2 {

    public static void main(String[] args) {
        int temperatura=20;
        boolean haceSol = false, nevando = true;
        if (temperatura > 15) {
            if (temperatura > 25) {
                // Si la temperatura es mayor que 25 ...
                System.out.println("A la playa!!!");
            } else {
                System.out.println("A la montaña!!!");
            }
        } else if (temperatura < 5) {
            if (nevando) {
                System.out.println("A esquiar!!!");
            }
        } else {
            System.out.println("A descansar... zZz");
        }
        if (haceSol) {
            System.out.println("No te olvides la sombrilla");
        }
        if (nevando || haceSol){
            System.out.println("Que bien");
        }
        if ((temperatura < 0 || temperatura > 30) && haceSol){
            System.out.println("Mejor me quedo en casa");
        }
    }
}

