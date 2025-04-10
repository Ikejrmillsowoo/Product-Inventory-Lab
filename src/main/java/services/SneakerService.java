package services;

import com.fasterxml.jackson.databind.ObjectMapper;
import models.Product;
import models.Sneaker;
import utils.CSVUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SneakerService {
    private static int nextId = 1;
    private List<Product> inventory = new ArrayList<>();



    public Sneaker create(String name, String brand, String sport, int size, int qty, float price) throws IOException {
        Sneaker createdSneaker = new Sneaker(nextId++, name, brand, sport, size, qty, price);
        inventory.add(createdSneaker);
        CSVUtils.addToCSV(nextId, this.inventory);

        return createdSneaker;
    }

    public Product findSneakerById(int id) {
        if (inventory == null || inventory.isEmpty()) {
            return null;
        }
        for (Product sneaker : inventory) {
            if (sneaker != null && sneaker.getId() == id) {
                return sneaker;
            }
            ;
        }
        return null;
    }

    public Product[] findAll() {

        return inventory.toArray(new Product[0]);
    }

    public boolean delete(int id) {
        if (inventory == null || inventory.isEmpty()) {
            return false;
        }

        return inventory.remove(findSneakerById(id));
    }

    public List<Product> getInventory() throws IOException {
        CSVUtils.loadData(nextId, this.inventory);
        return inventory;
    }



}
