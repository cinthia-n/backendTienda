/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.repositories;

import edu.umss.dip.ssiservice.model.Maquinaria;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MaquinariaRepository extends GenericRepository<Maquinaria>, JpaSpecificationExecutor<Maquinaria> {
}
  