package com.coffee.shop.api.demo.image.api.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Image {
    @Id
    var id: Long? = null
    var type: String? = null
    var name: String? = null
    var destination: String? = null
}