package com.coffee.shop.api.demo.image.api.model

import org.hibernate.annotations.Type
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Lob

@Entity
class Image {
    @Id
    var id: Long? = null
    var type: String? = null

    @Lob
    @Column(columnDefinition = "BLOB")
    @Type(type = "org.hibernate.type.BinaryType")
    lateinit var content: ByteArray
    var destination: String? = null
}