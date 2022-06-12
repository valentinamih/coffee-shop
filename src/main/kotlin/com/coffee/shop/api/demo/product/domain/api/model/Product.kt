package com.coffee.shop.api.demo.product.domain.api.model

import com.coffee.shop.api.demo.category.domain.api.model.Category
import com.coffee.shop.api.demo.description.domain.api.model.Properties
import com.coffee.shop.api.demo.dict.domain.api.model.Color
import com.coffee.shop.api.demo.image.api.model.Image
import lombok.Data
import lombok.NoArgsConstructor
import org.hibernate.annotations.BatchSize
import org.hibernate.annotations.Where
import java.math.BigDecimal
import javax.persistence.*

@Entity
@Data
@NoArgsConstructor
class Product {
    @Id
    private val id: Long? = null
    private val name: String? = null
    private val description: String? = null

    @JoinColumn
    @ManyToOne(fetch = FetchType.LAZY)
    private val color: Color? = null
    private val price: BigDecimal? = null

    @JoinColumn
    @ManyToOne(fetch = FetchType.LAZY)
    private val category: Category? = null

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private val properties: Properties? = null

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    @BatchSize(size = 25)
    @Where(clause = "DESTINATION = 'LIST'")
    private val listImages: List<Image>? = null

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    @BatchSize(size = 25)
    @Where(clause = "DESTINATION = 'CARD'")
    private val cardImages: List<Image>? = null
}