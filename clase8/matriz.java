package clase8;

public class matriz {
    public static void main(String[] args) {
        //Definimos un array de 3 filas x 6 columnas
        int matriz[][]={{3,15,10,4,8,19},
                        {7,11,20,9,5,6},
                        {18,1,2,16,17,12}};
        int numero = 0;
        //Recorremos el array multidimensional
        for (int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                if (j==3){
                    numero = matriz[i][j];
                    matriz[i][j] = matriz [i][j+1];
                    matriz[i][j+1] = numero;
                }
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
