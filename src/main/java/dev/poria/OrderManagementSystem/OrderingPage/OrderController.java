package dev.poria.OrderManagementSystem.OrderingPage;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")

public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<OrderEntity> getOrders() {
        return orderService.getAllOrders();
    }

    @PostMapping
    public String placeOrder(@RequestBody OrderEntity order) {
        return orderService.placeOrder(order);
    }
}
