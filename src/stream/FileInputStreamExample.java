package stream;

import java.io.FileInputStream;

/*** This example demonstrates the fileinputstream*/
public class FileInputStreamExample {

	public static void main(String[] args) {
		try {
			FileInputStream input=new FileInputStream("E:\\Java Core Expleo\\Core\\src\\stream\\input.txt");
			System.out.println("Data in the file: ");
			int i=input.read();//Reads the first byte
			while(i!=-1) {
				System.out.print((char)i);
				i=input.read();//Reads next byte from the file
			}
			input.close();//close the file stream
		}
		catch(Exception e) {
			System.out.println(e);//exception details
		}

	}

}
