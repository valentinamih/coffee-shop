package com.coffee.shop.api.demo.dict.domain.impl

import com.coffee.shop.api.demo.dict.domain.api.ColorService
import com.coffee.shop.api.demo.dict.domain.api.dto.ColorDto
import org.springframework.stereotype.Service
import kotlin.streams.toList

@Service
class ColorServiceImpl(
    private var colorRepository: ColorRepository,
    private var colorMapper: ColorMapper
) : ColorService {

    override fun findAll(): List<ColorDto> {
        return colorRepository.findAll().stream().map { colorMapper.dtoToEntity(it) }.toList()
    }
}