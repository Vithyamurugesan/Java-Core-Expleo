package fileio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSubPath {

	public static void main(String[] args) {
		Path p1 = Paths.get("E:\\Java Core Expleo\\Core\\src\\constructor");
		Path p2 = p1.subpath(1,3);
		System.out.println(p2);
	}

}
