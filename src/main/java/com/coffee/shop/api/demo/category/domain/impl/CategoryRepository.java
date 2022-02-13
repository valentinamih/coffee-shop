package com.coffee.shop.api.demo.category.domain.impl;

import com.coffee.shop.api.demo.category.domain.api.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {

}
