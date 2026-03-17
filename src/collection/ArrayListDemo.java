package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<>();
		System.out.println("Initial size of the Array List is: "+arr.size());
		arr.add("C");
		arr.add("A");
		arr.add("E");
		arr.add("B");
		arr.add("D");
		arr.add("F");
		arr.add(2,"G");
		System.out.println("After inserting the size of array list is : "+arr.size());
		System.out.println("Array list elements: "+arr);
		arr.remove(3);
		arr.remove("D");
		System.out.println("After remove size of array list is: "+arr.size());
		System.out.println("Array list elements: "+arr);
		//create a string array to store variable 
		//convert array list to array
		String[] arrArray = arr.toArray(new String[arr.size()]);
		System.out.print("Store elements in array: ");
		for(int i=0; i<arr.size();i++) {
			System.out.print(arrArray[i] +" ");
		}
        
	}

}