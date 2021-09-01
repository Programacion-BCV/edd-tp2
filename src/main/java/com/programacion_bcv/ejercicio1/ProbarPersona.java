package com.programacion_bcv.ejercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProbarPersona {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Persona p1 = new Persona("Juan", "Perez", 40635379, LocalDate.parse("27/07/2000", dtf));
        System.out.println("El signo de " + p1.getNombre() + " " + p1.getApellido() + " es "
                + p1.cualEsSigno(p1.getNacimiento().getDayOfMonth(), p1.getNacimiento().getMonthValue()));

        Persona p2 = new Persona("Esteban", "Suarez", 45679034, LocalDate.now());
        System.out.println("El signo de " + p2.getNombre() + " " + p2.getApellido() + " es "
                + p2.cualEsSigno(p2.getNacimiento().getDayOfMonth(), p2.getNacimiento().getMonthValue()));

        Persona p3 = new Persona("Luis", "Gonzalez", 30987123, LocalDate.of(1969, 2, 11));
        System.out.println("El signo de " + p3.getNombre() + " " + p3.getApellido() + " es "
                + p3.cualEsSigno(p3.getNacimiento().getDayOfMonth(), p3.getNacimiento().getMonthValue()));

        System.out.println(p1);

        System.out.println(p2);

        System.out.println(p3);
    }

}