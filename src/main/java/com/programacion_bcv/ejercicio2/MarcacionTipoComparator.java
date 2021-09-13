package com.programacion_bcv.ejercicio2;

import java.util.Comparator;

public class MarcacionTipoComparator implements Comparator<Marcacion>  {
    
    @Override
    public int compare(Marcacion o1, Marcacion o2) {
       return o1.getTipo().compareTo(o2.getTipo());
    }
}
