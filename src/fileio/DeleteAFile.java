package fileio;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

//Java program to demonstrate to delete a file
class DeleteAFile{
	public static void main(String args[]){
		//File to delete
	Path path= Paths.get("C:\\Users\\vithy\\OneDrive\\Documents\\CreateFile.txt"); 
	//Directory to delete
	//Path path= Paths.get("F:\\Personal\\Training\\Example\\Sample"); 
	try{
		Files.deleteIfExists(path);
	}
	catch(NoSuchFileException e){
		System.out.println("No such file/directory exists");
	}
	catch(DirectoryNotEmptyException e){
		System.out.println("Directory is not empty.");
	}
	catch(IOException e){
		System.out.println("Invalid permissions.");
	}
	System.out.println("Deletion successful."); 
	}
}
	
