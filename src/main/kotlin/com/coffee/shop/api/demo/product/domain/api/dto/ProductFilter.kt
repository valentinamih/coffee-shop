package com.coffee.shop.api.demo.product.domain.api.dto

import lombok.Data
import java.math.BigDecimal

@Data
class ProductFilter {
    var priceFrom: BigDecimal? = null
    var priceTo: BigDecimal? = null
    var productName: String? = null
    var categoryCode: String? = null
    var colorCode: String? = null
    var pageNumber = 0
    var pageSize = 0
}