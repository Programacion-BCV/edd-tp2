package com.programacion_bcv.ejercicio5;

public class Producto {
    private ProductoTipo tipo;
    private ProductoMarca marca;
    private String productoModelo;

    public Producto(ProductoTipo tipo, ProductoMarca marca, String productoModelo) {
        this.tipo = tipo;
        this.marca = marca;
        this.productoModelo = productoModelo;
    }

    public ProductoTipo getTipo() {
        return tipo;
    }

    public void setTipo(ProductoTipo tipo) {
        this.tipo = tipo;
    }

    public ProductoMarca getMarca() {
        return marca;
    }

    public void setMarca(ProductoMarca marca) {
        this.marca = marca;
    }

    public String getProductoModelo() {
        return productoModelo;
    }

    public void setProductoModelo(String productoModelo) {
        this.productoModelo = productoModelo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((productoModelo == null) ? 0 : productoModelo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Producto other = (Producto) obj;
        if (productoModelo == null) {
            if (other.productoModelo != null)
                return false;
        } else if (!productoModelo.equals(other.productoModelo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "~Tipo: " + this.tipo + "\n" + "~Marca: " + this.marca + "\n" + "~Modelo: " + this.productoModelo;
    }

}
