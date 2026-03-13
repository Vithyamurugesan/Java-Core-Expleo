package stream;

import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		String data="Welcome to Java Portal!!!Have a Happy Learning";
		try {
			FileOutputStream output=new FileOutputStream("E:\\Java Core Expleo\\Core\\src\\stream\\output.txt");
			byte[] array=data.getBytes();
			//Write byte to the file
			output.write(array);
			output.close();	
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
