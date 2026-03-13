package filehandlinglevel1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadAFileLineByLine {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new FileReader("E:\\Java Core Expleo\\Core\\src\\"));

        String line;   // variable to store each line

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}