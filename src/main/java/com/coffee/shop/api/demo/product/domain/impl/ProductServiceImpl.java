package com.coffee.shop.api.demo.product.domain.impl;

import com.coffee.shop.api.demo.product.domain.api.ProductService;
import com.coffee.shop.api.demo.product.domain.api.dto.ProductDto;
import com.coffee.shop.api.demo.product.domain.api.dto.ProductFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper mapper;

    @Override
    @Transactional(readOnly = true)
    public Page<ProductDto> filter(ProductFilter filter) {
        var list = productRepository
            .findAll(ProductRepository.filterProduct(filter),
                PageRequest.of(filter.getPageNumber(), filter.getPageSize()));
        return list.map(mapper::entityToDto);
    }

    @Override
    @Transactional(readOnly = true)
    public ProductDto findOne(Long productId) {
        return productRepository.findById(productId)
            .map(mapper::entityToDto)
            .orElseThrow(() -> new RuntimeException("Product not found!"));
    }
}
