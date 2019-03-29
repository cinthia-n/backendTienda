/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.model;

import edu.umss.dip.ssiservice.dto.MaquinariaDto;
import org.modelmapper.ModelMapper;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

@Entity
public class Maquinaria extends ModelBase<MaquinariaDto> {
    private String marca;
    private String modelo;
    private String capacidad;
    private String precio;

    @Lob
    private Byte[] imagen;

    @OneToOne(targetEntity = SubCategoria.class)
    private SubCategoria subCategoria;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public Byte[] getImagen() {
        return imagen;
    }

    public void setImagen(Byte[] imagen) {
        this.imagen = imagen;
    }

    public SubCategoria getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(SubCategoria subCategoria) {
        this.subCategoria = subCategoria;
    }

    @Override
    public ModelBase toDomain(MaquinariaDto element, ModelMapper mapper) {
        return super.toDomain(element, mapper);
    }
}
