package com.coffee.shop.api.demo.product.domain.api.model

import com.coffee.shop.api.demo.category.domain.api.model.Category
import com.coffee.shop.api.demo.description.domain.api.model.Properties
import com.coffee.shop.api.demo.dict.domain.api.model.Color
import com.coffee.shop.api.demo.image.api.model.Image
import org.hibernate.annotations.BatchSize
import org.hibernate.annotations.Where
import java.math.BigDecimal
import javax.persistence.*

@Entity
class Product {
    @Id
    var id: Long? = null
    var name: String? = null
    var description: String? = null

    @JoinColumn
    @ManyToOne(fetch = FetchType.LAZY)
    var color: Color? = null
    var price: BigDecimal? = null

    @JoinColumn
    @ManyToOne(fetch = FetchType.LAZY)
    var category: Category? = null

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    var properties: Properties? = null

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    @BatchSize(size = 25)
    @Where(clause = "DESTINATION = 'LIST'")
    var listImage: Image? = null

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    @BatchSize(size = 25)
    @Where(clause = "DESTINATION = 'CARD'")
    var cardImages: List<Image>? = null
}