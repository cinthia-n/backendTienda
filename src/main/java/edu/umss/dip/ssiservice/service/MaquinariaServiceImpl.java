/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.dto.MaquinariaDto;
import edu.umss.dip.ssiservice.model.Maquinaria;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import edu.umss.dip.ssiservice.repositories.MaquinariaRepository;
import edu.umss.dip.ssiservice.repositories.MaquinariaSpecification;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class MaquinariaServiceImpl extends GenericServiceImpl<Maquinaria> implements MaquinariaService {
    private final MaquinariaRepository repository;

    public MaquinariaServiceImpl(MaquinariaRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Maquinaria> getRepository() {
        return repository;
    }

    @Override
    public void saveImage(Long id, InputStream file) {
        Maquinaria maquinariaPersisted = findById(id);
        try {
            Byte[] bytes = ImageUtils.inputStreamToByteArray(file);
            maquinariaPersisted.setImagen(bytes);
            getRepository().save(maquinariaPersisted);
        } catch (IOException e) {
            logger.error("Error reading file", e);
            e.printStackTrace();
        }
    }

    @Override
    public List<MaquinariaDto> findAll(Specification specification) {
        return repository.findAll(specification);
    }
}
