package services;

import models.Sneaker;
import utils.CSVUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
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
        if (inventory == null || inventory.isEmpty()) {
            return null;
        }
        for (Sneaker sneaker : inventory) {
            if (sneaker != null && sneaker.getId() == id) {
                return sneaker;
            }
            ;
        }
        return null;
    }

    public Sneaker[] findAll() {
        return inventory.toArray(new Sneaker[0]);
    }

    public boolean delete(int id) {
        if (inventory == null || inventory.isEmpty()) {
            return false;
        }

        return inventory.remove(findSneakerById(id));
    }

    public List<Sneaker> getInventory() {
        return inventory;
    }


//    public void addToCSV() throws IOException {
//        String csvFile = "/Users/batman/Desktop/Sneaker.csv";
//        FileWriter writer = new FileWriter(csvFile);
//        CSVUtils.writeLine(writer, new ArrayList<String>(Arrays.asList(String.valueOf(nextId))));
//
//        for (Sneaker s : inventory) {
//            List<String> list = new ArrayList<>(); // (3)
//            list.add(String.valueOf(s.getId()));
//            list.add(s.getName());
//            list.add(s.getBrand());
//            list.add(s.getSport());
//            list.add(String.valueOf(s.getQty()));
//            list.add(String.valueOf(s.getPrice()));
//
//            CSVUtils.writeLine(writer, list);
//        }
//
//        writer.flush();
//        writer.close();
//
//    }

//    public void loadData(){
//        String csvFile = "/Users/batman/Desktop/Sneaker.csv";
//        String line = "";
//        String csvSplitBy = ",";
//
//        try(BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
//            nextId = Integer.parseInt(br.readLine());
//
//            while ((line = br.readLine())!= null){
//                // split line with comma
//                String[] beer = line.split(csvSplitBy);
//
//                int id = Integer.parseInt(beer[0]);
//                String name = beer[1];
//                String brand = beer[2];
//                String sport = beer[3];
//                int size = Integer.parseInt(beer[4]);
//                int qty = Integer.parseInt(beer[5]);
//                float price = Float.parseFloat(beer[6]);
//
//                // (5)
//                inventory.add(new Sneaker(id, name, brand, sport, size, qty, price));
//            }
//        }  catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


}
