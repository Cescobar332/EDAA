package clase3;

import java.util.Scanner;

public class EntradaConsola {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int precioProducto;
        final double IVA=0.16;

        System.out.println("Digite un precio del producto");
        precioProducto = in.nextInt();

        System.out.println("Informacion del producto");
        System.out.println("El precio del producto es "+precioProducto);
        System.out.println("El precio del producto, incluyendo el IVA, es "+(precioProducto+(precioProducto*IVA)));
    }

}
