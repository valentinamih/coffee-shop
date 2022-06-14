package com.coffee.shop.api.demo.product.domain.api.dto

import com.coffee.shop.api.demo.image.api.dto.ImageDto
import lombok.Data
import java.math.BigDecimal

@Data
class ProductDto {
    var id: Long? = null
    var name: String? = null
    var description: String? = null
    var colorCode: String? = null
    var price: BigDecimal? = null
    var categoryName: String? = null
    var categoryCode: String? = null
    var propertiesValue: Map<String, String>? = null
    var listImage: ImageDto? = null
    var cardImages: List<ImageDto>? = null
}