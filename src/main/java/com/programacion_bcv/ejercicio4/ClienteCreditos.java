package com.programacion_bcv.ejercicio4;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ClienteCreditos {

    public static void main(String[] args) {
        
        CreditoAdmin cAdmin = new CreditoAdmin();
        
        Credito c1 = new Credito(4, new CreditoTipo("creditoConsumo", new BigDecimal(50000), new BigDecimal(950000), 1, 4, ClienteTipoEnum.Persona, new BigDecimal(1.2)), new Cliente("Buenar", "Ramiro", "42965784", ClienteTipoEnum.Persona), new BigDecimal(300000), 3, new Sucursal(5), new BigDecimal(0));
        Credito c2 = new Credito(2, new CreditoTipo("creditoComercial", new BigDecimal(500000), new BigDecimal(10000000), 2, 6, ClienteTipoEnum.Comercio, new BigDecimal(1.35)), new Cliente("Vera", "Matias", "41965784", ClienteTipoEnum.Comercio), new BigDecimal(5000000), 5, new Sucursal(1), new BigDecimal(0));
        Credito c3 = new Credito(1, new CreditoTipo("creditoHipotecario", new BigDecimal(7000000), new BigDecimal(20000000), 2, 8, ClienteTipoEnum.Persona, new BigDecimal(1.3)), new Cliente("Confalonieri", "Juan", "32965784", ClienteTipoEnum.Persona), new BigDecimal(13000000), 7, new Sucursal(3), new BigDecimal(0));
        Credito c4 = new Credito(5, new CreditoTipo("creditoComercial", new BigDecimal(500000), new BigDecimal(10000000), 2, 6, ClienteTipoEnum.EmpresaDeContruccion, new BigDecimal(1.35)), new Cliente("Murphy", "Edward", "12965784", ClienteTipoEnum.EmpresaDeContruccion), new BigDecimal(6000000), 4, new Sucursal(5), new BigDecimal(0));
        Credito c5 = new Credito(3, new CreditoTipo("creditoConsumo", new BigDecimal(50000), new BigDecimal(950000), 1, 4, ClienteTipoEnum.Persona, new BigDecimal(1.2)), new Cliente("Moore", "Nahuel", "12965784", ClienteTipoEnum.Persona), new BigDecimal(400000), 2, new Sucursal(5), new BigDecimal(0));

        
        cAdmin.add(c1);
        cAdmin.add(c2);
        cAdmin.add(c3);
        cAdmin.add(c4);
        cAdmin.add(c5);

        for (int i = 0; i < cAdmin.size(); i++) {
            System.out.println(cAdmin.get(i).toString());
        }
        System.out.println("Cantidad de elementos en lista de creditos");
        System.out.println(cAdmin.size());
        
        System.out.println("credito ubicado en la posicion 4");
        System.out.println(cAdmin.get(4));
        
        System.out.println("Mostrar y quitar el elemento 2 de la lista");
        
        System.out.println(cAdmin.remove(3));
        
        System.out.println("Creditos de  tipo Comercio");
        
        System.out.println(cAdmin.creditosPorClienteTipo(ClienteTipoEnum.Comercio));
        
        System.out.println("");
        System.out.println(cAdmin.creditosInferioresA(600000));
        
        System.out.println("Creditos ordenados por numero");
        cAdmin.ordenar();
        
        for (int i = 0; i < cAdmin.size(); i++) {
            System.out.println(cAdmin.get(i).toString());
        }
        
        cAdmin.ordenar(new CreditoOrdenar());
        System.out.println("Creditos ordenados por sucursal y numero");
        System.out.println(cAdmin.toString());
    }
}
