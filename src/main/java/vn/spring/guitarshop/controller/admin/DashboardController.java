package vn.spring.guitarshop.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import vn.spring.guitarshop.service.OrderService;
import vn.spring.guitarshop.service.ProductService;
import vn.spring.guitarshop.service.UserService;

@Controller
public class DashboardController {

    private final UserService userService;
    private final ProductService productService;
    private final OrderService orderService;

    public DashboardController(UserService userService, ProductService productService, OrderService orderService) {
        this.userService = userService;
        this.productService = productService;
        this.orderService = orderService;
    }

    @GetMapping("/admin")
    public String getDashBoard(Model model) {
        model.addAttribute("countUsers", this.userService.countUsers());
        model.addAttribute("countProducts", this.productService.countProducts());
        model.addAttribute("countOrders", this.orderService.countOrders());
        return "admin/dashboard/show";
    }
}
