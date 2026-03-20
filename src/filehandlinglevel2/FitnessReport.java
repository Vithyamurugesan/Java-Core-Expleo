package filehandlinglevel2;

import java.io.*;

public class FitnessReport {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("E:\\Java Core Expleo\\Core\\src\\filehandlinglevel2\\fitness.txt"));

        String line;

        System.out.println("Date\t\tSugar Level\tStatus");

        while ((line = br.readLine()) != null) {

            String[] data = line.split(" ");

            String date = data[0];
            int sugar = Integer.parseInt(data[1]);

            String status;

            // Condition
            if (sugar >= 90 && sugar <= 110) {
                status = "Normal";
            } else {
                status = "Not Normal";
            }

            System.out.println(date + "\t" + sugar + "\t\t" + status);
        }

        br.close();
    }
}