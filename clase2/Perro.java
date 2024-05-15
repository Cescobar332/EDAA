package clase2;

public class Perro {
    private int peso;
    public int getPeso() {
        return peso;
    }
    public void setPeso(int nuevoPeso) {
        if (nuevoPeso > 0) {
            peso = nuevoPeso;
        }
    }
}
