/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programacion_bcv.ejercicio2;

/**
 *
 * @author Mati
 */
public enum MarcacionTipo {
    ENTRADA("Entrada"), SALIDA("Salida");

    private final String descripcion;

    public String getDescripcion() {
        return descripcion;
    }
    
    private MarcacionTipo(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return descripcion;
    }

}
