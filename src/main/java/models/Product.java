package models;

import lombok.Getter;

@Getter

public abstract class Product {
    protected int id;
    protected String name;
    protected String brand;
    protected String sport;
    protected int size;
    protected int qty;
    protected float price;
}
