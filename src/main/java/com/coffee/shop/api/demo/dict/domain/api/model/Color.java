package com.coffee.shop.api.demo.dict.domain.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Color {

    @Id
    private String code;
    private String name;
}
