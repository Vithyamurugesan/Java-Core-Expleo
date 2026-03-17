package collection;


import java.util.ArrayList;
import java.util.Collections;

/***This example demostrates sorting using comparable*/


//A class "Mobile" that implements comparable

class Mobile implements Comparable<Mobile>{
	private String name;
	private int ram;
	private int price;
	Mobile(String name, int ram, int price) {
		super();
		this.name = name;
		this.ram = ram;
		this.price = price;
	}
	String getName() {
		return name;
	}
	int getRam() {
		return ram;
	}
	int getPrice() {
		return price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//compare the current object with the specified object
	public int compareTo(Mobile o) {
		if(this.ram>o.getRam()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
}

//Main class 
public class ComparableExample {

	public static void main(String[] args) {
		java.util.List<Mobile> mobilelist=new ArrayList<>();
		mobilelist.add(new Mobile("redme",16,800));
		mobilelist.add(new Mobile("Apple",8,100));
		mobilelist.add(new Mobile("samsung",4,600));
		//Collections.sort(mobilelist);  //ascending order 
		Collections.reverseOrder();      //decending order
		System.out.println("Mobile after sorting :");
		System.out.println("Name"+"\t"+"Ram"+"\t"+"Price");
		for(Mobile mb:mobilelist) {
			System.out.println(mb.getName()+"\t"+mb.getRam()+"\t"+mb.getPrice());
		}
		

	}

}
