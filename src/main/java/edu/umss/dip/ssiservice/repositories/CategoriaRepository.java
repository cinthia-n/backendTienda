/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.repositories;

import edu.umss.dip.ssiservice.model.Categoria;

import java.util.List;

public interface CategoriaRepository extends GenericRepository<Categoria> {
    List<Categoria> findByCodigo(String codigo);
}
  