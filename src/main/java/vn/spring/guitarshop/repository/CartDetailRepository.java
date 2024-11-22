package vn.spring.guitarshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.spring.guitarshop.domain.Cart;
import vn.spring.guitarshop.domain.CartDetail;
import vn.spring.guitarshop.domain.Product;

@Repository
public interface CartDetailRepository extends JpaRepository<CartDetail, Long> {
    CartDetail findByCartAndProduct(Cart cart, Product product);
}
