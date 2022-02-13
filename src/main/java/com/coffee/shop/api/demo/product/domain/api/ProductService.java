package com.coffee.shop.api.demo.product.domain.api;

import com.coffee.shop.api.demo.product.domain.api.dto.ProductDto;
import com.coffee.shop.api.demo.product.domain.api.dto.ProductFilter;
import org.springframework.data.domain.Page;

public interface ProductService {

    Page<ProductDto> filter(ProductFilter filter);

    ProductDto findOne(Long productId);

}
