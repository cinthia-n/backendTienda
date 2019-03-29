package edu.umss.dip.ssiservice.model;

import javax.persistence.Entity;

@Entity
public class Tienda extends ModelBase {
    private String nombreTienda;
    private String NIT;
    private String propiertario;
    

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public String getPropiertario() {
        return propiertario;
    }

    public void setPropiertario(String propiertario) {
        this.propiertario = propiertario;
    }
}
