package dev.poria.OrderManagementSystem.Customer;

import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "customerFullName", nullable = false, length = 100)
    private String customerFullName;

}
