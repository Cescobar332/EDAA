package clase9;

import javax.swing.JFrame;

public class UIJava {
    public static void main(String[] args){
        JFrame w = new JFrame("Mi primer Frame");
        w.setSize(500, 400);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setLocationRelativeTo(null);
        w.setVisible(true);
    }
}
