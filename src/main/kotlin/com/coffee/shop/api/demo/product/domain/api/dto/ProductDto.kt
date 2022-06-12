package com.coffee.shop.api.demo.product.domain.api.dto

import com.coffee.shop.api.demo.image.api.dto.ImageDto
import lombok.Data
import java.math.BigDecimal

@Data
class ProductDto {
    private val id: Long? = null
    private val name: String? = null
    private val description: String? = null
    private val colorCode: String? = null
    private val price: BigDecimal? = null
    private val categoryName: String? = null
    private val categoryCode: String? = null
    private val propertiesValue: Map<String, String>? = null
    private val listImages: List<ImageDto>? = null
    private val cardImages: List<ImageDto>? = null
}