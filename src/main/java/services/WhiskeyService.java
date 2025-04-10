package services;

import models.Product;
import models.Whiskey;
import utils.CSVUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WhiskeyService {
    private int nextId =1;

    private List<Product> inventory = new ArrayList<>();

    public Whiskey create(String name, String brand, int size, int qty, float price) throws IOException {
        Whiskey createdWhiskey = new Whiskey(nextId++, name, brand, size, qty, price);
        inventory.add(createdWhiskey);
        CSVUtils.addToCSV(nextId, this.inventory);
        return createdWhiskey;
    }

    public Product findWhiskeyById(int id) {
        if (inventory == null || inventory.isEmpty()){
            return null;
        }
        for(Product whiskey: inventory){
            if(whiskey !=null && whiskey.getId() == id){
                return whiskey;
            };
        }
        return null;
    }

    public Product[] findAll(){
        return inventory.toArray(new Product[0]);
    }

    public boolean delete(int id){
        return inventory.remove(findWhiskeyById(id));
    }

    public List<Product> getInventory() throws IOException {
        CSVUtils.loadData(nextId, this.inventory);
        return inventory;
    }


}
