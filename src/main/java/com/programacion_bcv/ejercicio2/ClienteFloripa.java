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
public class ClienteFloripa {

    public static void main(String[] args) {
        Oficina of1 = new Oficina("Oficina 1", LocalTime.of(08, 15), LocalTime.of(12, 15));
        Oficina of2 = new Oficina("Oficina 2", LocalTime.of(08, 15), LocalTime.of(12, 15));
        Oficina of3 = new Oficina("Oficina 3", LocalTime.of(08, 15), LocalTime.of(12, 15));
        Oficina of4 = new Oficina("Oficina 4", LocalTime.of(08, 15), LocalTime.of(12, 15));
        Oficina of5 = new Oficina("Oficina 5", LocalTime.of(08, 15), LocalTime.of(12, 15));

        Empleado emp1 = new Empleado(12346, "41630519", "Vera", "Matias", of1);
        Empleado emp2 = new Empleado(12345, "41630519", "Vera", "Matias", of2);
        Empleado emp3 = new Empleado(12347, "41630519", "Vera", "Matias", of3);
        Empleado emp4 = new Empleado(12348, "41630519", "Vera", "Matias", of4);
        Empleado emp5 = new Empleado(12349, "41630519", "Vera", "Matias", of5);
    }
}
