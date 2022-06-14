package com.coffee.shop.api.demo.dict.domain.api

import com.coffee.shop.api.demo.dict.domain.api.dto.ColorDto

interface ColorService {

    fun findAll(): List<ColorDto>
}