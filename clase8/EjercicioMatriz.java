package clase8;
import java.util.Scanner;

public class EjercicioMatriz {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numero = 1;
        int i = 0;
        int j = 0;
        System.out.println("Digite el tamaño de la matriz");
        i = scan.nextInt();
        j = scan.nextInt();
        int matriz[][]=new int [i][j];
        for (i=0;i<matriz.length;i++){
            for(j=0;j<matriz[0].length;j++){
                if (i==j){
                    matriz[i][j] = numero;
                }
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
