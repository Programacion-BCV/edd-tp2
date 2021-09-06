package com.programacion_bcv.ejercicio1;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private int documento;
    private LocalDate nacimiento;
    private String signo;

    public Persona(String nombre, String apellido, int documento, LocalDate nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.nacimiento = nacimiento;
        this.signo = cualEsSigno(nacimiento.getDayOfMonth(), nacimiento.getMonthValue());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
        this.signo = cualEsSigno(nacimiento.getDayOfMonth(), nacimiento.getMonthValue());
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    @Override
    public String toString() {
        return "Persona [apellido=" + apellido + ", documento=" + documento + ", nacimiento=" + nacimiento + ", nombre="
                + nombre + ", signo=" + signo + "]";
    }

    public String cualEsSigno(int dia, int mes) {

        switch (mes) {
            case 1:
                return ((dia <= 20) ? "Capricornio" : "Acuario");
            case 2:
                return ((dia <= 19) ? "Acuario" : "Piscis");
            case 3:
                return ((dia <= 20) ? "Piscis" : "Aries");
            case 4:
                return ((dia <= 20) ? "Aries" : "Tauro");
            case 5:
                return ((dia <= 21) ? "Tauro" : "Geminis");
            case 6:
                return ((dia <= 21) ? "Geminis" : "Cancer");
            case 7:
                return ((dia <= 23) ? "Cancer" : "Leo");
            case 8:
                return ((dia <= 23) ? "Leo" : "Virgo");
            case 9:
                return ((dia <= 23) ? "Virgo" : "Libra");
            case 10:
                return ((dia <= 23) ? "Libra" : "Escorpio");
            case 11:
                return ((dia <= 22) ? "Escorpio" : "Sagitario");
            case 12:
                return ((dia <= 21) ? "Sagitario" : "Capricornio");
            default:
                return "Fecha invalida";
        }

    }
}
