package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String cliente;
    private String telefono;
    private String correo;
    private List<Productos> productos = new ArrayList<>();;


    public Pedido() {
    }

    public Pedido(String cliente, String telefono, String correo, List<Productos> productos) {
        this.cliente = cliente;
        this.telefono = telefono;
        this.correo = correo;
        this.productos = productos;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Productos> getProductos() {
        return productos;
    }

    public void setProductos(List<Productos> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente='" + cliente + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", productos=" + productos +
                '}';
    }
    // Metodo para agregar producto
    public void agregarProducto(Productos producto) {
        this.productos.add(producto);
    }
}

