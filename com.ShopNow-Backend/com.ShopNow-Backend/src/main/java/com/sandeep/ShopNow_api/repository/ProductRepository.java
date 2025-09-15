package com.sandeep.ShopNow_api.repository;

import com.sandeep.ShopNow_api.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
