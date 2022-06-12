package com.coffee.shop.api.demo.image.api.model

import lombok.Data
import lombok.NoArgsConstructor
import org.hibernate.annotations.Type
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Lob

@Entity
@Data
@NoArgsConstructor
class Image {
    @Id
    private val id: Long? = null
    private val type: String? = null

    @Lob
    @Column(columnDefinition = "BLOB")
    @Type(type = "org.hibernate.type.BinaryType")
    private lateinit var content: ByteArray
    private val destination: String? = null
}