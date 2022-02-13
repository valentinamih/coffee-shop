package com.coffee.shop.api.demo.category.web;

import com.coffee.shop.api.demo.category.domain.api.CategoryService;
import com.coffee.shop.api.demo.category.domain.api.dto.CategoryDto;
import io.swagger.annotations.Api;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
@Api(value = "Categories view")
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping()
    public List<CategoryDto> findAll() {
        return categoryService.filter();
    }

    @GetMapping("/{categoryCode}")
    public CategoryDto findOne(@PathVariable String categoryCode) {
        return categoryService.findOne(categoryCode);
    }
}
