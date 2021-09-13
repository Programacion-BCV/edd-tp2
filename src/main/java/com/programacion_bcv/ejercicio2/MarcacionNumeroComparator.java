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
public class MarcacionNumeroComparator implements Comparator<Marcacion> {

    @Override
    public int compare(Marcacion o1, Marcacion o2) {
        return Integer.compare(o1.getNumero(),o2.getNumero());
    }

}
