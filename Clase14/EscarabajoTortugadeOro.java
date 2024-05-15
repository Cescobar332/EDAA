package Clase14;

import java.io.*;

public class EscarabajoTortugadeOro implements Serializable {
    private String territorio;
    private String color;
    private String nombre;
    private String alimentacion;

    EscarabajoTortugadeOro(){
    }
    public String getTerritorio(){
        return territorio;
    }
    public void setTerritorio(String territorio){
        this.territorio = territorio;
    }
    public String getColor(){return color;}
    public void setColor(String color){
        this.color = color;
    }
    public String getAlimentacion(){
        return alimentacion;
    }
    public void setAlimentacion(String alimentacion){this.alimentacion = alimentacion;}
    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}
}
