package com.coffee.shop.api.demo.image.api.dto;

import lombok.Data;

@Data
public class ImageDto {

    private String type;
    private byte[] content;
    private String destination;
}
