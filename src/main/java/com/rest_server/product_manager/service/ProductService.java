package com.rest_server.product_manager.service;

import com.rest_server.product_manager.data.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ProductService {

    private List<Product> list = new ArrayList<>();

    public  ProductService(){
        list.add(
                Product.builder()
                        .name("Demo Product 1.")
                        .productId(UUID.randomUUID().toString())
                        .description("This is demo product 1.")
                        .price(1234.321)
                        .build()
        );
    }

    //
    public Product add(Product product) {
        product.setProductId(UUID.randomUUID().toString());
        list.add(product);
        return product;
    }

    // get all
    public List<Product> getAll() {
        return list;
    }

    // delete product
    public void delete(String id) {
        list.removeIf(product -> product.getProductId().equals(id));
    }
}
