package com.rest_server.product_manager.data;

import lombok.*;

@Getter
@Setter
@Builder
public class Product {
    private String productId;
    private String name;
    private String description;
    private double price;

    public static ProductBuilder builder() {
        return new ProductBuilder();
    }

    public String getProductId() {
        return this.productId;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }

    public void setProductId(final String productId) {
        this.productId = productId;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    public Product(final String productId, final String name, final String description, final double price) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Product() {
    }

    public static class ProductBuilder {
        private String productId;
        private String name;
        private String description;
        private double price;

        ProductBuilder() {
        }

        public ProductBuilder productId(final String productId) {
            this.productId = productId;
            return this;
        }

        public ProductBuilder name(final String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder description(final String description) {
            this.description = description;
            return this;
        }

        public ProductBuilder price(final double price) {
            this.price = price;
            return this;
        }

        public Product build() {
            return new Product(this.productId, this.name, this.description, this.price);
        }

        public String toString() {
            return "Product.ProductBuilder(productId=" + this.productId + ", name=" + this.name + ", description=" + this.description + ", price=" + this.price + ")";
        }
    }
}