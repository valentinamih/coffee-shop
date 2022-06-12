package com.coffee.shop.api.demo.product.web

import com.coffee.shop.api.demo.product.domain.api.ProductService
import com.coffee.shop.api.demo.product.domain.api.dto.ProductDto
import com.coffee.shop.api.demo.product.domain.api.dto.ProductFilter
import io.swagger.annotations.Api
import lombok.RequiredArgsConstructor
import org.springframework.data.domain.Page
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
@Api(value = "Products view")
class ProductController(
    private val productService: ProductService
) {

    @PostMapping("/filter")
    fun find(@RequestBody filter: ProductFilter): Page<ProductDto?> {
        return productService.filter(filter)
    }

    @GetMapping("/{productId}")
    fun findOne(@PathVariable productId: Long): ProductDto? {
        return productService.findOne(productId)
    }
}