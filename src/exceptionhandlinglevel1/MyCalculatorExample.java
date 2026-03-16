package exceptionhandlinglevel1;
import java.util.Scanner;

class MyCalculator {

    long power(int n, int p) throws Exception {

        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        }

        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        }

        return (long) Math.pow(n, p);
    }
}

public class MyCalculatorExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MyCalculator obj = new MyCalculator();

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int p = sc.nextInt();

            try {
                System.out.println(obj.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        sc.close();
    }
}