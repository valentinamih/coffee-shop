package com.coffee.shop.api.demo.product.domain.api.dto

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
}