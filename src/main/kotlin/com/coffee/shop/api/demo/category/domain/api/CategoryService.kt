package com.coffee.shop.api.demo.category.domain.api

import com.coffee.shop.api.demo.category.domain.api.dto.CategoryDto

interface CategoryService {
    fun filter(): List<CategoryDto?>
    fun findOne(categoryCode: String): CategoryDto?
}