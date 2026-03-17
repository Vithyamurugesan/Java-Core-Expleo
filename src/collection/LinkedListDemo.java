package collection;



import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		//creating a linked list 
		LinkedList<String> list=new LinkedList<String>();
		//displaying the initial size
		System.out.println("Size at the begining: "+list.size());
		//add element
		list.add("Java");
		list.add("C++");
		list.add("Javascript");
		list.addFirst("C#");
		list.addLast("Kotlin");
		list.add(2,"Python");
		//display the linked list
		System.out.println("Original linked list elements: "+list);
		System.out.println("Size of linked list after addition: "+list.size());
		//remove element
		list.remove("C++");
		System.out.println("new linked list elements: "+list);
		//remove element at index 2
		list.remove(1);
		//display the new linked list  
		System.out.println("new linked list elements: "+list);
		

	}

}