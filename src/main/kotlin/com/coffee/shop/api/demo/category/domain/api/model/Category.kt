package com.coffee.shop.api.demo.category.domain.api.model

import lombok.Data
import lombok.NoArgsConstructor
import javax.persistence.Entity
import javax.persistence.Id

@Entity
@Data
@NoArgsConstructor
class Category {
    private val name: String? = null

    @Id
    private val code: String? = null
}