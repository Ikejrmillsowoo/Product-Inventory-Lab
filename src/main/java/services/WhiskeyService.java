package services;

import models.Whiskey;

import java.util.ArrayList;
import java.util.List;

public class WhiskeyService {
    private int nextId =1;

    private List<Whiskey> inventory = new ArrayList<>();

    public Whiskey create(String name, String brand, int size, int qty, float price) {
        Whiskey createdWhiskey = new Whiskey(nextId++, name, brand, size, qty, price);
        inventory.add(createdWhiskey);

        return createdWhiskey;
    }

    public Whiskey findWhiskeyById(int id) {
        if (inventory == null || inventory.isEmpty()){
            return null;
        }
        for(Whiskey whiskey: inventory){
            if(whiskey !=null && whiskey.getId() == id){
                return whiskey;
            };
        }
        return null;
    }

    public Whiskey[] findAll(){
        return inventory.toArray(new Whiskey[0]);
    }

    public boolean delete(int id){
        return inventory.remove(findWhiskeyById(id));
    }


}
