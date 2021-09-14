package com.programacion_bcv.ejercicio5;

import java.util.Objects;

public class ProductoCantidad {
    private Producto producto;
    private int cantidad;

    public ProductoCantidad(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductoCantidad)) return false;
        ProductoCantidad that = (ProductoCantidad) o;
        return getProducto().equals(that.getProducto());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProducto());
    }

    @Override
    public String toString() {
        return "~~~~~Producto~~~~~" + "\n" + this.producto + "\n" + "~Cantidad: " + this.cantidad + "\n"
                + "~~~~~~~~~~~~~~~~~~" + "\n";
    }
}
