package org.example;

public class Productos {
    private int codigo;
    private double precio;
    private String nombre;

    public Productos() {
    }

    public Productos(int codigo, double precio, String nombre) {
        this.codigo = codigo;
        this.precio = precio;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "codigo=" + codigo +
                ", precio=" + precio +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}



