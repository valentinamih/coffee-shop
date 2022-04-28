package com.coffee.shop.api.demo.product.domain.impl;

import com.coffee.shop.api.demo.product.domain.api.dto.ProductFilter;
import com.coffee.shop.api.demo.product.domain.api.model.Product;
import java.util.ArrayList;
import javax.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Long>,
    JpaSpecificationExecutor<Product> {

    static Specification<Product> filterProduct(ProductFilter filter) {
        return (product, cq, cb) -> {
            var predicates = new ArrayList<Predicate>();
            if (filter.getPriceFrom() != null) {
                predicates.add(
                    cb.and(cb.greaterThanOrEqualTo(product.get("price"), filter.getPriceFrom())));
            }
            if (filter.getPriceTo() != null) {
                predicates.add(
                    cb.and(cb.lessThanOrEqualTo(product.get("price"), filter.getPriceTo())));
            }
            if (filter.getProductName() != null) {
                predicates.add(
                    cb.like(product.get("name"), "%" + filter.getProductName() + "%"));
            }
            if (filter.getCategoryCode() != null) {
                predicates.add(
                    cb.equal(product.get("category").get("code"), filter.getCategoryCode()));
            }
            return cb.and(predicates.toArray(new Predicate[0]));
        };
    }

}
