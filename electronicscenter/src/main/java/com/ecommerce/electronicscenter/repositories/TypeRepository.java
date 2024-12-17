package com.ecommerce.electronicscenter.repositories;

import com.ecommerce.electronicscenter.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRepository extends JpaRepository<Type, String> {
}
