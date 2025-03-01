package dev.poria.OrderManagementSystem.OrderRequest;

import dev.poria.OrderManagementSystem.Customer.CustomerEntity;
import dev.poria.OrderManagementSystem.Product.ProductEntity;

public class OrderRequest {
    private CustomerEntity customer;
    private ProductEntity products;

    public CustomerEntity getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerEntity customer) {
        this.customer = customer;
    }

    public ProductEntity getProducts() {
        return products;
    }

    public void setProducts(ProductEntity products) {
        this.products = products;
    }
}
