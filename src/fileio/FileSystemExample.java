package fileio;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileSystemExample {

	public static void main(String[] args) {
		FileSystem fs=FileSystems.getDefault();
		Path p1=fs.getPath("E:\\Java Core Expleo\\Core\\src\\constructor");
	    System.out.println(p1);
	}

}
