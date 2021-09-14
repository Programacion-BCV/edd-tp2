package com.programacion_bcv.ejercicio4;

import java.math.BigDecimal;
import java.util.Objects;

public class Credito implements Comparable<Credito> {

    private int numero;
    private CreditoTipo tipo;
    private Cliente cliente;
    private BigDecimal montoAcordado;
    private int plazoEnAnio;
    private Sucursal sucursal;
    private final BigDecimal totalADevolver;

    public Credito(int numero, CreditoTipo tipo, Cliente cliente, BigDecimal montoAcordado, int plazoEnAnio,
            Sucursal sucursal, BigDecimal totalADevolver) throws Exception {

        if (!validarPrestamo(montoAcordado, plazoEnAnio, tipo)) {
            throw new Exception(cliente.getNombre() + " " + cliente.getApellido()
                    + " no cumple los requisitos para obtener un credito");
        }
        this.numero = numero;
        this.tipo = tipo;
        this.cliente = cliente;
        this.montoAcordado = montoAcordado;
        this.plazoEnAnio = plazoEnAnio;
        this.sucursal = sucursal;
        this.totalADevolver = totalADevolver;

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

    public void setMontoAcordado(BigDecimal montoAcordado) throws Exception {
        if (!validarPrestamo(montoAcordado, this.plazoEnAnio, this.tipo)) {
            throw new Exception(cliente.getNombre() + " " + cliente.getApellido()
                    + " no cumple los requisitos para obtener un credito");
        }
        this.montoAcordado = montoAcordado;
    }

    public int getPlazoEnAnio() {
        return plazoEnAnio;
    }

    public void setPlazoEnAnio(int plazoEnAnio) throws Exception {
        if (!validarPrestamo(this.montoAcordado, plazoEnAnio, this.tipo)) {
            throw new Exception(cliente.getNombre() + " " + cliente.getApellido()
                    + " no cumple los requisitos para obtener un credito");
        }
        this.plazoEnAnio = plazoEnAnio;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public BigDecimal getTotalADevolver() {
        return totalADevolver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Credito))
            return false;
        Credito credito = (Credito) o;
        return getNumero() == credito.getNumero();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumero());
    }

    @Override
    public String toString() {
        return "Credito{" + "numero=" + numero + ", tipo=" + tipo + ", cliente=" + cliente + ", montoAcordado="
                + montoAcordado + ", plazoEnAnio=" + plazoEnAnio + ", sucursal=" + sucursal + ", totalADevolver="
                + totalADevolver + '}' + "\n";
    }

    public boolean validarPrestamo(BigDecimal montoAcordado, int plazoEnAnio, CreditoTipo tipo) {
        boolean otorgado = true;

        if (montoAcordado.compareTo(tipo.getMontoMinimo()) < 1 || montoAcordado.compareTo(tipo.getMontoMaximo()) > 0) {
            otorgado = false;
        } else if (plazoEnAnio < tipo.getAniosMinimo() || plazoEnAnio > tipo.getAniosMaximo()) {
            otorgado = false;
        }

        return otorgado;
    }

    @Override
    public int compareTo(Credito credito) {
        return Integer.compare(this.numero, credito.getNumero());
    }
}
