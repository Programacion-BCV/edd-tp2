package com.programacion_bcv.ejercicio4;

import java.util.Comparator;

public class CreditoTotalDevolverComparator implements Comparator<Credito> {
    public int compare(Credito o1, Credito o2) {
        return o1.getTotalADevolver().compareTo(o2.getTotalADevolver());
    }

}
