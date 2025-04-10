package utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
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

        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        writer.writeValue(new File("src/main/resources/DB.json"), inventory);


    }

    public static void loadData(int nextId, List<Product> inventory) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        inventory = objectMapper.readValue(new File("src/main/resources/DB.json"), new TypeReference<List<Product>>(){});
    }


}
