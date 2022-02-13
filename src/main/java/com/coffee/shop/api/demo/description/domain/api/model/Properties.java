package com.coffee.shop.api.demo.description.domain.api.model;

import com.coffee.shop.api.demo.utils.HashMapConverter;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import java.util.Map;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.TypeDef;

@Entity
@Data
@NoArgsConstructor
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class Properties {

    @Id
    private Long id;
    @Convert(converter = HashMapConverter.class)
    private Map<String, String> value;
}
