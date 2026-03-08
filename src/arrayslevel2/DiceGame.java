package arrayslevel2;

import java.util.Random;

public class DiceGame {
	    public static void main(String[] args) {

	        Random rand = new Random();

	        int[] frequency = new int[6]; // index 0 for 1, 1 for 2 ... 5 for 6

	        // Roll dice 100 times
	        for(int i = 0; i < 100; i++) {
	            int roll = rand.nextInt(6) + 1; // generates number 1 to 6
	            frequency[roll - 1]++; // increase count
	        }

	        // Display frequency
	        for(int i = 0; i < 6; i++) {
	            System.out.println("Number " + (i + 1) + " occurred " + frequency[i] + " times");
	        }
	    }
}
