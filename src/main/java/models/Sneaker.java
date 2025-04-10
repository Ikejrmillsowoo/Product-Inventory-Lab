package models;

public class Sneaker extends Product{
//    private int id;
//    private String name;
//    private String brand;
//    private String sport;
//    private int size;
//    private int qty;
//    private float price;

    public Sneaker(){}

    public Sneaker(int id, String name, String brand, String sport, int size, int qty, float price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.sport = sport;
        this.size = size;
        this.qty = qty;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return this.price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getSport() {
        return this.sport;
    }

    public int getQty() {
        return this.qty;
    }

    public int getSize() {
        return this.size;
    }
}
