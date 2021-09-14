/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programacion_bcv.ejercicio2;

import java.time.LocalTime;

/**
 *
 * @author Mati
 */
class Oficina {
    private String nombre;
    private LocalTime horaEntrada;
    private LocalTime horaSalida;

    public Oficina(String nombre, LocalTime horaEntrada, LocalTime horaSalida) {
        this.nombre = nombre;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    @Override
    public String toString() {
        return ("\n" + "Nombre: " + nombre + "\n" + "Hora Entrada: " + horaEntrada + "\n" + "Hora Salida: " + horaSalida);
    }
    
    
}
