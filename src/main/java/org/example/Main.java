package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Productos> listaPedido1 = new ArrayList<>();
        List<Productos> listaPedido2 = new ArrayList<>();


        Productos prod1 = new Productos(12784, 12000, "Gafas");
        Productos prod2 = new Productos(45800, 10000, "Camisa");
        Productos prod3 = new Productos(78655, 122000, "Balon");

        Pedido ped1 = new Pedido("Maria", "312588452", "maria@gmail", listaPedido1);
        Pedido ped2 = new Pedido("Monica", "3138999862", "moni@gmail", listaPedido2);

        ped1.agregarProducto(prod1);
        ped1.agregarProducto(prod2);
        ped1.agregarProducto(prod3);

        ped2.agregarProducto(prod1);
        ped2.agregarProducto(prod3);

        System.out.println("Pedido de: " + ped1.infocliente());
        System.out.println("Productos en el pedido:");

        for (Productos p : ped1.getProductos()) {
            System.out.println(p);
        }
        System.out.println("""
              
                
     """);
        System.out.println("Pedido de: " + ped2.infocliente());
        System.out.println("-------Productos en el pedido:-----------");
        for (Productos p : ped2.getProductos()) {
            System.out.println(p);
        }
    }
}
