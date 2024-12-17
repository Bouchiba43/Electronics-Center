package com.ecommerce.electronicscenter.repositories;

import com.ecommerce.electronicscenter.entity.Basket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasketRepository extends CrudRepository<Basket, String> {
}
