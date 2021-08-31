
package com.programacion_bcv.ejercicio4;

public class Cliente {
    private String apellid;
    private String nombre;
    private String documento;
    private ClienteTipoEnum tipo;

    public Cliente(String apellid, String nombre, String documento, ClienteTipoEnum tipo) {
        this.apellid = apellid;
        this.nombre = nombre;
        this.documento = documento;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "apellid=" + apellid + ", nombre=" + nombre + ", documento=" + documento + ", tipo=" + tipo + '}';
    }
    
}
