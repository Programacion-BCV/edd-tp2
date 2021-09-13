/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programacion_bcv.ejercicio2;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Mati
 */
public class MarcacionAdmin extends MarcacionesAdminAbstract {

    @Override
    public List<Empleado> empleados() {
        int indice;
        List<Empleado> resultado = new ArrayList();
        for (Marcacion marcacion : marcacionesList) {
            indice = resultado.indexOf(marcacion.getEmpleado());
            if (indice == -1) {
                resultado.add(marcacion.getEmpleado());
            }
        }
        return resultado;
    }

    @Override
    public List<Marcacion> filtroPorEmpleado(Empleado empleado) {
        List<Marcacion> resultado = new ArrayList();
        for (Marcacion marcacion : marcacionesList) {
            if (marcacion.getEmpleado().equals(empleado)) {
                resultado.add(marcacion);
            }
        }
        return resultado;
    }

    @Override
    public List<Marcacion> filtroPorTipo(MarcacionTipo tipo) {
        List<Marcacion> resultado = new ArrayList();
        for (Marcacion marcacion : marcacionesList) {
            if (marcacion.getTipo().getDescripcion() == tipo.getDescripcion()) {
                resultado.add(marcacion);
            }
        }
        return resultado;
    }

    @Override
    public List<Marcacion> llegaronTarde() {
        List<Marcacion> result = new ArrayList();
        LocalTime horaEntrada = LocalTime.of(7, 0, 0);

        for (Marcacion marcacion : marcacionesList) {
            if (marcacion.getFechaHora().toLocalTime().isBefore(horaEntrada)) {
                result.add(marcacion);
            }

        }

        return result;
    }

    @Override
    public void ordenar() {
        Collections.sort(this.marcacionesList);
    }

    @Override
    public void ordenar(Comparator comparator) {
        marcacionesList.sort(comparator);
    }

    @Override
    public String toString() {
        String resultado = "";

        for (Marcacion p : marcacionesList) {
            resultado += p.toString() + "\n";
        }

        resultado = resultado.substring(0, resultado.lastIndexOf(","));

        return resultado;
    }

}
