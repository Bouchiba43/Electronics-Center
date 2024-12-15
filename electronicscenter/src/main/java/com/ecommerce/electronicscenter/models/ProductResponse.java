package com.ecommerce.electronicscenter.models;

import com.ecommerce.electronicscenter.entity.Brand;
import com.ecommerce.electronicscenter.entity.Type;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {
    private Integer id;
    private String name;
    private String description;
    private long price;
    private String pictureURL;
    private Brand brand;
    private Type type;
}
