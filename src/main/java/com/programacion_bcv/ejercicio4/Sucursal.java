
package com.programacion_bcv.ejercicio4;


class Sucursal implements Comparable<Sucursal> {
    private int numSucursal;

    public Sucursal(int numSucursal) {
        this.numSucursal = numSucursal;
    }

    public int getNumSucursal() {
        return numSucursal;
    }

    public void setNumSucursal(int numSucursal) {
        this.numSucursal = numSucursal;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.numSucursal;
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
        final Sucursal other = (Sucursal) obj;
        if (this.numSucursal != other.numSucursal) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sucursal{" + "numSucursal=" + numSucursal + '}';
    }

    @Override
    public int compareTo(Sucursal o) {
        return new Integer(this.numSucursal).compareTo(o.getNumSucursal());
    }
    
}
