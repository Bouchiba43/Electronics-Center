package com.ecommerce.electronicscenter.entity;

import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@RedisHash("basket")
public class Basket {
    @Id
    private String id;
    private String productId;
    private List<BasketItem> items = new ArrayList<>();
    public Basket(String id) {
        this.id = id;
    }
}
