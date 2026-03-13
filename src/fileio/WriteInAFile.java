package fileio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class WriteInAFile {

    public static void main(String[] args) throws IOException {

        Path p = Paths.get("C:\\Users\\vithy\\OneDrive\\Documents\\CreateFile.txt");

        if(Files.isWritable(p)) {
            String content = "Hello this is written using Java NIO";
            Files.write(p, content.getBytes());
            System.out.println("Content written successfully");
        } 
        else {
            System.out.println("File is not writable");
        }
    }
}
