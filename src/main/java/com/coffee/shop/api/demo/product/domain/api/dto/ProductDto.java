package com.coffee.shop.api.demo.product.domain.api.dto;

import com.coffee.shop.api.demo.image.api.dto.ImageDto;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import lombok.Data;

@Data
public class ProductDto {

    private Long id;
    private String name;
    private String description;
    private String colorCode;
    private BigDecimal price;
    private String categoryName;
    private String categoryCode;
    private Map<String, String> propertiesValue;
    private List<ImageDto> listImages;
    private List<ImageDto> cardImages;
}
