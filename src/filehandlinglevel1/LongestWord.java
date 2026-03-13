package filehandlinglevel1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LongestWord {
    public static void main(String[] args) throws IOException {  	
    	Path paths=Paths.get("C:\\Users\\vithy\\OneDrive\\Documents\\CreateFile.txt");
                String text = new String(Files.readString(paths));
                String words[] = text.split(" ");
                String longest = "";
                for(String w : words){
                    if(w.length() > longest.length()){
                        longest = w;
                    }
                }
                System.out.println("Longest word: " + longest);
            }
}