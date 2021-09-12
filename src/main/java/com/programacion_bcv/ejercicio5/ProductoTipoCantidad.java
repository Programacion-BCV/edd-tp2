package com.programacion_bcv.ejercicio5;

public class ProductoTipoCantidad {
    private ProductoTipo tipo;
    private int cantidad;

    public ProductoTipoCantidad(ProductoTipo tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public ProductoTipo getTipo() {
        return tipo;
    }

    public void setTipo(ProductoTipo tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
        ProductoTipoCantidad other = (ProductoTipoCantidad) obj;
        if (tipo == null) {
            if (other.tipo != null)
                return false;
        } else if (!tipo.equals(other.tipo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "~~~~~~~~~~~~~~~~~~" + "\n" + "~Tipo de producto: " + this.tipo + "\n" + "~Cantidad: " + this.cantidad + "\n"
                + "~~~~~~~~~~~~~~~~~~";
    }

}
