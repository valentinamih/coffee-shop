package com.coffee.shop.api.demo.dict.domain.impl

import com.coffee.shop.api.demo.dict.domain.api.dto.ColorDto
import com.coffee.shop.api.demo.dict.domain.api.model.Color
import com.coffee.shop.api.demo.image.impl.ImageMapper
import org.mapstruct.Mapper

@Mapper(componentModel = "spring", uses = [ImageMapper::class])
interface ColorMapper {

    fun dtoToEntity(dto: Color?): ColorDto
}