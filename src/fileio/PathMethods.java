package fileio;

import java.nio.file.Path;
import java.nio.file.Paths;
public class PathMethods {
	public static void main(String[] args) {
		Path p1 = Paths.get("E:\\Java Core Expleo\\Core\\src\\constructor");
		Path normalizedPath = p1.normalize();
		Path p2 = Paths.get("E:\\Java Core Expleo\\Core\\src\\constructor");
		System.out.println("NormalizedPaths: "+normalizedPath);
		Path subPath=p1.subpath(1,3);
		System.out.println("Sub Path: "+subPath);
		System.out.println("getFileName: "+p1.getFileName());
		System.out.println("getParent"+p1.getParent());
		System.out.println("getNameCount: "+p1.getNameCount());
		System.out.println("getRoot: "+p1.getRoot());
		System.out.println("isAbsolute: "+p1.isAbsolute());
		System.out.println("toAbsolutePath"+p1.toAbsolutePath());
		System.out.println("toURL"+p1.toUri());
		if(p1.equals(p2)) {
			System.out.println("Both are equal");
			
		}
		else {
			System.out.println("Both are not equal");
		}
	}

}
