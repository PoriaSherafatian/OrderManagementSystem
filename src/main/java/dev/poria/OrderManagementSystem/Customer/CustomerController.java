package dev.poria.OrderManagementSystem.Customer;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<CustomerEntity> getCustomers() {
        return customerService.getAllCustomers();
    }

    @PostMapping
    public CustomerEntity addCustomer(@RequestBody CustomerEntity customer) {
        return customerService.saveCustomer(customer);
    }
}
