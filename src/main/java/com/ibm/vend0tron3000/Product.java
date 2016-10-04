package com.ibm.vend0tron3000;

/**
 * Created by hermanvanderveer on 29/09/16.
 */
public class Product {
    int id;
    String category;
    String name;
    int amount;
    float price;

    public Product(int id, String category, String name, int amount, float price) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
