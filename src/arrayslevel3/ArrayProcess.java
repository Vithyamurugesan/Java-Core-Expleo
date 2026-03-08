package arrayslevel3;

import java.util.Scanner;

public class ArrayProcess {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int size = 0;
        int num;

        // Read numbers until negative number
        while (true) {
            num = sc.nextInt();

            if (num < 0)
                break;

            arr[size] = num;
            size++;
        }

        // Process array
        for (int i = 0; i < size; i++) {

            if (arr[i] % 7 == 0 && arr[i] % 8 == 0) {
                arr[i] = -6;
            }
            else if (arr[i] % 7 == 0) {
                arr[i] = -2;
            }
            else if (arr[i] % 8 == 0) {
                arr[i] = -9;
            }
        }

        // Print array
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}