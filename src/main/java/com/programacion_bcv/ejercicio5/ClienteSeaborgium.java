package com.programacion_bcv.ejercicio5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ClienteSeaborgium {
    public static void main(String[] args) {

        StockAdmin sAdmin = new StockAdmin();
        // ----------------------------------------------------------
        MovimientoDetalle d1 = new MovimientoDetalle(
                new Producto(new ProductoTipo("Calculadora"), new ProductoMarca("Casio"), "Fx-991ES"),
                100);
        MovimientoDetalle d2 = new MovimientoDetalle(
                new Producto(new ProductoTipo("Impresora"), new ProductoMarca("Brother"), "HL-1212W"),
                100);
        MovimientoDetalle d3 = new MovimientoDetalle(
                new Producto(new ProductoTipo("Teclado"), new ProductoMarca("Redragon"), "Kumara"),
                100);
        MovimientoDetalle d4 = new MovimientoDetalle(
                new Producto(new ProductoTipo("Calculadora"), new ProductoMarca("Casio"), "Fx-350MS"),
                100);

        List<MovimientoDetalle> d1_4 = new ArrayList<>();
        d1_4.add(d1);
        d1_4.add(d2);
        d1_4.add(d3);
        d1_4.add(d4);

        Movimiento m1 = new Movimiento(4, LocalDate.now().plusDays(5), MovimientoTipo.ENTRADA,
                new Persona("Confalonieri", "Juan"), d1_4);

        sAdmin.agregar(m1);
        // ----------------------------------------------------------

        MovimientoDetalle d5 = new MovimientoDetalle(
                new Producto(new ProductoTipo("Calculadora"), new ProductoMarca("Casio"), "Fx-991ES"),
                100);
        MovimientoDetalle d6 = new MovimientoDetalle(
                new Producto(new ProductoTipo("Impresora"), new ProductoMarca("Brother"), "HL-1212W"),
                25);

        List<MovimientoDetalle> d5_6 = new ArrayList<>();
        d5_6.add(d5);
        d5_6.add(d6);

        Movimiento m2 = new Movimiento(3, LocalDate.now().plusDays(3), MovimientoTipo.SALIDA,
                new Persona("Vera", "Matias"), d5_6);
        sAdmin.agregar(m2);

        // ----------------------------------------------------------

        MovimientoDetalle d7 = new MovimientoDetalle(
                new Producto(new ProductoTipo("Teclado"), new ProductoMarca("Redragon"), "Kumara"), 50);

        List<MovimientoDetalle> d7_7 = new ArrayList<>();
        d7_7.add(d7);

        Movimiento m3 = new Movimiento(1, LocalDate.now().plusDays(1), MovimientoTipo.SALIDA,
                new Persona("Buenar", "Ramiro"), d7_7);
        sAdmin.agregar(m3);

        // ----------------------------------------------------------

        MovimientoDetalle d8 = new MovimientoDetalle(
                new Producto(new ProductoTipo("Calculadora"), new ProductoMarca("Casio"), "Fx-350MS"),
                75);

        List<MovimientoDetalle> d8_8 = new ArrayList<>();
        d8_8.add(d8);

        Movimiento m4 = new Movimiento(2, LocalDate.now().plusDays(4), MovimientoTipo.SALIDA,
                new Persona("Vera", "Matias"), d8_8);
        sAdmin.agregar(m4);

        // ----------------------------------------------------------

        MovimientoDetalle d9 = new MovimientoDetalle(
                new Producto(new ProductoTipo("Calculadora"), new ProductoMarca("Casio"), "Fx-991ES"),
                10);

        List<MovimientoDetalle> d9_9 = new ArrayList<>();
        d9_9.add(d9);

        Movimiento m5 = new Movimiento(5, LocalDate.now().plusDays(2), MovimientoTipo.ENTRADA,
                new Persona("Confalonieri", "Juan"), d9_9);
        sAdmin.agregar(m5);
        // #########################################################################################################################
        System.out.println("**********> Orden de Movimientos por criterio Fecha <**********");
        sAdmin.ordenar();
        System.out.println(sAdmin);
        System.out.println("****************************************");
        System.out.println("********************> Salidas <********************");
        List<Movimiento> retornoMovimiento = sAdmin.salidas();
        for (Movimiento movimiento : retornoMovimiento) {
            System.out.println(movimiento);
        }
        System.out.println("****************************************");
        System.out.println("********************> Entradas <********************");
        retornoMovimiento = sAdmin.entradas();
        for (Movimiento movimiento : retornoMovimiento) {
            System.out.println(movimiento);
        }
        System.out.println("****************************************");
        System.out.println("********************> Movimientos por Producto <********************");
        retornoMovimiento = sAdmin.movimientosPorProducto(
                new Producto(new ProductoTipo("Calculadora"), new ProductoMarca("Casio"), "Fx-991ES"));
        for (Movimiento movimiento : retornoMovimiento) {
            System.out.println(movimiento);
        }
        System.out.println("****************************************");
        System.out.println("********************> Productos por Persona <********************");
        List<Producto> retornoProducto = sAdmin.productosPorPersona(new Persona("Vera", "Matias"));
        for (Producto producto : retornoProducto) {
            System.out.println(producto);
        }
        System.out.println("****************************************");
        System.out.println("********************> Stock de Productos <********************");
        List<ProductoCantidad> retornoProductoCantidad;
        retornoProductoCantidad = sAdmin.stock();
        for (ProductoCantidad productoCantidad : retornoProductoCantidad) {
            System.out.println(productoCantidad);
        }
        System.out.println("****************************************");
        System.out.println("********************> Stock por Tipo <********************");
        List<ProductoTipoCantidad> retornoProductoTipoCantidad = sAdmin.stockPorTipo();
        for (ProductoTipoCantidad productoTipoCantidad : retornoProductoTipoCantidad) {
            System.out.println(productoTipoCantidad);
        }
        System.out.println("****************************************");
    }
}
