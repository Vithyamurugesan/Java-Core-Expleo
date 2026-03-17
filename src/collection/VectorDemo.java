package collection;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> v= new Vector<String>();
		System.out.println("Size of the vector is: "+v.size());
		System.out.println("Capacity of vector: "+v.capacity());
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		System.out.println("Elements in the vector: "+v);
		System.out.println("Size of the vector: "+v.size());
		System.out.println("Capacity of vector after add elements: "+v.capacity());

	}

}