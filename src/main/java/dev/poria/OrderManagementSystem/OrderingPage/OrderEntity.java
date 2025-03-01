package dev.poria.OrderManagementSystem.OrderingPage;

import dev.poria.OrderManagementSystem.Customer.CustomerEntity;
import dev.poria.OrderManagementSystem.Product.ProductEntity;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerEntity customer;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductEntity product;

    private int quantity;
    private LocalDateTime orderDate = LocalDateTime.now();







    public Long getId() {
        return orderId;
    }

    public void setId(Long id) {
        this.orderId = id;
    }

    public CustomerEntity getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerEntity customer) {
        this.customer = customer;
    }

    public ProductEntity getProducts() {
        return product;
    }

    public void setProducts(ProductEntity    products) {
        this.product = products;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
