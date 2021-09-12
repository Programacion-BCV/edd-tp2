package com.programacion_bcv.ejercicio5;

public enum MovimientoTipo {
    ENTRADA("Entrada"), SALIDA("Salida");

    private final String movTipo;

    private MovimientoTipo(String movTipo) {
        this.movTipo = movTipo;
    }

    public String getMovTipo() {
        return movTipo;
    }

    @Override
    public String toString() {

        return this.movTipo;
    }

}
