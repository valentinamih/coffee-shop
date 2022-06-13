package com.coffee.shop.api.demo.image.api

interface ImageService {

    fun list(id: String): ByteArray

    fun card(id: String): List<ByteArray>
}