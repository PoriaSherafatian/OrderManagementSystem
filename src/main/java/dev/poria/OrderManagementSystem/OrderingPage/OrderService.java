package dev.poria.OrderManagementSystem.OrderingPage;

import dev.poria.OrderManagementSystem.Product.ProductEntity;
import dev.poria.OrderManagementSystem.Product.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {


    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;

    public OrderService(OrderRepository orderRepository, ProductRepository productRepository) {
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
    }

    public List<OrderEntity> getAllOrders() {
        return orderRepository.findAll();
    }

    public String placeOrder(OrderEntity order) {
        ProductEntity product = productRepository.findById(order.getProducts().getProductId())
                .orElseThrow();
        if (product.getProductRemaining() >= order.getQuantity()) {
            product.setProductRemaining(product.getProductRemaining() - order.getQuantity());

            productRepository.save(product);

            orderRepository.save(order);

            return "Order placed successfully!";
        } else {
            return "Insufficient stock!";
        }
    }
}
