package com.coffee.shop.api.demo.category.domain.impl;

import com.coffee.shop.api.demo.category.domain.api.CategoryService;
import com.coffee.shop.api.demo.category.domain.api.dto.CategoryDto;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    @Override
    public List<CategoryDto> filter() {
        return categoryRepository
            .findAll()
            .stream()
            .map(categoryMapper::entityToDto)
            .toList();
    }

    @Override
    public CategoryDto findOne(String categoryCode) {
        return categoryRepository.findById(categoryCode).map(categoryMapper::entityToDto)
            .orElseThrow(() -> new RuntimeException("Category not found!"));
    }
}
