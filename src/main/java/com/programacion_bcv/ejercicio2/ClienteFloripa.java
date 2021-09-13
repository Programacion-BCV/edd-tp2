/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programacion_bcv.ejercicio2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 *
 * @author Mati
 */
public class ClienteFloripa {

    public static void main(String[] args) {

        MarcacionAdmin empleados = new MarcacionAdmin();

        Oficina of1 = new Oficina("Oficina 1", LocalTime.of(8, 15), LocalTime.of(12, 15));
        Oficina of2 = new Oficina("Oficina 2", LocalTime.of(8, 15), LocalTime.of(12, 15));
        Oficina of3 = new Oficina("Oficina 3", LocalTime.of(8, 15), LocalTime.of(12, 15));
        Oficina of4 = new Oficina("Oficina 4", LocalTime.of(8, 15), LocalTime.of(12, 15));
        Oficina of5 = new Oficina("Oficina 5", LocalTime.of(8, 15), LocalTime.of(12, 15));

        Empleado emp1 = new Empleado(13, "41630519", "Vera", "Matias", of1);
        Empleado emp2 = new Empleado(40, "45620906", "Gonzales", "Julián", of2);
        Empleado emp3 = new Empleado(72, "23590605", "Confalonieri", "Juan", of3);
        Empleado emp4 = new Empleado(6, "43269305", "Buenar", "Ramiro", of4);
        Empleado emp5 = new Empleado(4, "23598063", "Perez", "Alberto", of5);

        LocalDateTime l1 =LocalDateTime.now().plusMinutes(0);
        LocalDateTime l2 =LocalDateTime.now().plusMinutes(20);
        LocalDateTime l3 =LocalDateTime.now().plusMinutes(15);
        LocalDateTime l4 =LocalDateTime.now().plusMinutes(25);
        LocalDateTime l5 =LocalDateTime.now().plusMinutes(10);

        empleados.add(new Marcacion(7, emp1, l1, MarcacionTipo.ENTRADA));
        empleados.add(new Marcacion(5, emp2, l2, MarcacionTipo.ENTRADA));
        empleados.add(new Marcacion(8, emp3, l3, MarcacionTipo.SALIDA));
        empleados.add(new Marcacion(9, emp4, l4, MarcacionTipo.ENTRADA));
        empleados.add(new Marcacion(12, emp5, l5, MarcacionTipo.SALIDA));
        empleados.add(new Marcacion(15, emp1, l1, MarcacionTipo.ENTRADA));
        empleados.add(new Marcacion(1, emp2, l2, MarcacionTipo.ENTRADA));
        empleados.add(new Marcacion(3, emp3, l3, MarcacionTipo.SALIDA));
        empleados.add(new Marcacion(4, emp4, l4, MarcacionTipo.ENTRADA));
        empleados.add(new Marcacion(6, emp5, l5, MarcacionTipo.SALIDA));
        empleados.add(new Marcacion(10, emp1, l1, MarcacionTipo.ENTRADA));
        empleados.add(new Marcacion(14, emp2, l2, MarcacionTipo.ENTRADA));
        empleados.add(new Marcacion(11, emp3, l3, MarcacionTipo.SALIDA));
        empleados.add(new Marcacion(2, emp4, l4, MarcacionTipo.ENTRADA));
        empleados.add(new Marcacion(13, emp5, l5, MarcacionTipo.SALIDA));
        
        empleados.ordenar(new MarcacionNumeroComparator());
        System.out.println(empleados);
    }
}
