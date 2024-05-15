package clase11.edificio;

public class Edificio {
    private int pisos;
    private float area;
    private int inquilinos;

    Edificio(){
    }
    public int getPisos(){
        return pisos;
    }
    public void setPisos(int pisos){
        this.pisos = pisos;
    }
    public float getArea(){
        return area;
    }
    public void setArea(float area){
        this.area = area;
    }
    public int getInquilinos(){
        return inquilinos;
    }
    public void setInquilinos(int inquilinos){
        this.inquilinos = inquilinos;
    }
}
