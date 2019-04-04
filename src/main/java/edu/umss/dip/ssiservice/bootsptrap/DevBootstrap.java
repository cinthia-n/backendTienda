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
        tractorCategoria.setCodigo("01");
        tractorCategoria.setNombre("TRACTOR");
        categoriaRepository.save(tractorCategoria);

        // Categoria Motocultor
        Categoria motocultorCategoria = new Categoria();
        motocultorCategoria.setCodigo("02");
        motocultorCategoria.setNombre("MOTOCULTOR");
        categoriaRepository.save(motocultorCategoria);

        // Categoria palacardaora
        Categoria palacargadoraCategoria = new Categoria();
        palacargadoraCategoria.setCodigo("03");
        palacargadoraCategoria.setNombre("PALA CARGADORA");
        categoriaRepository.save(palacargadoraCategoria);

        // Categoria Excavadora
        Categoria excavadoraCategoria = new Categoria();
        excavadoraCategoria.setCodigo("04");
        excavadoraCategoria.setNombre("EXCAVADORA");
        categoriaRepository.save(excavadoraCategoria);

        // Categoria Montacargas
        Categoria montacargaCategoria = new Categoria();
        montacargaCategoria.setCodigo("05");
        montacargaCategoria.setNombre("MONTACARGA");
        categoriaRepository.save(montacargaCategoria);

        // Categoria Barredora
        Categoria barredoraCategoria = new Categoria();
        barredoraCategoria.setCodigo("06");
        barredoraCategoria.setNombre("BARREDORA");
        categoriaRepository.save(barredoraCategoria);





        // TIPO SUBCATEGORIA
        SubCategoria tipoSubcategoria = new SubCategoria();
        tipoSubcategoria.setCategoria(tractorCategoria);
        tipoSubcategoria.setCodigo("TIPO");
        tipoSubcategoria.setNombre("MAQUINARIA PESADA");
        subCategoriaRepository.save(tipoSubcategoria);

        SubCategoria tipoSubcategoria1 = new SubCategoria();
        tipoSubcategoria1.setCategoria(motocultorCategoria);
        tipoSubcategoria1.setCodigo("TIPO");
        tipoSubcategoria1.setNombre("MAQUINARIA PESADA");
        subCategoriaRepository.save(tipoSubcategoria1);

        SubCategoria tipoSubcategoria2 = new SubCategoria();
        tipoSubcategoria2.setCategoria(palacargadoraCategoria);
        tipoSubcategoria2.setCodigo("TIPO");
        tipoSubcategoria2.setNombre("MAQUINARIA PESADA");
        subCategoriaRepository.save(tipoSubcategoria2);

        SubCategoria tipoSubcategoria3 = new SubCategoria();
        tipoSubcategoria3.setCategoria(excavadoraCategoria);
        tipoSubcategoria3.setCodigo("TIPO");
        tipoSubcategoria3.setNombre("MAQUINARIA PESADA");
        subCategoriaRepository.save(tipoSubcategoria3);

        SubCategoria tipoSubcategoria4 = new SubCategoria();
        tipoSubcategoria4.setCategoria(montacargaCategoria);
        tipoSubcategoria4.setCodigo("TIPO");
        tipoSubcategoria4.setNombre("MAQUINARIA PESADA");
        subCategoriaRepository.save(tipoSubcategoria4);

        SubCategoria tipoSubcategoria5 = new SubCategoria();
        tipoSubcategoria5.setCategoria(barredoraCategoria);
        tipoSubcategoria5.setCodigo("TIPO");
        tipoSubcategoria5.setNombre("MAQUINARIA PESADA");
        subCategoriaRepository.save(tipoSubcategoria5);





        // Maquinaria 1
        Maquinaria maquinaria1 = new Maquinaria();
        maquinaria1.setMarca("MASSEY FERGUSON");
        maquinaria1.setModelo("MOD-2017");
        maquinaria1.setCapacidad("CAP. 1");
        maquinaria1.setPrecio(25000);
        maquinaria1.setSubCategoria(tipoSubcategoria);
        maquinariaRepository.save(maquinaria1);

        Maquinaria maquinaria2 = new Maquinaria();
        maquinaria2.setMarca("CHAGNFA");
        maquinaria2.setModelo("MOD-2017");
        maquinaria2.setCapacidad("CAP. 2");
        maquinaria2.setPrecio(15000);
        maquinaria2.setSubCategoria(tipoSubcategoria1);
        maquinariaRepository.save(maquinaria2);

        Maquinaria maquinaria3 = new Maquinaria();
        maquinaria3.setMarca("VOLVO");
        maquinaria3.setModelo("MOD-2016");
        maquinaria3.setCapacidad("CAP. 2");
        maquinaria3.setPrecio(10000);
        maquinaria3.setSubCategoria(tipoSubcategoria2);
        maquinariaRepository.save(maquinaria3);

        Maquinaria maquinaria4 = new Maquinaria();
        maquinaria4.setMarca("KOMATSU");
        maquinaria4.setModelo("MOD-2016");
        maquinaria4.setCapacidad("CAP. 2");
        maquinaria4.setPrecio(20000);
        maquinaria4.setSubCategoria(tipoSubcategoria3);
        maquinariaRepository.save(maquinaria4);

        Maquinaria maquinaria5 = new Maquinaria();
        maquinaria5.setMarca("DALDOSS");
        maquinaria5.setModelo("MOD-2018");
        maquinaria5.setCapacidad("CAP. 2");
        maquinaria5.setPrecio(8000);
        maquinaria5.setSubCategoria(tipoSubcategoria4);
        maquinariaRepository.save(maquinaria5);

        Maquinaria maquinaria6 = new Maquinaria();
        maquinaria6.setMarca("TENNANT");
        maquinaria6.setModelo("MOD-2018");
        maquinaria6.setCapacidad("CAP. 3");
        maquinaria6.setPrecio(27000);
        maquinaria6.setSubCategoria(tipoSubcategoria5);
        maquinariaRepository.save(maquinaria6);








    }
}
