package fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		Path path=Paths.get("C:\\Users\\vithy\\OneDrive\\Documents\\CreateFile.txt");
		Path p=Files.createFile(path);//creates file at specified location
		System.out.println(p);
	}
}
