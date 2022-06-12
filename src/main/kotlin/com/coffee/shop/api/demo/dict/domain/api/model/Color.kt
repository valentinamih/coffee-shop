package com.coffee.shop.api.demo.dict.domain.api.model

import lombok.Data
import lombok.NoArgsConstructor
import javax.persistence.Entity
import javax.persistence.Id

@Entity
@Data
@NoArgsConstructor
class Color {
    @Id
    private val code: String? = null
    private val name: String? = null
}