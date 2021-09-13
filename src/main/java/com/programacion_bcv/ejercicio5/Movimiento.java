package com.programacion_bcv.ejercicio5;

import java.time.LocalDate;
import java.util.List;

public class Movimiento implements Comparable<Movimiento> {
    private int nroMovimiento;
    private LocalDate fecha;
    private MovimientoTipo tipo;
    private Persona destinatario;
    private List<MovimientoDetalle> detalle;

    public Movimiento(int nroMovimiento, LocalDate fecha, MovimientoTipo tipo, Persona destinatario,
            List<MovimientoDetalle> detalle) {
        this.nroMovimiento = nroMovimiento;
        this.fecha = fecha;
        this.tipo = tipo;
        this.destinatario = destinatario;
        this.detalle = detalle;
    }

    public int getNroMovimiento() {
        return nroMovimiento;
    }

    public void setNroMovimiento(int nroMovimiento) {
        this.nroMovimiento = nroMovimiento;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public MovimientoTipo getTipo() {
        return tipo;
    }

    public void setTipo(MovimientoTipo tipo) {
        this.tipo = tipo;
    }

    public Persona getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Persona destinatario) {
        this.destinatario = destinatario;
    }

    public List<MovimientoDetalle> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<MovimientoDetalle> detalle) {
        this.detalle = detalle;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Movimiento other = (Movimiento) obj;
        if (fecha == null) {
            if (other.fecha != null)
                return false;
        } else if (!fecha.equals(other.fecha))
            return false;
        return true;
    }

    @Override
    public String toString() {
        String lista = "";
        for (MovimientoDetalle movimientoDetalle : this.detalle) {
            lista += movimientoDetalle.toString();

        }

        return "----------Movimiento----------" + "\n" + "Numero movimiento: " + this.nroMovimiento + "\n" + "Fecha: "
                + this.fecha + "\n" + "MovimientoTipo: " + this.tipo + "\n" + "Persona: " + "\n" + this.destinatario
                + "\n" + "Lista de movimientos: " + "\n" + lista + "------------------------------" + "\n";

    }

    @Override
    public int compareTo(Movimiento o) {
        return Integer.compare(this.nroMovimiento, o.nroMovimiento);
    }

}
