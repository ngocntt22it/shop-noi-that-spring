package com.tpanh.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tpanh.server.domain.Cart;
import com.tpanh.server.domain.CartDetail;
import com.tpanh.server.domain.Product;

@Repository
public interface CartDetailRepository extends JpaRepository<CartDetail, Long> {
  boolean existsByCartAndProduct(Cart cart, Product product);

  CartDetail findByCartAndProduct(Cart cart, Product product);
}
