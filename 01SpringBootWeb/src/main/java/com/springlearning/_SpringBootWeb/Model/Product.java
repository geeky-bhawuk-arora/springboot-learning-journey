package com.springlearning._SpringBootWeb.Model;

import org.springframework.stereotype.Component;

@Component
public class Product {
    private int prodId;
    private String prodName;
    private int price;

    public Product() {

    }

    public Product(int prodId, String prodName, int price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
    }

    public int getProdId() {
        return prodId;
    }

    public String getName() {
        return prodName;
    }

    public int getPrice() {
        return price;
    }
}
