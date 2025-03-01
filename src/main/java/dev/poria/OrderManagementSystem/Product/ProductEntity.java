package dev.poria.OrderManagementSystem.Product;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    @Column(name = "productName" , nullable = false , length = 50)
    private String productName;

    @Column(name = "productPrice" , nullable = false , length = 50)
    private Long productPrice;

    @Column(name = "productRemaining" , nullable = false , length = 50)
    private int productRemaining;




    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Long productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductRemaining() {
        return productRemaining;
    }

    public void setProductRemaining(int productRemaining) {
        this.productRemaining = productRemaining;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
