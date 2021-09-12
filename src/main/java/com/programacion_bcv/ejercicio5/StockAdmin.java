package com.programacion_bcv.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class StockAdmin extends StockAdminAbstract {

    public StockAdmin() {
        super();
    }

    @Override
    public List<Movimiento> salidas() {
        List<Movimiento> salida = new ArrayList<Movimiento>();

        for (Movimiento movimiento : this.movimientosList) {
            if (movimiento.getTipo().getMovTipo() == "Salida") {
                salida.add(movimiento);
            }
        }
        return salida;
    }

    @Override
    public List<Movimiento> entradas() {
        List<Movimiento> entrada = new ArrayList<Movimiento>();

        for (Movimiento movimiento : this.movimientosList) {
            if (movimiento.getTipo().getMovTipo() == "Entrada") {
                entrada.add(movimiento);
            }
        }
        return entrada;
    }

    @Override
    public List<Movimiento> movimientosPorProducto(Producto producto) {
        /**
         * Consideramos apropiado devolver una lista de movimientos la cual tiene cada
         * uno de los movimiento en los que esta involucrado el producto pasado por
         * parametro con sus respectivos datos, pero en la lista de detalles del
         * movimiento (List<MovimientoDetalle> detalle) solo incluimos el producto
         * pasado por parametro, los demas productos correspondientes al Movimiento en
         * si no, ya que lo consideramos inadecuado y que no cumplia con la consigna.
         * Por eso, antes de agregar a la lista de retorno el objeto de tipo movimiento,
         * lo reconstruimos.
         */
        List<Movimiento> movPorProd = new ArrayList<Movimiento>();

        for (Movimiento movimiento : this.movimientosList) {

            for (MovimientoDetalle detalle : movimiento.getDetalle()) {
                if (detalle.getProducto().equals(producto)) {
                    List<MovimientoDetalle> detalleIndividual = new ArrayList<MovimientoDetalle>();
                    detalleIndividual.add(detalle);

                    movPorProd.add(new Movimiento(movimiento.getNroMovimiento(), movimiento.getFecha(),
                            movimiento.getTipo(), movimiento.getDestinatario(), detalleIndividual));
                }
            }

        }
        return movPorProd;
    }

    @Override
    public List<Producto> productosPorPersona(Persona persona) {
        List<Producto> prodPorPers = new ArrayList<Producto>();

        for (Movimiento movimiento : this.movimientosList) {

            if (movimiento.getDestinatario().equals(persona) && movimiento.getTipo().getMovTipo() == "Salida") {
                for (MovimientoDetalle detalle : movimiento.getDetalle()) {
                    prodPorPers.add(detalle.getProducto());
                }
            }
        }

        return prodPorPers;
    }

    @Override
    public List<ProductoCantidad> stock() {
        List<ProductoCantidad> prodsCant = new ArrayList<ProductoCantidad>();
        int indice;

        for (Movimiento movimiento : this.movimientosList) {
            for (MovimientoDetalle detalle : movimiento.getDetalle()) {

                ProductoCantidad pc = new ProductoCantidad(detalle.getProducto(), detalle.getCantidad());
                indice = prodsCant.indexOf(pc);

                if (indice == -1) {
                    prodsCant.add(pc);
                } else {
                    prodsCant.get(indice)
                            .setCantidad((movimiento.getTipo().getMovTipo() == "Entrada"
                                    ? prodsCant.get(indice).getCantidad() + detalle.getCantidad()
                                    : prodsCant.get(indice).getCantidad() - detalle.getCantidad()));
                }
            }
        }

        return prodsCant;
    }

    @Override
    public List<ProductoTipoCantidad> stockPorTipo() {
        List<ProductoTipoCantidad> prodsTipCant = new ArrayList<ProductoTipoCantidad>();
        int indice;

        for (Movimiento movimiento : this.movimientosList) {
            for (MovimientoDetalle detalle : movimiento.getDetalle()) {
                ProductoTipoCantidad p1 = new ProductoTipoCantidad(detalle.getProducto().getTipo(),
                        detalle.getCantidad());
                indice = prodsTipCant.indexOf(p1);

                if (indice == -1) {
                    prodsTipCant.add(p1);
                } else {
                    prodsTipCant.get(indice)
                            .setCantidad((movimiento.getTipo().getMovTipo() == "Entrada"
                                    ? prodsTipCant.get(indice).getCantidad() + detalle.getCantidad()
                                    : prodsTipCant.get(indice).getCantidad() - detalle.getCantidad()));
                }
            }

        }

        return prodsTipCant;
    }

}
