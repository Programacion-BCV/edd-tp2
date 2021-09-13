/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programacion_bcv.ejercicio2;

import java.util.Comparator;

/**
 *
 * @author Mati
 */
public class EmpleadoNombreComparator implements Comparator<Empleado> {

    @Override
    public int compare(Empleado o1, Empleado o2) {
       
        if (o1 == null && o2 == null) {
            return 0;
        } else{
            if (o1 != null && o2 == null) {
                return 1;
            }
            if (o1 == null && o2 != null) {
                return -1;
            }
        }
        
        int resultado = o1.getApellido().compareTo(o2.getApellido());

        if (resultado == 0) {
            resultado = o1.getNombre().compareTo(o2.getNombre());
        }
        return resultado;
    }
}
