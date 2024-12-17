package com.ecommerce.electronicscenter.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "Product")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private String id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Description",length = 500)
    private String description;
    @Column(name = "Price")
    private long price;
    @Column(name = "PictureURL")
    private String pictureURL;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ProductBrandId", referencedColumnName = "Id")
    private Brand brand;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ProductTypeId", referencedColumnName = "Id")
    private Type type;
}
