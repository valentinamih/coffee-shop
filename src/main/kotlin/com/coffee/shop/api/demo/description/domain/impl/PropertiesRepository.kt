package com.coffee.shop.api.demo.description.domain.impl

import com.coffee.shop.api.demo.description.domain.api.model.Properties
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PropertiesRepository : JpaRepository<Properties?, Long?>