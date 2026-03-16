package filehandlinglevel2;

import java.io.*;
import java.util.*;

public class FileSearch {
    public static void main(String[] args) throws Exception {

        String option = "";
        String search;
        String file;

        if(args.length == 2) {
            search = args[0];
            file = args[1];
        }
        else {
            option = args[0];
            search = args[1];
            file = args[2];
        }

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line;
        int count = 0;

        while((line = br.readLine()) != null) {

            if(option.equals("-v")) {
                if(!line.contains(search))
                    System.out.println(line);
            }
            else if(option.equals("-c")) {
                if(line.contains(search))
                    count++;
            }
            else {
                if(line.contains(search))
                    System.out.println(line);
            }
        }

        if(option.equals("-c")) {
            System.out.println("Count: " + count);
        }

        br.close();
    }
}