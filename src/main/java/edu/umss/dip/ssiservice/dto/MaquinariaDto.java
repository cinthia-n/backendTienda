/**
 * (C) 2017 Agilysys NV, LLC.  All Rights Reserved.  Confidential Information of Agilysys NV, LLC.
 */
package edu.umss.dip.ssiservice.dto;


import edu.umss.dip.ssiservice.model.Maquinaria;
import org.apache.tomcat.util.codec.binary.Base64;
import org.modelmapper.ModelMapper;

public class MaquinariaDto extends DtoBase<Maquinaria> {

     private String categoria;
     private String marca;
     private String modelo;
     private String capacidad;
     private String precio;
     private String imagen;



    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

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

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }



    @Override
    public MaquinariaDto toDto(Maquinaria maquinaria, ModelMapper mapper) {
        super.toDto(maquinaria, mapper);


        if (maquinaria.getImagen() != null) {
            byte[] bytes = new byte[maquinaria.getImagen().length];
            for (int i = 0; i < maquinaria.getImagen().length; i++) {
                bytes[i] = maquinaria.getImagen()[i];
            }
            String imageStr = Base64.encodeBase64String(bytes);
            setImagen(imageStr);
        }

        return this;
    }

}
