package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteIOStreamExample {

	public static void main(String[] args) {
		byte [] b=new byte[128];
		try(FileInputStream fis=new FileInputStream("E:\\Java Core Expleo\\Core\\src\\stream\\input1.txt");
			FileOutputStream fos=new FileOutputStream("E:\\Java Core Expleo\\Core\\src\\stream\\output1.txt")) {
			System.out.println("Bytes Available:"+fis.available());
			int count=0;int read=0;
			while((read=fis.read(b))!=-1) {
				fos.write(b);
				count+=read;
			}
			System.out.println("Total count: "+count);
		}catch(FileNotFoundException f) {
			System.out.println("File Not found"+f);
		}
		catch(IOException e) {
			System.out.println("IOException:"+e);
		}			

	}

}
