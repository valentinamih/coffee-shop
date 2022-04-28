package com.coffee.shop.api.demo.product.domain.api.model;

import com.coffee.shop.api.demo.category.domain.api.model.Category;
import com.coffee.shop.api.demo.description.domain.api.model.Properties;
import com.coffee.shop.api.demo.dict.domain.api.model.Color;
import com.coffee.shop.api.demo.image.api.model.Image;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Where;

@Entity
@Data
@NoArgsConstructor
public class Product {

    @Id
    private Long id;
    private String name;
    private String description;
    @JoinColumn
    @ManyToOne(fetch = FetchType.LAZY)
    private Color color;
    private BigDecimal price;
    @JoinColumn
    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;
    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private Properties properties;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    @BatchSize(size = 25)
    @Where(clause = "DESTINATION = 'LIST'")
    private List<Image> listImages;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    @BatchSize(size = 25)
    @Where(clause = "DESTINATION = 'CARD'")
    private List<Image> cardImages;
}
