package utils;

import models.Product;
import models.Sneaker;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVUtils {
    private static final char DEFAULT_SEPARATOR = ',';

    public static void writeLine(Writer w, List<String> values) throws IOException {
        boolean first = true;

        StringBuilder sb = new StringBuilder();

        for (String value: values){
            if (!first){
                sb.append(value);
                first = false;
            }
            sb.append("\n");

            w.append(sb.toString());
        }
    }

    public static void addToCSV(int nextId, List<Product> inventory) throws IOException {
        String csvFile = "src/main/resources/DB.csv";
        FileWriter writer = new FileWriter(csvFile);
        CSVUtils.writeLine(writer, new ArrayList<String>(Arrays.asList(String.valueOf(nextId))));

        for (Product s : inventory) {
            List<String> list = new ArrayList<>(); // (3)
            list.add(String.valueOf(s.getId()));
            list.add(s.getName());
            list.add(s.getBrand());
//            list.add(s.getSport()); conditionally add or remove sport
            list.add(String.valueOf(s.getQty()));
            list.add(String.valueOf(s.getPrice()));
            if (s.getSport()!= null){
                list.add(s.getSport());
            }
            CSVUtils.writeLine(writer, list);
        }

        writer.flush();
        writer.close();

    }

    public void loadData(int nextId, List<Product> inventory){
        String csvFile = "src/main/resources/DB.csv";
        String line = "";
        String csvSplitBy = ",";

        try(BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            nextId = Integer.parseInt(br.readLine());

            while ((line = br.readLine())!= null){
                // split line with comma
                String[] beer = line.split(csvSplitBy);

                int id = Integer.parseInt(beer[0]);
                String name = beer[1];
                String brand = beer[2];
                String sport = beer[3];
                int size = Integer.parseInt(beer[4]);
                int qty = Integer.parseInt(beer[5]);
                float price = Float.parseFloat(beer[6]);

                // (5)
                inventory.add(new Sneaker(id, name, brand, sport, size, qty, price));
            }
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }


}
