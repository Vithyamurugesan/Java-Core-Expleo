package serializationanddeserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Employee implements java.io.Serializable{
	public int empId;
	public String empName;
	//Parameterized Constructor
	public Employee(int id,String name) {
		this.empId=id;
		this.empName=name;
	}
}
public class Serialization{
	public static void main(String[]args) {
		Employee object=new Employee(1, "Ram");
		String filename="file.ser";
		//Serialization
		try {
			//Saving of object in a file
			
			FileOutputStream file=new FileOutputStream(filename);
			ObjectOutputStream out=new ObjectOutputStream(file);
			
			//Method for serialization of object
			
			out.writeObject(object);
			out.close();
			file.close();
			System.out.println("Object has been serialized");
		}
		catch(IOException ex) {
			System.out.println("IOException is caught");
		}
		Employee object1=null;
		//Deserialization
		
		try {
			//Reading the object from a file
			
			FileInputStream file=new FileInputStream(filename);
			ObjectInputStream in=new ObjectInputStream(file);
			//Method for deserialization of object
			
			object1=(Employee)in.readObject();
			in.close();
			file.close();
			
			System.out.println("Object has been deserialized");
			System.out.println("Employee Id: "+object1.empId+ "\nEmployee name: "+object1.empName);	
		}
		catch(IOException ex) {
			System.out.println("IOException is caught");
		}
		catch(ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}
		
	}
	
}

