package clase6;

import javax.swing.JOptionPane;

public class RetoSwitch {
    public static void main(String[] args) throws Exception {
        JOptionPane.showMessageDialog(null, "Bienvenido(a)");

        boolean cond = true;
        while (cond){
            String operador = JOptionPane.showInputDialog("Ingresa el operador (+, -, *, /, %)");
            char opc = operador.charAt(0);
            String num1 = JOptionPane.showInputDialog("Ingresa el primer número: ");
            int numero1 = Integer.parseInt(num1);
            String num2 = JOptionPane.showInputDialog("Ingresa el segundo número: ");
            int numero2 = Integer.parseInt(num2);
            double div = numero1 / numero2;
            if (numero1 >= 0 && numero2 > 0){
                switch (opc) {
                    case '+':
                        System.out.printf("El resultado de la suma es: \n" + (numero1 + numero2));
                        break;
                    case '-':
                        System.out.printf("El resultado de la resta es: \n" + (numero1 - numero2));
                        break;
                    case '*':
                        System.out.printf("El resultado de la multiplicación es: \n" + (numero1 * numero2));
                        break;
                    case '/':
                        System.out.printf("El resultado de la división es: \n" + div);
                        break;
                    case '%':
                        System.out.printf("El residuo de la división es: \n" + (numero1 % numero2));
                }
                cond = false;
            }else {
                JOptionPane.showMessageDialog(null, "Los números han de ser mayores a 0");

            }
        }
    }
}
