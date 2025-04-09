package models;

public class Whiskey {
    private int id;
    private String name;
    private String brand;
    private String size;
    private int qty;
    private float price;

public Whiskey(){

}

    public Whiskey(int id, String name, String brand, String size, int qty, float price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.size = size;
        this.qty = qty;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getSize() {
        return this.size;
    }

    public int getQty() {
        return this.qty;
    }

    public float getPrice() {
        return this.price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setSize(String size) {
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
