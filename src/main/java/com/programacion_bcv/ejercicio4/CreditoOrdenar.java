
package com.programacion_bcv.ejercicio4;

import java.util.Comparator;


public class CreditoOrdenar implements Comparator <Credito> {

    @Override
    public int compare(Credito o1, Credito o2) {
        int resultado = o1.getSucursal().compareTo(o2.getSucursal());
        if (resultado == 0){
            resultado = o1.compareTo(o2);
        }
        return resultado;
    }

//    @Override
//    public int compare(Credito o1, Credito o2) {
//      
//    }

    
}
