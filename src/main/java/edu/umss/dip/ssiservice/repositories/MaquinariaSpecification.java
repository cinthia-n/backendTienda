package edu.umss.dip.ssiservice.repositories;

import edu.umss.dip.ssiservice.dto.MaquinariaDto;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class MaquinariaSpecification implements Specification<MaquinariaDto> {

    private String marca;
    private String modelo;
    private String capacidad;

    public MaquinariaSpecification(String marca, String modelo, String capacidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    @Override
    public Predicate toPredicate(Root<MaquinariaDto> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
        List<Predicate> predicates = new ArrayList<>();
        if (marca != null) {
            predicates.add(criteriaBuilder.and(criteriaBuilder.equal(root.get("marca"), marca)));
        }
        if (modelo != null) {
            predicates.add(criteriaBuilder.and(criteriaBuilder.equal(root.get("modelo"), modelo)));
        }
        if (capacidad != null) {
            predicates.add(criteriaBuilder.and(criteriaBuilder.equal(root.get("capacidad"), capacidad)));
        }
        return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
    }
}
