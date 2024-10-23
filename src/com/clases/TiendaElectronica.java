package com.clases;

import java.util.ArrayList;

public class TiendaElectronica {
    private ArrayList<ProductoElectrodomestico> listaDeProductos;

    public TiendaElectronica() {
        this.listaDeProductos = new ArrayList<>();
    }

    public void agregarProducto(ProductoElectrodomestico producto) {
        listaDeProductos.add(producto);
    }

    public void mostrarProductos() {
        for (ProductoElectrodomestico producto : listaDeProductos) {
            producto.mostrarInformacion();
            System.out.println("------------------------");
        }
    }

    public ProductoElectrodomestico buscarProductoPorNombre(String nombre) {
        for (ProductoElectrodomestico producto : listaDeProductos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }

    public void realizarVenta(String nombreProducto, int cantidad) {
        ProductoElectrodomestico producto = buscarProductoPorNombre(nombreProducto);
        if (producto != null) {
            if (producto.getCantidadDisponible() >= cantidad) {
                producto.setCantidadDisponible(producto.getCantidadDisponible() - cantidad);
                System.out.println("Venta realizada: " + cantidad + " de " + nombreProducto);
            } else {
                System.out.println("Producto agotado: " + nombreProducto);
            }
        } else {
            System.out.println("Producto no encontrado: " + nombreProducto);
        }
    }
}