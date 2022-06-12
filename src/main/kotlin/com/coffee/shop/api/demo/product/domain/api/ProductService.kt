package com.coffee.shop.api.demo.product.domain.api

import com.coffee.shop.api.demo.product.domain.api.dto.ProductDto
import com.coffee.shop.api.demo.product.domain.api.dto.ProductFilter
import org.springframework.data.domain.Page

interface ProductService {
    fun filter(filter: ProductFilter): Page<ProductDto?>
    fun findOne(productId: Long): ProductDto?
}