/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.bootsptrap;

import edu.umss.dip.ssiservice.model.*;
import edu.umss.dip.ssiservice.repositories.*;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private CategoriaRepository categoriaRepository;
    private SubCategoriaRepository subCategoriaRepository;
    private MaquinariaRepository maquinariaRepository;

    public DevBootstrap(CategoriaRepository categoriaRepository, SubCategoriaRepository subCategoriaRepository, MaquinariaRepository maquinariaRepository) {

        this.categoriaRepository = categoriaRepository;
        this.subCategoriaRepository = subCategoriaRepository;
        this.maquinariaRepository = maquinariaRepository;

    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        

        // Categoria Tractor
        Categoria tractorCategoria = new Categoria();
        tractorCategoria.setCodigo("TRAC");
        tractorCategoria.setNombre("TRACTOR");
        categoriaRepository.save(tractorCategoria);

        // Categoria Tractor
        Categoria motocultorCategoria = new Categoria();
        motocultorCategoria.setCodigo("MOT");
        motocultorCategoria.setNombre("MOTOCULTOR");
        categoriaRepository.save(motocultorCategoria);

        // TIPO SUBCATEGORIA
        SubCategoria tipoSubcategoria = new SubCategoria();
        tipoSubcategoria.setCategoria(tractorCategoria);
        tipoSubcategoria.setCodigo("MQQ");
        tipoSubcategoria.setNombre("MAQUINARIA PESADA");
        subCategoriaRepository.save(tipoSubcategoria);

        SubCategoria tipoSubcategoria1 = new SubCategoria();
        tipoSubcategoria1.setCategoria(motocultorCategoria);
        tipoSubcategoria1.setCodigo("MQQ");
        tipoSubcategoria1.setNombre("MAQUINARIA PESADA");
        subCategoriaRepository.save(tipoSubcategoria1);





          // Maquinaria 1
        Maquinaria maquinaria1 = new Maquinaria();
        maquinaria1.setMarca("MASSEY FERGUSON");
        maquinaria1.setModelo("MOD 2018");
        maquinaria1.setCapacidad("CAP. 1");
        maquinaria1.setPrecio("25000 $");
        maquinaria1.setSubCategoria(tipoSubcategoria);
        maquinariaRepository.save(maquinaria1);

        Maquinaria maquinaria2 = new Maquinaria();
        maquinaria2.setMarca("CHGNFA");
        maquinaria2.setModelo("MOD 2018");
        maquinaria2.setCapacidad("CAP. 2");
        maquinaria2.setPrecio("2500 $");
        maquinaria2.setSubCategoria(tipoSubcategoria1);
        maquinariaRepository.save(maquinaria2);








    }
}
