package com.coffee.shop.api.demo.product.domain.impl;

import com.coffee.shop.api.demo.image.impl.ImageMapper;
import com.coffee.shop.api.demo.product.domain.api.dto.ProductDto;
import com.coffee.shop.api.demo.product.domain.api.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {ImageMapper.class})
public interface ProductMapper {

    Product dtoToEntity(ProductDto dto);

    @Mapping(source = "color.code", target = "colorCode")
    @Mapping(source = "category.name", target = "categoryName")
    @Mapping(source = "category.code", target = "categoryCode")
    @Mapping(source = "properties.value", target = "propertiesValue")
    ProductDto entityToDto(Product entity);
}
