/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class SubCategoria extends ModelBase {
    private String nombre;
    private String codigo;
    @OneToOne(optional = false)
    private Categoria categoria;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
