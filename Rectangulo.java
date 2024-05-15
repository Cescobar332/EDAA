import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;

public class Rectangulo {
    private JTextField txtBase;
    private JTextField txtAltura;
    private JTextField txtArea;
    private JTextField txtPerimetro;
    private JButton calcular;
    private JLabel lblBase;
    private JLabel lblAltura;
    private JLabel lblArea;
    private JLabel lblPerimetro;
    private JButton limpiar;

    public Rectangulo() {
        initComponents();
        calcular.addInputMethodListener(new InputMethodListener() {
            @Override
            public void inputMethodTextChanged(InputMethodEvent event) {

            }

            @Override
            public void caretPositionChanged(InputMethodEvent event) {

            }
        });
        calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double base, altura, area, perimetro;
                base = Double.valueOf(txtBase.getText());
                altura = Double.valueOf(txtAltura.getText());
                area = base*altura;
                txtArea.setText(String.valueOf(area));
                perimetro= 2*(base+altura);
                txtPerimetro.setText(String.valueOf(perimetro));
            }
        });
    }

    private void initComponents() {
    }

    private void calcularActionPerformed(java.awt.event.ActionEvent evt){

    }
    private void limpiarActionPerformed(java.awt.event.ActionEvent evt){
        txtAltura.setText("0");

    }
    public static void main(String[] args){

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
