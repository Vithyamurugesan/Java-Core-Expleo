package filehandlinglevel1;

import java.io.File;

public class GetSpecificFiles {
	public static void main(String []args) {
		File folder = new File("C:\\Users\\vithy\\OneDrive\\Documents");
        File[] files = folder.listFiles();
        for(File f : files) {
            if(f.getName().endsWith(".txt")) {
                System.out.println(f.getName());
            }
        }
	}

}
