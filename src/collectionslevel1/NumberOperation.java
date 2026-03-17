package collectionslevel1;

import java.util.*;

public class NumberOperation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new TreeSet<>(); // sorted + no duplicates

        // Input
        while (true) {
            System.out.print("Enter a number (or type 'done' to finish): ");
            String input = sc.next();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            int num = Integer.parseInt(input);
            set.add(num);
        }

        // Convert to list
        List<Integer> list = new ArrayList<>(set);

        // Display sorted unique numbers
        System.out.println("Sorted unique numbers: " + list);

        // Calculate average
        double sum = 0;
        for (int n : list) {
            sum += n;
        }
        double avg = sum / list.size();
        System.out.println("Average: " + avg);

        // Lowest and Highest
        System.out.println("Lowest: " + list.get(0));
        System.out.println("Highest: " + list.get(list.size() - 1));

        // Filter odd numbers
        List<Integer> oddList = new ArrayList<>();
        for (int n : list) {
            if (n % 2 != 0) {
                oddList.add(n);
            }
        }

        System.out.println("Odd numbers: " + oddList);

        sc.close();
    }
}