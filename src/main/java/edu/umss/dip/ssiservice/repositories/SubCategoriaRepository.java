/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.repositories;

import edu.umss.dip.ssiservice.model.Categoria;
import edu.umss.dip.ssiservice.model.SubCategoria;

import java.util.List;
import java.util.Optional;

public interface SubCategoriaRepository extends GenericRepository<SubCategoria> {
    Optional<List<Categoria>> findByCodigo(String code);
}
  