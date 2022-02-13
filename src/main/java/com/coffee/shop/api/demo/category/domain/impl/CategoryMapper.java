package com.coffee.shop.api.demo.category.domain.impl;

import com.coffee.shop.api.demo.category.domain.api.dto.CategoryDto;
import com.coffee.shop.api.demo.category.domain.api.model.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    Category dtoToEntity(CategoryDto dto);

    CategoryDto entityToDto(Category entity);
}
