package filehandlinglevel3;

import java.io.*;
import java.util.*;

public class VaccinationTracker {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. First Dose");
            System.out.println("2. Second Dose");
            System.out.println("3. Display All Lists");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {

                case 1:
                    System.out.print("Enter name: ");
                    String name1 = sc.nextLine();
                    moveRecord("filehandlinglevel3/people.txt", "filehandlinglevel3/dose1.txt", name1);
                    break;

                case 2:
                    System.out.print("Enter name: ");
                    String name2 = sc.nextLine();
                    moveRecord("dose1.txt", "dose2.txt", name2);
                    break;

                case 3:
                    display("people.txt", "People List");
                    display("dose1.txt", "1st Dose");
                    display("dose2.txt", "2nd Dose");
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }

    // Move record from one file to another
    static void moveRecord(String sourceFile, String targetFile, String name) throws Exception {

        File source = new File(sourceFile);
        File temp = new File("temp.txt");

        BufferedReader br = new BufferedReader(new FileReader(source));
        BufferedWriter bwTemp = new BufferedWriter(new FileWriter(temp));
        BufferedWriter bwTarget = new BufferedWriter(new FileWriter(targetFile, true));

        String line;
        boolean found = false;

        while ((line = br.readLine()) != null) {

            if (line.startsWith(name)) {
                bwTarget.write(line);
                bwTarget.newLine();
                found = true;
            } else {
                bwTemp.write(line);
                bwTemp.newLine();
            }
        }

        br.close();
        bwTemp.close();
        bwTarget.close();

        source.delete();
        temp.renameTo(source);

        if (found)
            System.out.println("Record moved successfully");
        else
            System.out.println("Person not found");
    }

    // Display file
    static void display(String fileName, String title) throws Exception {

        System.out.println("\n" + title + ":");

        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}