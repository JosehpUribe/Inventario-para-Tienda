package com;

import com.clases.*;

public class Aplicacion {
    public static void main(String[] args) {
        TiendaElectronica tienda = new TiendaElectronica();

        Televisor tv1 = new Televisor("TV Samsung", 500.00, 10, 55, "4K");
        ComputadoraPortatil laptop1 = new ComputadoraPortatil("Laptop HP", 800.00, 5, "HP", 16, "ABC123");

        tienda.agregarProducto(tv1);
        tienda.agregarProducto(laptop1);

        tienda.mostrarProductos();

        tienda.realizarVenta("TV Samsung", 3);
        tienda.realizarVenta("Laptop HP", 1);
        tienda.realizarVenta("Laptop HP", 5); // Intentar vender más de lo disponible

        tienda.mostrarProductos();
    }
}