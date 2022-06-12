package com.coffee.shop.api.demo.product.domain.impl

import com.coffee.shop.api.demo.product.domain.api.ProductService
import com.coffee.shop.api.demo.product.domain.api.dto.ProductDto
import com.coffee.shop.api.demo.product.domain.api.dto.ProductFilter
import com.coffee.shop.api.demo.product.domain.api.model.Product
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
open class ProductServiceImpl(
    private val productRepository: ProductRepository,
    private val mapper: ProductMapper
) : ProductService {
    @Transactional(readOnly = true)
    override fun filter(filter: ProductFilter): Page<ProductDto?> {
        val list = productRepository
            .findAll(
                ProductRepository.filterProduct(filter),
                PageRequest.of(filter.pageNumber, filter.pageSize)
            )
        return list.map { entity: Product? -> mapper.entityToDto(entity) }
    }

    @Transactional(readOnly = true)
    override fun findOne(productId: Long): ProductDto? {
        return productRepository.findById(productId)
            .map { entity: Product? -> mapper.entityToDto(entity) }
            .orElseThrow { RuntimeException("Product not found!") }
    }
}