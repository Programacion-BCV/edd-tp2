package com.programacion_bcv.ejercicio4;

import java.math.BigDecimal;

public class Credito implements Comparable<Credito> {

    private int numero;
    private CreditoTipo tipo;
    private Cliente cliente;
    private BigDecimal montoAcordado;
    private int plazoEnAnio;
    private Sucursal sucursal;
    private final BigDecimal totalADevolver;

    public Credito(int numero, CreditoTipo tipo, Cliente cliente, BigDecimal montoAcordado, int plazoEnAnio, Sucursal sucursal, BigDecimal totalADevolver) {
        this.numero = numero;
        this.tipo = tipo;
        this.cliente = cliente;
        this.montoAcordado = montoAcordado;
        this.plazoEnAnio = plazoEnAnio;
        this.sucursal = sucursal;
        this.totalADevolver = montoAcordado.multiply(tipo.getTasaDeInteres());
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public CreditoTipo getTipo() {
        return tipo;
    }

    public void setTipo(CreditoTipo tipo) {
        this.tipo = tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public BigDecimal getMontoAcordado() {
        return montoAcordado;
    }

    public void setMontoAcordado(BigDecimal montoAcordado) {
        this.montoAcordado = montoAcordado;
    }

    public int getPlazoEnAnio() {
        return plazoEnAnio;
    }

    public void setPlazoEnAnio(int plazoEnAnio) {
        this.plazoEnAnio = plazoEnAnio;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.numero;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Credito other = (Credito) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Credito{" + "numero=" + numero + ", tipo=" + tipo + ", cliente=" + cliente + ", montoAcordado=" + montoAcordado + ", plazoEnAnio=" + plazoEnAnio + ", sucursal=" + sucursal + ", totalADevolver=" + totalADevolver + '}';
    }

    @Override
    public int compareTo(Credito o) {
        return new Integer(this.numero).compareTo(o.getNumero());
    }
}
