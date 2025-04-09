package io;

import java.util.Scanner;

public class Console {
    Scanner scanner = new Scanner(System.in);
    public static void printWelcome(){
        System.out.println("\n"+
                "******************************************************\n" +
                "***            Welcome and Bienvenue               ***\n" +
                "***                     to                         ***\n" +
                "***            ZipCo Inventory Manager             ***\n" +
                "******************************************************\n");
    }

    public void updateUser(String string){
        System.out.println(string);
    }

    public void mainMenu(){
        System.out.println("\n"+
                "Main menu\n" +
                "(1) Add product to inventory\n"+
                "(2) Look up existing product\n"+
                "(3) Update products\n"+
                "(4) Delete products\n"+
                "(5) Get reports about products\n"+
                "(6) Exit program\n");
    }

    public String getUserInformation() {
        return scanner.nextLine();
    }
}
