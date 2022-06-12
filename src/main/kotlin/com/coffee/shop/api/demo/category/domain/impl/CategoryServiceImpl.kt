package com.coffee.shop.api.demo.category.domain.impl

import com.coffee.shop.api.demo.category.domain.api.CategoryService
import com.coffee.shop.api.demo.category.domain.api.dto.CategoryDto
import com.coffee.shop.api.demo.category.domain.api.model.Category
import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Service
import java.util.Collections
import kotlin.streams.toList

@Service
@RequiredArgsConstructor
class CategoryServiceImpl : CategoryService {
    private val categoryRepository: CategoryRepository? = null
    private val categoryMapper: CategoryMapper? = null
    override fun filter(): List<CategoryDto?> {
        return categoryRepository
            ?.findAll()
            ?.stream()
            ?.map { entity: Category? -> categoryMapper!!.entityToDto(entity) }
            ?.toList() ?: Collections.emptyList()
    }

    override fun findOne(categoryCode: String): CategoryDto? {
        return categoryRepository!!.findById(categoryCode)
            .map { entity: Category? -> categoryMapper!!.entityToDto(entity) }
            .orElseThrow { RuntimeException("Category not found!") }
    }
}