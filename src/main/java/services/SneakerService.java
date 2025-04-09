package services;

import models.Sneaker;

import java.util.ArrayList;
import java.util.List;

public class SneakerService {
    private static int nextId = 1;

    private List<Sneaker> inventory = new ArrayList<>();

    public Sneaker create(String name, String brand, String sport, int size, int qty, float price) {
        Sneaker createdSneaker = new Sneaker(nextId++, name, brand, sport, size, qty, price);
        inventory.add(createdSneaker);

        return createdSneaker;
    }

    public Sneaker findSneakerById(int id) {
        if (inventory == null || inventory.isEmpty()){
            return null;
        }
        for(Sneaker sneaker: inventory){
           if(sneaker !=null && sneaker.getId() == id){
               return sneaker;
           };
        }
        return null;
    }

    public Sneaker[] findAll(){
        return inventory.toArray(new Sneaker[0]);
    }

    public boolean delete(int id){
        if (inventory == null || inventory.isEmpty()){
            return false;
        }

        return inventory.remove(findSneakerById(id));
    }

    public List<Sneaker> getInventory() {
        return inventory;
    }


}
