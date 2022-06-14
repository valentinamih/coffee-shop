package com.coffee.shop.api.demo.product.domain.impl

import com.coffee.shop.api.demo.product.domain.api.dto.ProductFilter
import com.coffee.shop.api.demo.product.domain.api.model.Product
import org.springframework.data.jpa.domain.Specification
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository
import javax.persistence.criteria.CriteriaBuilder
import javax.persistence.criteria.CriteriaQuery
import javax.persistence.criteria.Predicate
import javax.persistence.criteria.Root

@Repository
interface ProductRepository : PagingAndSortingRepository<Product?, Long?>,
    JpaSpecificationExecutor<Product?> {
    companion object {
        fun filterProduct(filter: ProductFilter): Specification<Product?> {
            return Specification { product: Root<Product?>, cq: CriteriaQuery<*>?, cb: CriteriaBuilder ->
                val predicates = ArrayList<Predicate>()
                if (filter.priceFrom != null) {
                    predicates.add(
                        cb.and(cb.greaterThanOrEqualTo(product.get("price"), filter.priceFrom))
                    )
                }
                if (filter.priceTo != null) {
                    predicates.add(
                        cb.and(cb.lessThanOrEqualTo(product.get("price"), filter.priceTo))
                    )
                }
                if (filter.productName != null) {
                    predicates.add(
                        cb.like(product.get("name"), "%" + filter.productName + "%")
                    )
                }
                if (filter.categoryCode != null) {
                    predicates.add(
                        cb.equal(product.get<Any>("category").get<Any>("code"), filter.categoryCode)
                    )
                }
                if (filter.colorCode != null) {
                    predicates.add(
                        cb.equal(product.get<Any>("color").get<Any>("code"), filter.categoryCode)
                    )
                }
                cb.and(*predicates.toTypedArray())
            }
        }
    }
}