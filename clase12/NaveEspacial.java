package clase12;

public class NaveEspacial {
    private int ctripulantes;
    private int nturbinas;
    private String nombre;
    private float dfuselaje;

    NaveEspacial(){
    }
    public int getCtripulantes(){
        return ctripulantes;
    }
    public void setCtripulantes(int ctripulantes){
        this.ctripulantes = ctripulantes;
    }
    public float getDfuselaje(){
        return dfuselaje;
    }
    public void setDfuselaje(float dfuselaje){
        this.dfuselaje = dfuselaje;
    }
    public int getNturbinas(){
        return nturbinas;
    }
    public void setNturbinas(int nturbinas){
        this.nturbinas = nturbinas;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
