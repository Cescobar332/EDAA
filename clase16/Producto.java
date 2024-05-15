package clase16;

import java.io.Serializable;

public class Producto implements Serializable {
    private String descripcion;
    private int cantidad;
    private String nombre;
    private float valorUnitario;

    public Producto(String nombre, String descripcion, Integer cantidad, Float valorUnitario) {
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.cantidad=cantidad;
        this.valorUnitario=valorUnitario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String toString(){

        return "Producto ("+ nombre + ", " + descripcion + ", cantidad= " + cantidad + ", valor= " + valorUnitario + ")";
    }
}