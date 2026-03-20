package filehandlinglevel2;

import java.io.*;
import java.util.*;

public class MobileShop {

    static String fileName = "Items.txt";

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Search Model");
            System.out.println("2. Add New Model");
            System.out.println("3. Update Cost");
            System.out.println("4. Costliest Item");
            System.out.println("5. Display Stock");
            System.out.println("6. Record Sales");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter model to search: ");
                    String search = sc.nextLine();
                    searchModel(search);
                    break;

                case 2:
                    System.out.print("Enter model: ");
                    String model = sc.nextLine();
                    System.out.print("Enter cost: ");
                    int cost = sc.nextInt();
                    addModel(model, cost);
                    break;

                case 3:
                    System.out.print("Enter model to update: ");
                    String m = sc.nextLine();
                    System.out.print("Enter new cost: ");
                    int newCost = sc.nextInt();
                    updateCost(m, newCost);
                    break;

                case 4:
                    findCostliest();
                    break;

                case 5:
                    displayItems();
                    break;

                case 6:
                    recordSales(sc);
                    break;

                case 7:
                    System.exit(0);
            }
        }
    }

    // 1. Search
    static void searchModel(String search) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        boolean found = false;

        while ((line = br.readLine()) != null) {
            if (line.startsWith(search)) {
                System.out.println("Found: " + line);
                found = true;
            }
        }

        if (!found)
            System.out.println("Model not found");

        br.close();
    }

    // 2. Add
    static void addModel(String model, int cost) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true));
        bw.write(model + " " + cost);
        bw.newLine();
        bw.close();
        System.out.println("Added successfully");
    }

    // 3. Update
    static void updateCost(String model, int newCost) throws Exception {
        File file = new File(fileName);
        File temp = new File("temp.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedWriter bw = new BufferedWriter(new FileWriter(temp));

        String line;

        while ((line = br.readLine()) != null) {
            if (line.startsWith(model)) {
                bw.write(model + " " + newCost);
            } else {
                bw.write(line);
            }
            bw.newLine();
        }

        br.close();
        bw.close();

        file.delete();
        temp.renameTo(file);

        System.out.println("Updated successfully");
    }

    // 4. Costliest
    static void findCostliest() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        int max = 0;
        String maxItem = "";

        while ((line = br.readLine()) != null) {
            String[] data = line.split(" ");
            int cost = Integer.parseInt(data[1]);

            if (cost > max) {
                max = cost;
                maxItem = line;
            }
        }

        System.out.println("Costliest Item: " + maxItem);
        br.close();
    }

    // 5. Display
    static void displayItems() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;

        System.out.println("Stock:");
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }

    // 6. Sales
    static void recordSales(Scanner sc) throws Exception {

        System.out.print("Enter date: ");
        String date = sc.nextLine();

        System.out.print("Enter model sold: ");
        String model = sc.nextLine();

        System.out.print("Enter amount: ");
        int amount = sc.nextInt();
        sc.nextLine();

        // Daily file
        BufferedWriter daily = new BufferedWriter(new FileWriter("DailySales.txt", true));
        daily.write(date + " " + model + " " + amount);
        daily.newLine();
        daily.close();

        // Monthly file
        BufferedWriter monthly = new BufferedWriter(new FileWriter("MonthlySales.txt", true));
        monthly.write(date + " " + model + " " + amount);
        monthly.newLine();
        monthly.close();

        System.out.println("Sales recorded");
    }
}