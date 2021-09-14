/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programacion_bcv.ejercicio2;

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

        LocalDateTime fecha1 = LocalDateTime.of(2020, Month.SEPTEMBER, 13, 8, 0).plusMinutes(0);
        LocalDateTime fecha2 = LocalDateTime.of(2020, Month.SEPTEMBER, 13, 8, 0).plusMinutes(20);
        LocalDateTime fecha3 = LocalDateTime.of(2020, Month.SEPTEMBER, 13, 12, 0).plusMinutes(15);
        LocalDateTime fecha4 = LocalDateTime.of(2020, Month.SEPTEMBER, 13, 7, 0).plusMinutes(25);
        LocalDateTime fecha5 = LocalDateTime.of(2020, Month.SEPTEMBER, 13, 12, 10).plusMinutes(10);
        LocalDateTime fecha6 = LocalDateTime.of(2020, Month.SEPTEMBER, 13, 6, 50).plusMinutes(30);
        LocalDateTime fecha7 = LocalDateTime.of(2020, Month.SEPTEMBER, 13, 8, 0).plusMinutes(32);
        LocalDateTime fecha8 = LocalDateTime.of(2020, Month.SEPTEMBER, 13, 12, 5).plusMinutes(45);
        LocalDateTime fecha9 = LocalDateTime.of(2020, Month.SEPTEMBER, 13, 8, 0).plusMinutes(12);
        LocalDateTime fecha10 = LocalDateTime.of(2020, Month.SEPTEMBER, 13, 12, 0).plusMinutes(16);
        LocalDateTime fecha11 = LocalDateTime.of(2020, Month.SEPTEMBER, 13, 7, 6).plusMinutes(17);
        LocalDateTime fecha12 = LocalDateTime.of(2020, Month.SEPTEMBER, 13, 7, 0).plusMinutes(28);
        LocalDateTime fecha13 = LocalDateTime.of(2020, Month.SEPTEMBER, 13, 12, 0).plusMinutes(50);
        LocalDateTime fecha14 = LocalDateTime.of(2020, Month.SEPTEMBER, 13, 7, 0).plusMinutes(7);
        LocalDateTime fecha15 = LocalDateTime.of(2020, Month.SEPTEMBER, 13, 12, 0).plusMinutes(9);

        empleados.add(new Marcacion(7, emp1, fecha1, MarcacionTipo.ENTRADA));
        empleados.add(new Marcacion(5, emp2, fecha2, MarcacionTipo.ENTRADA));
        empleados.add(new Marcacion(8, emp3, fecha3, MarcacionTipo.SALIDA));
        empleados.add(new Marcacion(9, emp4, fecha4, MarcacionTipo.ENTRADA));
        empleados.add(new Marcacion(12, emp5, fecha5, MarcacionTipo.SALIDA));
        empleados.add(new Marcacion(15, emp1, fecha6, MarcacionTipo.ENTRADA));
        empleados.add(new Marcacion(1, emp2, fecha7, MarcacionTipo.ENTRADA));
        empleados.add(new Marcacion(3, emp3, fecha8, MarcacionTipo.SALIDA));
        empleados.add(new Marcacion(4, emp4, fecha9, MarcacionTipo.ENTRADA));
        empleados.add(new Marcacion(6, emp5, fecha10, MarcacionTipo.SALIDA));
        empleados.add(new Marcacion(10, emp1, fecha11, MarcacionTipo.ENTRADA));
        empleados.add(new Marcacion(14, emp2, fecha12, MarcacionTipo.ENTRADA));
        empleados.add(new Marcacion(11, emp3, fecha13, MarcacionTipo.SALIDA));
        empleados.add(new Marcacion(2, emp4, fecha14, MarcacionTipo.ENTRADA));
        empleados.add(new Marcacion(13, emp5, fecha15, MarcacionTipo.SALIDA));

         System.out.println("-------------------------------------------------------------");
         System.out.println("Todos los empleados de los que se tiene registro de marcación");
         System.out.println("-------------------------------------------------------------");
         System.out.println(empleados.empleados());

         System.out.println("--------------------------------------");
         System.out.println("Todas las marcaciones de un empleado");
         System.out.println("--------------------------------------");
         System.out.println(empleados.filtroPorEmpleado(emp5));

         System.out.println("----------------------------------------------------------");
         System.out.println("Todas las marcaciones del tipo especificado por parámetro");
         System.out.println("----------------------------------------------------------");
         System.out.println(empleados.filtroPorTipo(MarcacionTipo.SALIDA));

         System.out.println("--------------------------------------------------------");
         System.out.println("Las marcaciones realizadas fuera del horario de ingreso");
         System.out.println("--------------------------------------------------------");
         System.out.println(empleados.llegaronTarde());

         System.out.println("--------------------------------------");
         System.out.println("Marcaciones ordenadas por fecha y hora");
         System.out.println("--------------------------------------");
         empleados.ordenar();
         System.out.println(empleados);

         System.out.println("----------------------------------");
         System.out.println("Marcaciones ordenadas por Empleado");
         System.out.println("----------------------------------");
         empleados.ordenar(new MarcacionEmpleadoComparator());
         System.out.println(empleados);

         System.out.println("----------------------------------");
         System.out.println("Marcaciones ordenadas por Tipo");
         System.out.println("----------------------------------");
         empleados.ordenar(new MarcacionTipoComparator());
         System.out.println(empleados);

         System.out.println("----------------------------------");
         System.out.println("Marcaciones ordenadas por Numero");
         System.out.println("----------------------------------");
         empleados.ordenar(new MarcacionNumeroComparator());
         System.out.println(empleados);

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Marcaciones ordenadas por Fecha y hora pero con comparator pasado por parametro");
        System.out.println("-------------------------------------------------------------------------------");
        empleados.ordenar(new MarcacionFechaHoraComparator());
        System.out.println(empleados);
    }
}
