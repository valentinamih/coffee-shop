package com.coffee.shop.api.demo.category.web

import com.coffee.shop.api.demo.category.domain.api.CategoryService
import com.coffee.shop.api.demo.category.domain.api.dto.CategoryDto
import io.swagger.annotations.Api
import lombok.RequiredArgsConstructor
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
@Api(value = "Categories view")
class CategoryController {
    private val categoryService: CategoryService? = null

    @GetMapping
    fun findAll(): List<CategoryDto?>? {
        return categoryService!!.filter()
    }

    @GetMapping("/{categoryCode}")
    fun findOne(@PathVariable categoryCode: String): CategoryDto? {
        return categoryService!!.findOne(categoryCode)
    }
}