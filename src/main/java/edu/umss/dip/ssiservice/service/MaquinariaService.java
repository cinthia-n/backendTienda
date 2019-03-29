/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.Maquinaria;

import java.io.InputStream;

public interface MaquinariaService extends GenericService<Maquinaria> {
    void saveImage(Long id, InputStream file);
}

    