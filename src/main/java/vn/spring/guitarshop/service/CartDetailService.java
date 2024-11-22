package vn.spring.guitarshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import vn.spring.guitarshop.domain.CartDetail;
import vn.spring.guitarshop.domain.User;

@Service
public class CartDetailService {
    private final UserService userService;

    public CartDetailService(UserService userService) {
        this.userService = userService;
    }

    public List<CartDetail> getAllCartDetail(String email) {
        User user = this.userService.getUserByEmail(email);
        if (user != null) {
            return user.getCart().getCartDetails();
        }
        return null;
    }
}
