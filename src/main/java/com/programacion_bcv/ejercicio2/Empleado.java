/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programacion_bcv.ejercicio2;

import java.util.Objects;

/**
 *
 * @author Mati
 */
public class Empleado implements Comparable<Empleado> {

    private int legajo;
    private String documento;
    private String apellido;
    private String nombre;
    private Oficina oficina;

    public Empleado() {

    }

    public Empleado(int legajo, String documento, String apeliido, String nombre, Oficina oficina) {
        this.legajo = legajo;
        this.documento = documento;
        this.apellido = apeliido;
        this.nombre = nombre;
        this.oficina = oficina;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.documento);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (!Objects.equals(this.documento, other.documento)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return ("\n" + "Legajo: " + legajo + "\n" + "Documento: " + documento + "\n" + "Apellido: "
                + apellido + "\n" + "Nombre: " + nombre + "\n" + "------Oficina------" + oficina + "\n");
    }

    @Override
    public int compareTo(Empleado o) {
        return Integer.compare(this.legajo, o.getLegajo());
    }

}
