package vn.spring.guitarshop.service;

import org.springframework.stereotype.Service;

import vn.spring.guitarshop.domain.Cart;
import vn.spring.guitarshop.domain.User;
import vn.spring.guitarshop.repository.CartRepository;

@Service
public class CartService {
    private final CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public Cart getCartByUser(User user) {
        return this.cartRepository.findByUser(user);
    }
}
