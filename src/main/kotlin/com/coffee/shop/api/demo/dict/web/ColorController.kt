package com.coffee.shop.api.demo.dict.web

import com.coffee.shop.api.demo.dict.domain.api.ColorService
import com.coffee.shop.api.demo.dict.domain.api.dto.ColorDto
import io.swagger.annotations.Api
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/colors")
@Api(value = "Colors view")
class ColorController(
    private var colorService: ColorService
) {

    @GetMapping
    fun findAll(): List<ColorDto> {
        return colorService.findAll()
    }
}