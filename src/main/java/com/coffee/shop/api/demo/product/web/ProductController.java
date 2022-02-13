package com.coffee.shop.api.demo.product.web;

import com.coffee.shop.api.demo.product.domain.api.ProductService;
import com.coffee.shop.api.demo.product.domain.api.dto.ProductDto;
import com.coffee.shop.api.demo.product.domain.api.dto.ProductFilter;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
@Api(value = "Products view")
public class ProductController {

    private final ProductService productService;

    @PostMapping("/filter")
    public Page<ProductDto> find(ProductFilter filter) {
        return productService.filter(filter);
    }

    @GetMapping("/{productId}")
    public ProductDto findOne(@PathVariable Long productId) {
        return productService.findOne(productId);
    }
}
