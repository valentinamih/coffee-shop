package com.coffee.shop.api.demo.product.domain.api.dto

import lombok.Data
import java.math.BigDecimal

@Data
class ProductFilter {
    val priceFrom: BigDecimal? = null
    val priceTo: BigDecimal? = null
    val productName: String? = null
    val categoryCode: String? = null
    val pageNumber = 0
    val pageSize = 0
}