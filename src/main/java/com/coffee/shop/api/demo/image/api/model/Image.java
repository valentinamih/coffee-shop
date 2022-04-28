package com.coffee.shop.api.demo.image.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

@Entity
@Data
@NoArgsConstructor
public class Image {

    @Id
    private Long id;
    private String type;
    @Lob
    @Column(columnDefinition = "BLOB")
    @Type(type = "org.hibernate.type.BinaryType")
    private byte[] content;
    private String destination;
}
