package models;

import lombok.Getter;

@Getter
public class Whiskey extends Product {
//    private int id;
//    private String name;
//    private String brand;
//    private int size;
//    private int qty;
//    private float price;

    //can move shared variables to product

public Whiskey(){

}

    public Whiskey(int id, String name, String brand, int size, int qty, float price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.size = size;
        this.qty = qty;
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
