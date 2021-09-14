package com.programacion_bcv.ejercicio4;

import java.math.BigDecimal;
import java.util.List;

public class ClienteCreditos {

    public static void main(String[] args) {

        CreditoAdmin cAdmin = new CreditoAdmin();

        try {
            Credito c1 = new Credito(4,
                    new CreditoTipo("creditoConsumo", new BigDecimal(50000), new BigDecimal(950000), 3, 4,
                            ClienteTipoEnum.PERSONA, new BigDecimal(1.2)),
                    new Cliente("Buenar", "Ramiro", "42965784", ClienteTipoEnum.PERSONA), new BigDecimal(300000), 2,
                    new Sucursal(5), new BigDecimal(300000 * 1.2));
            cAdmin.add(c1);
        } catch (Exception exc) {
            System.out.println(exc.toString());
        }
        try {
            Credito c2 = new Credito(2,
                    new CreditoTipo("creditoComercial", new BigDecimal(500000), new BigDecimal(10000000), 2, 6,
                            ClienteTipoEnum.COMERCIO, new BigDecimal(1.35)),
                    new Cliente("Vera", "Matias", "41965784", ClienteTipoEnum.COMERCIO), new BigDecimal(5000000), 5,
                    new Sucursal(1), new BigDecimal(5000000 * 1.35));
            cAdmin.add(c2);
        } catch (Exception exc) {
            System.out.println(exc.toString());
        }
        try {
            Credito c3 = new Credito(1,
                    new CreditoTipo("creditoHipotecario", new BigDecimal(7000000), new BigDecimal(20000000), 2, 8,
                            ClienteTipoEnum.PERSONA, new BigDecimal(1.3)),
                    new Cliente("Confalonieri", "Juan", "32965784", ClienteTipoEnum.PERSONA), new BigDecimal(13000000),
                    7, new Sucursal(3), new BigDecimal(13000000 * 1.3));
            cAdmin.add(c3);
        } catch (Exception exc) {
            System.out.println(exc.toString());
        }
        try {
            Credito c4 = new Credito(5,
                    new CreditoTipo("creditoComercial", new BigDecimal(500000), new BigDecimal(10000000), 2, 6,
                            ClienteTipoEnum.EMPRESACONSTRUCCION, new BigDecimal(1.35)),
                    new Cliente("Murphy", "Edward", "12965784", ClienteTipoEnum.EMPRESACONSTRUCCION),
                    new BigDecimal(6000000), 4, new Sucursal(5), new BigDecimal(6000000 * 1.35));
            cAdmin.add(c4);
        } catch (Exception exc) {
            System.out.println(exc.toString());
        }
        try {
            Credito c5 = new Credito(3,
                    new CreditoTipo("creditoConsumo", new BigDecimal(50000), new BigDecimal(950000), 1, 4,
                            ClienteTipoEnum.PERSONA, new BigDecimal(1.2)),
                    new Cliente("Moore", "Nahuel", "12965784", ClienteTipoEnum.PERSONA), new BigDecimal(400000), 2,
                    new Sucursal(5), new BigDecimal(400000 * 1.2));
            cAdmin.add(c5);

        } catch (Exception exc) {
            System.out.println(exc.toString());
        }

        List<Credito> retorno = cAdmin.creditosSuperioresA(400001);

        // List<Credito> retorno2 = cAdmin.creditosPorCreditoTipoySucursal(new
        // CreditoTipo("creditoHipotecario",
        // new BigDecimal(7000000), new BigDecimal(20000000), 2, 8,
        // ClienteTipoEnum.PERSONA, new BigDecimal(1.3)),
        // new Sucursal(3));

        // System.out.println(retorno.size());
        // System.out.println("\n");
        // for (Credito credito : retorno) {
        // System.out.println(credito);

        System.out.println(cAdmin);
        // }

        /*
         * for (int i = 0; i < cAdmin.size(); i++) {
         * System.out.println(cAdmin.get(i).toString()); }
         * System.out.println("Cantidad de elementos en lista de creditos");
         * System.out.println(cAdmin.size());
         * 
         * System.out.println("credito ubicado en la posicion 4");
         * System.out.println(cAdmin.get(4));
         * 
         * System.out.println("Mostrar y quitar el elemento 2 de la lista");
         * 
         * System.out.println(cAdmin.remove(3));
         * 
         * System.out.println("Creditos de  tipo Comercio");
         * 
         * System.out.println(cAdmin.creditosPorClienteTipo(ClienteTipoEnum.COMERCIO));
         * 
         * System.out.println("");
         * System.out.println(cAdmin.creditosInferioresA(600000));
         * 
         * System.out.println("Creditos ordenados por numero"); cAdmin.ordenar();
         * 
         * for (int i = 0; i < cAdmin.size(); i++) {
         * System.out.println(cAdmin.get(i).toString()); }
         * 
         * cAdmin.ordenar(new CreditoOrdenar());
         * System.out.println("Creditos ordenados por sucursal y numero");
         * System.out.println(cAdmin.toString());
         */
    }
}
