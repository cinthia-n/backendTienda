/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.dto.MaquinariaDto;
import edu.umss.dip.ssiservice.model.Maquinaria;
import org.springframework.data.jpa.domain.Specification;

import java.io.InputStream;
import java.util.List;

public interface MaquinariaService extends GenericService<Maquinaria> {
    void saveImage(Long id, InputStream file);
    List<MaquinariaDto> findAll(Specification specification);
}

    