package com.coffee.shop.api.demo.image.impl;

import com.coffee.shop.api.demo.image.api.dto.ImageDto;
import com.coffee.shop.api.demo.image.api.model.Image;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ImageMapper {

    Image dtoToEntity(ImageDto dto);

    ImageDto entityToDto(Image entity);

}
