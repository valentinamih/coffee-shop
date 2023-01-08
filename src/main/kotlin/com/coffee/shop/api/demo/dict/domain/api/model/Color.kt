package com.coffee.shop.api.demo.dict.domain.api.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Color {
    @Id
    var code: String? = null
    var name: String? = null
}