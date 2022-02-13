package com.coffee.shop.api.demo.category.domain.api;

import com.coffee.shop.api.demo.category.domain.api.dto.CategoryDto;
import java.util.List;

public interface CategoryService {

    List<CategoryDto> filter();

    CategoryDto findOne(String categoryCode);
}
