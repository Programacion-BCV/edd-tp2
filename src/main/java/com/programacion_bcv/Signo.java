package com.programacion_bcv;

public class Signo {
    public static void main(String[] args) {

        System.out.println(cualSigno(23, 11));
    }

    public static String cualSigno(int dia, int mes) {

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
                return "1";
        }
    }
}
