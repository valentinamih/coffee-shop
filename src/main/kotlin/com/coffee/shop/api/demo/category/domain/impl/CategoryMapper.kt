package com.coffee.shop.api.demo.category.domain.impl

import com.coffee.shop.api.demo.category.domain.api.dto.CategoryDto
import com.coffee.shop.api.demo.category.domain.api.model.Category
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface CategoryMapper {
    fun dtoToEntity(dto: CategoryDto?): Category?
    fun entityToDto(entity: Category?): CategoryDto?
}