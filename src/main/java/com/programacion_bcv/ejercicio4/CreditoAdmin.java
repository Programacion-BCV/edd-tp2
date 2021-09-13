package com.programacion_bcv.ejercicio4;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CreditoAdmin extends CreditosAdminAbstract {
    
    public CreditoAdmin(){
    super();
}

    @Override
    public List<Credito> creditosPorClienteTipo(ClienteTipoEnum tipo) {
           List<Credito> creditoTipo = new ArrayList<Credito>();
           
        for (Credito credito : this.creditosList) {
            if (credito.getTipo().getClienteTipo().equals(tipo)) {
                creditoTipo.add(credito);
            }
        }
        return creditoTipo;
    }

    @Override
    public List<Credito> creditosPorCreditoTipoySucursal(CreditoTipo tipo, Sucursal sucursal) {
        return null;
       
    }

    @Override
    public List<Credito> creditosInferioresA(double monto) {
        List<Credito> creditosInferiores = new ArrayList<Credito>();
        
        return creditosInferiores;
       
    }

    @Override
    public List<Credito> creditosSuperioresA(double monto) {
        return null;
      
    }

    @Override
    public void ordenar() {
        Collections.sort(this.creditosList);
    }

    @Override
    public void ordenar(Comparator comparator) {
        Collections.sort(this.creditosList, comparator);
    }

    @Override
    public  String toString() {
        String a ="";
        for (Credito creditosList : creditosList){
            a+=creditosList+"\n";
        }
       return a;     
    }
   
}
