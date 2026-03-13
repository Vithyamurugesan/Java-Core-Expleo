package fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class SoftLink {

	public static void main(String[] args) {
		Path existingFilePath=Paths.get("C:\\Users\\vithy\\OneDrive\\Documents\\DoublyLinkedList");
		Path symLinkPath=Paths.get("");
		try {
			Files.createSymbolicLink(symLinkPath, existingFilePath);
			
		}
		catch(IOException x){
			System.err.println(x);
			
		}
		catch(UnsupportedOperationException x) {
			//Some files systems do not support symbolic links
			System.err.println(x);
		}
		

	}

}
