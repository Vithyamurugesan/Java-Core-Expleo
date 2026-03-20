package filehandlinglevel3;

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class ExpenditureManager {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        File file = new File(fileName);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Check File Exists");
            System.out.println("2. Get File Path");
            System.out.println("3. Create Soft Link");
            System.out.println("4. Check Read/Write");
            System.out.println("5. Add Expenditure");
            System.out.println("6. Move File");
            System.out.println("7. Create New Month File");
            System.out.println("8. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {

                case 1:
                    if (file.exists())
                        System.out.println("File exists");
                    else
                        System.out.println("File not found");
                    break;

                case 2:
                    System.out.println("Path: " + file.getAbsolutePath());
                    break;

                case 3:
                    createSoftLink(fileName);
                    break;

                case 4:
                    System.out.println("Readable: " + file.canRead());
                    System.out.println("Writable: " + file.canWrite());
                    break;

                case 5:
                    addExpenditure(fileName);
                    break;

                case 6:
                    moveFile(fileName);
                    break;

                case 7:
                    createNewFile();
                    break;

                case 8:
                    System.exit(0);
            }
        }
    }

    // 3. Soft Link
    static void createSoftLink(String fileName) throws Exception {
        Path target = Paths.get(fileName);
        Path link = Paths.get("shortcut_link.txt");

        Files.createSymbolicLink(link, target);
        System.out.println("Soft link created: " + link);
    }

    // 5. Add Expenditure
    static void addExpenditure(String fileName) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true));

        System.out.print("Enter date: ");
        String date = sc.nextLine();

        System.out.print("Enter description: ");
        String desc = sc.nextLine();

        System.out.print("Enter amount: ");
        int amt = sc.nextInt();
        sc.nextLine();

        bw.write(date + " " + desc + " " + amt);
        bw.newLine();
        bw.close();

        System.out.println("Added successfully");
    }

    // 6. Move File
    static void moveFile(String fileName) throws Exception {
        System.out.print("Enter destination folder path: ");
        String dest = sc.nextLine();

        Path source = Paths.get(fileName);
        Path destination = Paths.get(dest + "\\" + fileName);

        Files.move(source, destination, StandardCopyOption.REPLACE_EXISTING);

        System.out.println("File moved successfully");
    }

    // 7. Create new month file
    static void createNewFile() throws Exception {
        System.out.print("Enter new file name: ");
        String newFile = sc.nextLine();

        File f = new File(newFile);

        if (f.createNewFile())
            System.out.println("New file created");
        else
            System.out.println("File already exists");
    }
}