package com.rest_server.product_manager.controller;

import com.rest_server.product_manager.data.Product;
import com.rest_server.product_manager.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // create products
    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.add(product);
    }

    // get products
    @GetMapping
    public List<Product> getAll(){
        return productService.getAll();
    }

    // delete products
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable String id){
        productService.delete(id);
    }
}
