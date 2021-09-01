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
public class EmpleadoLegajoComparator implements Comparator<Empleado>{

    @Override
    public int compare(Empleado o1, Empleado o2){
        return o1.getLegajo().compareTo(o2.getLegajo());
    }

   

    
    
    
}
