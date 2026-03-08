package arrayslevel3;

import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arun = new int[10];
        int[] naveen = new int[10];

        int arunTotal = 0;
        int naveenTotal = 0;

        System.out.println("Enter Arun Dice Values:");

        for (int i = 0; i < 10; i++) {
            arun[i] = sc.nextInt();
            arunTotal += arun[i];
        }

        System.out.println("Enter Naveen Dice Values:");

        for (int i = 0; i < 10; i++) {
            naveen[i] = sc.nextInt();
            naveenTotal += naveen[i];
        }

        if (arunTotal > naveenTotal) {
            System.out.println("Arun Wins!!!");
        } 
        else if (naveenTotal > arunTotal) {
            System.out.println("Naveen Wins!!!");
        } 
        else {
            System.out.println("Match Draw");
        }

        sc.close();
    }
}