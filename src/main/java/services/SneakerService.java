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
}
