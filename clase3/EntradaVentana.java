package clase3;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class EntradaVentana {
    public static void main(String[] args) {
        final double IVA = 0.16;
        String texto_num = JOptionPane.showInputDialog("Introduce el precio del producto");
        int precio = Integer.parseInt(texto_num);
        JOptionPane.showMessageDialog(null, "EL producto tiene un precio de " + precio + " y su precio final es de " + (precio + (precio * IVA)));

        String ax = JOptionPane.showInputDialog(null, "");
        int a = Integer.parseInt(ax);//se convierte el dato a entero
        Float b = Float.parseFloat(ax);//se convierte el dato a flotante
        Double c = Double.parseDouble(ax);// se convierte el dato a double
        Long d = Long.parseLong(ax);//se convierte el dato a long

        String[] opciones = {"Contento", "Triste", "Melancolico" };
        int opcion = JOptionPane.showOptionDialog(
                null //componente
                , "Como te siente hoy?" // Mensaje
                , "Opciones Personalizada" // Titulo en la barra del cuadro
                , JOptionPane.DEFAULT_OPTION // Tipo de opciones
                , JOptionPane.INFORMATION_MESSAGE // Tipo de mensaje (icono)
                , null // Icono (ninguno)
                , opciones // Opciones personalizadas
                , null // Opcion por defecto
        );
        JOptionPane.showMessageDialog(null, "Ha escogido "+opciones[opcion]);

        String cadena= "Tres tristes tigres comen trigo en tres tristes platos de trigo";
        System.out.println(cadena.charAt(0));
        System.out.println(cadena.charAt(11));
        System.out.println(cadena.endsWith("n"));
        System.out.println(cadena.startsWith("e"));
        System.out.println(cadena.equals("Tres tristes tigres comen trigo en tres tristes platos de trigo"));
        byte[] array_bytes=cadena.getBytes();
        System.out.println("Codigo ASCII de cada caracter");
        for (int i=0;i<array_bytes.length;i++){
            System.out.print(array_bytes[i]+" ");
        }
        System.out.println("");
        System.out.println(cadena.indexOf("trigo"));
        System.out.println(cadena.length());
        System.out.println(cadena.replace('e', 'a'));
        System.out.println(cadena.toLowerCase());
        System.out.println(cadena.toUpperCase());
    }

}
