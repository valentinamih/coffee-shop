package com.coffee.shop.api.demo.dict.domain.impl;

import com.coffee.shop.api.demo.dict.domain.api.model.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorRepository extends JpaRepository<Color, String> {

}
