package dev.poria.OrderManagementSystem.Product;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/products")
    public class ProductController {

        private final ProductService productService;

        public ProductController(ProductService productService) {
            this.productService = productService;
        }

        @GetMapping
        public List<ProductEntity> getProducts() {
            return productService.getAllProducts();
        }

        @PostMapping
        public ProductEntity addProduct(@RequestBody ProductEntity product) {
            return productService.saveProduct(product);
        }

}
