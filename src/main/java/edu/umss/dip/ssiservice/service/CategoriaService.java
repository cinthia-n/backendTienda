/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.Categoria;

import java.util.List;

public interface CategoriaService extends GenericService<Categoria> {
    List<Categoria> findByCode(String code);
}

    