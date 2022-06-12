package com.coffee.shop.api.demo.category.domain.api.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Category {
    var name: String? = null
    @Id
    var code: String? = null
}