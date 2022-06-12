package com.coffee.shop.api.demo.product.domain.impl

import com.coffee.shop.api.demo.image.impl.ImageMapper
import com.coffee.shop.api.demo.product.domain.api.dto.ProductDto
import com.coffee.shop.api.demo.product.domain.api.model.Product
import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper(componentModel = "spring", uses = [ImageMapper::class])
interface ProductMapper {
    fun dtoToEntity(dto: ProductDto?): Product?

    @Mapping(source = "color.code", target = "colorCode")
    @Mapping(source = "category.name", target = "categoryName")
    @Mapping(source = "category.code", target = "categoryCode")
    @Mapping(source = "properties.value", target = "propertiesValue")
    fun entityToDto(entity: Product?): ProductDto?
}