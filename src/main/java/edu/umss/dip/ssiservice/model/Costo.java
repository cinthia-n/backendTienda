package edu.umss.dip.ssiservice.model;

import javax.persistence.Entity;

@Entity
public class Costo extends ModelBase {
    private int impuesto;
    private int aduana;
    private int costoImportacion;
    private int costoTotal;

    public int getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(int impuesto) {
        this.impuesto = impuesto;
    }

    public int getAduana() {
        return aduana;
    }

    public void setAduana(int aduana) {
        this.aduana = aduana;
    }

    public int getCostoImportacion() {
        return costoImportacion;
    }

    public void setCostoImportacion(int costoImportacion) {
        this.costoImportacion = costoImportacion;
    }

    public int getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }
}
