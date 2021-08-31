
package com.programacion_bcv.ejercicio4;

import java.math.BigDecimal;

public class Credito {
    private int numero;
    private CreditoTipo tipo;
    private Cliente cliente;
    private BigDecimal montoAcordado;
    private int plazoEnAnio;
    private Sucursal sucursal;
    private BigDecimal totalADevolver;

    public Credito(int numero, CreditoTipo tipo, Cliente cliente, BigDecimal montoAcordado, int plazoEnAnio, Sucursal sucursal, BigDecimal totalADevolver) {
        this.numero = numero;
        this.tipo = tipo;
        this.cliente = cliente;
        this.montoAcordado = montoAcordado;
        this.plazoEnAnio = plazoEnAnio;
        this.sucursal = sucursal;
        this.totalADevolver = totalADevolver;
    }
    
    
}
