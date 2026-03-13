package stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class CharacterIOStreamExample {

	public static void main(String[] args) {
		char [] b=new char[128];
		try(FileReader fr=new FileReader(args[0]);
				FileWriter fw=new FileWriter(args[1])){
			int count=0;
			int read=0;
			while((read=fr.read(b))!=-1) {
				fw.write(b);
				System.out.println(Arrays.toString(b));
				count+=read;
			}
			System.out.println("Total count: "+count+ " characters");
		}
		catch(FileNotFoundException f) {
			System.out.println("File "+args[0]+"not found");
		}
		catch(IOException e) {
			System.out.println("IOException: "+e);		
		}

	}

}
