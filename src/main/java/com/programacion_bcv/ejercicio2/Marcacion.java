/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programacion_bcv.ejercicio2;

import java.time.LocalDateTime;

/**
 *
 * @author Mati
 */
public class Marcacion implements Comparable<Marcacion> {
    private int numero;
    private Empleado empleado;
    private LocalDateTime fechaHora;
    private MarcacionTipo tipo;

    public Marcacion(int numero, Empleado empleado, LocalDateTime fechaHora, MarcacionTipo tipo) {
        this.numero = numero;
        this.empleado = empleado;
        this.fechaHora = fechaHora;
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public MarcacionTipo getTipo() {
        return tipo;
    }

    public void setTipo(MarcacionTipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "----------------------"+"\n"+"Marcacion{" + "numero=" + numero + ", empleado=" + empleado + ", fechaHora=" + fechaHora + ", tipo="
                + tipo + "}" +"\n"+"----------------------";
    }

    @Override
    public int compareTo(Marcacion o) {
        return this.fechaHora.compareTo(o.getFechaHora());
    }

}
