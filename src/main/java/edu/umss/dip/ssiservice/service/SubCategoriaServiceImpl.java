/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.SubCategoria;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import edu.umss.dip.ssiservice.repositories.SubCategoriaRepository;
import org.springframework.stereotype.Service;

@Service
public class SubCategoriaServiceImpl extends GenericServiceImpl<SubCategoria> implements SubCategoriaService {
    private final SubCategoriaRepository repository;

    public SubCategoriaServiceImpl(SubCategoriaRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<SubCategoria> getRepository() {
        return repository;
    }
}
