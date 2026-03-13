package filehandlinglevel1;

import java.io.File;

public class CheckPathExists {
	public static void main(String[]args) {
		File f=new File("C:\\Users\\vithy\\OneDrive\\Documents\\CreateFile.txt");
		if(f.exists()) {
			System.out.println("File or Directory exists");
		}
		else {
			System.out.println("File or directory are not exists");
		}

	}

}
