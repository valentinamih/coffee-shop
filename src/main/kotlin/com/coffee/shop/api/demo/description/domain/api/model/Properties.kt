package com.coffee.shop.api.demo.description.domain.api.model

import com.coffee.shop.api.demo.utils.HashMapConverter
import com.vladmihalcea.hibernate.type.json.JsonBinaryType
import lombok.Data
import lombok.NoArgsConstructor
import org.hibernate.annotations.TypeDef
import javax.persistence.Convert
import javax.persistence.Entity
import javax.persistence.Id

@Entity
@Data
@NoArgsConstructor
@TypeDef(name = "jsonb", typeClass = JsonBinaryType::class)
class Properties {
    @Id
    private val id: Long? = null

    @Convert(converter = HashMapConverter::class)
    private val value: Map<String, String>? = HashMap()
}