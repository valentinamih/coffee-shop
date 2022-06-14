package com.coffee.shop.api.demo.image.web

import com.coffee.shop.api.demo.image.api.ImageService
import io.swagger.annotations.Api
import lombok.RequiredArgsConstructor
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/images")
@RequiredArgsConstructor
@Api(value = "Images")
class ImageController(private val imageService: ImageService) {

    @GetMapping("/list/{id}")
    fun list(@PathVariable id: String): ResponseEntity<ByteArray> {
        return ResponseEntity.ok(imageService.list(id))
    }

    @GetMapping("/card/{id}")
    fun card(@PathVariable id: String): ResponseEntity<List<ByteArray>> {
        return ResponseEntity.ok(imageService.card(id))
    }

    @PostMapping("/card")
    fun card(@RequestBody ids: Array<String>): ResponseEntity<Map<String, List<ByteArray>>> {
        return ResponseEntity.ok(imageService.card(ids))
    }
}