package com.coffee.shop.api.demo.category.domain.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Category {

    private String name;
    @Id
    private String code;
}
