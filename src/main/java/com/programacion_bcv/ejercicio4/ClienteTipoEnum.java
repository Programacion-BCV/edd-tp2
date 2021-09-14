
package com.programacion_bcv.ejercicio4;

public enum ClienteTipoEnum {
    PERSONA("Persona"), COMERCIO("Comercio"), EMPRESACONSTRUCCION("Empresa de construccion");

    private final String descripcion;

    ClienteTipoEnum(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "ClienteTipoEnum{" +
                "descripcion='" + descripcion + '\'' +
                '}';
    }
}
