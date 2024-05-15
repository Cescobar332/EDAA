package clase6;

public class OperadorPregunta {
    public static void main(String[] args) throws Exception{
        int numero = 52;
        String texto = "";
        texto = (numero % 2 == 0) ? "PAR" : "IMAPR";
        System.out.println(texto);
    }
}
