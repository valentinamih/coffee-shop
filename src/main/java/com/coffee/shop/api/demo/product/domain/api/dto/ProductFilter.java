package com.coffee.shop.api.demo.product.domain.api.dto;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class ProductFilter {

    private BigDecimal priceFrom;
    private BigDecimal priceTo;
    private String productName;
    private String categoryCode;
    private int pageNumber;
    private int pageSize;
}
