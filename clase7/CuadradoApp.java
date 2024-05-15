package clase7;

import javax.swing.JOptionPane;
public class CuadradoApp {
    public static void main(String[] args) {
        String texto=JOptionPane.showInputDialog("Escribe el lado del cuadrado");
        int lado=Integer.parseInt(texto);
        cuadrado(lado);
    }
    public static void cuadrado (int lado){
        int numeroasteriscos=lado;
        //Dibujamos la parte de arriba del cuadrado
        for(int cont=0;numeroasteriscos>cont;cont++){
            System.out.print("-");
        }
        System.out.println("");
        //Usamos un bucle anidado para dibujar los asteriscos del medio
        for(int cont=1;(numeroasteriscos-2)>=cont;cont++){
            System.out.print("|");
            //Este bucle dibuja los espacio entre el primer y ultimo asterisco
            for (int i=0;(numeroasteriscos-2)>i;i++){
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println("");
        }
        //Dibujamos la parte de abajo del cuadrado
        for(int cont=0;numeroasteriscos>cont;cont++){
            System.out.print("-");
        }
    }
}