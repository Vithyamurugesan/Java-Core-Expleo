package functionlevel2;

import java.util.Scanner;

public class OverTimePay {
	    // Function to calculate overtime pay
	    public static int calculateOvertime(int hours) {
	        if (hours > 40) {
	            int overtimeHours = hours - 40;
	            return overtimeHours * 15;
	        } else {
	            return 0;
	        }
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        for (int i = 1; i <= 5; i++) {
	            System.out.println("Enter working hours of employee " + i + ":");
	            int hours = sc.nextInt();

	            int overtimePay = calculateOvertime(hours);

	            System.out.println("Overtime pay of employee " + i + " is: Rs." + overtimePay);
	        }

	        sc.close();
	    }
}
