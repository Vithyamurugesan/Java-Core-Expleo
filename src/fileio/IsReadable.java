package fileio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IsReadable {


	public static void main(String[] args) {
		Path p=Paths.get("C:\\Users\\vithy\\OneDrive\\Documents\\DoublyLinkedList.txt");
		Boolean result=Files.isReadable(p);
		System.out.println(result);
	
	}
}
