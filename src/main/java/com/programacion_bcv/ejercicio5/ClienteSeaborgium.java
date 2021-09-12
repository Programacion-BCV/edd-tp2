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
                                new Producto(new ProductoTipo("Calculadora"), new ProductoMarca("Casio"), "Fx-82ES"),
                                100);
                MovimientoDetalle d3 = new MovimientoDetalle(
                                new Producto(new ProductoTipo("Calculadora"), new ProductoMarca("Casio"), "Fx-95ES"),
                                100);
                MovimientoDetalle d4 = new MovimientoDetalle(
                                new Producto(new ProductoTipo("Calculadora"), new ProductoMarca("Casio"), "Fx-350MS"),
                                100);

                List<MovimientoDetalle> d1_4 = new ArrayList<MovimientoDetalle>();
                d1_4.add(d1);
                d1_4.add(d2);
                d1_4.add(d3);
                d1_4.add(d4);

                Movimiento m1 = new Movimiento(1, LocalDate.now(), MovimientoTipo.ENTRADA,
                                new Persona("Confalonieri", "Juan"), d1_4);

                sAdmin.agregar(m1);
                // ----------------------------------------------------------

                MovimientoDetalle d5 = new MovimientoDetalle(
                                new Producto(new ProductoTipo("Calculadora"), new ProductoMarca("Casio"), "Fx-991ES"),
                                100);
                MovimientoDetalle d6 = new MovimientoDetalle(
                                new Producto(new ProductoTipo("Calculadora"), new ProductoMarca("Casio"), "Fx-82ES"),
                                25);

                List<MovimientoDetalle> d5_6 = new ArrayList<MovimientoDetalle>();
                d5_6.add(d5);
                d5_6.add(d6);

                Movimiento m2 = new Movimiento(2, LocalDate.now(), MovimientoTipo.SALIDA,
                                new Persona("Confalonieri", "Franco"), d5_6);
                sAdmin.agregar(m2);
                // ----------------------------------------------------------

                MovimientoDetalle d7 = new MovimientoDetalle(
                                new Producto(new ProductoTipo("Calculadora"), new ProductoMarca("Casio"), "Fx-95ES"),
                                50);

                List<MovimientoDetalle> d7_7 = new ArrayList<MovimientoDetalle>();
                d7_7.add(d7);

                Movimiento m3 = new Movimiento(3, LocalDate.now(), MovimientoTipo.SALIDA,
                                new Persona("Confalonieri", "Fabian"), d7_7);
                sAdmin.agregar(m3);
                // ----------------------------------------------------------

                MovimientoDetalle d8 = new MovimientoDetalle(
                                new Producto(new ProductoTipo("Calculadora"), new ProductoMarca("Casio"), "Fx-350MS"),
                                75);

                List<MovimientoDetalle> d8_8 = new ArrayList<MovimientoDetalle>();
                d8_8.add(d8);

                Movimiento m4 = new Movimiento(4, LocalDate.now(), MovimientoTipo.SALIDA,
                                new Persona("Confalonieri", "Fabian"), d8_8);
                sAdmin.agregar(m4);
                // ----------------------------------------------------------
                MovimientoDetalle d9 = new MovimientoDetalle(
                                new Producto(new ProductoTipo("Calculadora"), new ProductoMarca("Casio"), "Fx-991ES"),
                                10);

                List<MovimientoDetalle> d9_9 = new ArrayList<MovimientoDetalle>();
                d9_9.add(d9);

                Movimiento m5 = new Movimiento(5, LocalDate.now(), MovimientoTipo.ENTRADA,
                                new Persona("Confalonieri", "Franco"), d9_9);
                sAdmin.agregar(m5);

                /*
                *
                *
                *
                *
                *
                *
                *
                */
                List<ProductoTipoCantidad> retorno = sAdmin.stockPorTipo();

                for (ProductoTipoCantidad producto : retorno) {
                        System.out.println(producto);

                }
        }
}
