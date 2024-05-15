package clase6;

import javax.swing.*;

public class array {
    public static void main(String[] args){
        int num[] = new int [10];
        int multiplo = 5;
        //num[0] = 5;
        //num[1] = 9;
        //System.out.println(num[0]);
        //System.out.println(num[1]);
        for (int i=0; i< num.length;i++){
            num[i]=i*multiplo;
            System.out.println(num[i]);
        }
        int num2 = 0;
        String mensaje = "Introduce un numero entre 0 y 10";
        do{
            String texto= JOptionPane.showInputDialog(mensaje);
            num2=Integer.parseInt(texto);
        }while(num2>=10 || num2<0);
        System.out.println("El numero introducido es "+num2);
    }
}
