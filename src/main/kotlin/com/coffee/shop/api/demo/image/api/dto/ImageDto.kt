package com.coffee.shop.api.demo.image.api.dto

import lombok.Data

@Data
class ImageDto {
    private val type: String? = null
    private lateinit var content: ByteArray
    private val destination: String? = null
}