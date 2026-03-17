package collection;
/***This example demostrates sorting using comparable and comparator*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/***This example demostrates sorting using comparable*/


//A class "Mobile" that implements comparable

class Mobiles implements Comparable<Mobiles>{
	private String name;
	private int ram;
	private int price;
	Mobiles(String name, int ram, int price) {
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
	//compare mobiles by Ram size
	public int compareTo(Mobiles o) {
		if(this.ram>o.getRam()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
}
//Class to compare Mobiles by price
class PriceCompare implements Comparator<Mobiles>{
	public int compare(Mobiles m1,Mobiles m2) {
		if(m1.getPrice()<m2.getPrice()) return -1;
		if(m1.getPrice()>m2.getPrice()) return 1;
		else return 0;
		
	}	
}
//Clas to compare mobiles by name
class NameCompare implements Comparator<Mobiles>{
	public int compare(Mobiles m1,Mobiles m2) {
		return m1.getName().compareTo(m2.getName());
	}
}


//Main class 
public class ComparatorExample {
	public static void main(String[] args) {
		List<Mobiles> mobileList=new ArrayList<>();
		mobileList.add(new Mobiles("redme",16,800));
		mobileList.add(new Mobiles("Apple",8,100));
		mobileList.add(new Mobiles("samsung",4,600));
		Collections.sort(mobileList);  //ascending order 
		//Collections.reverseOrder();      //decending order
		System.out.println("Sorted by price:");
		PriceCompare priceCompare=new PriceCompare();
		Collections.sort(mobileList,priceCompare);
		System.out.println("Mobile price after sorting: ");
		System.out.println("Name"+"\t"+"Ram"+"\t"+"Price");
		for(Mobiles mb:mobileList) {
			System.out.println(mb.getName()+"\t"+mb.getRam()+"\t"+mb.getPrice());
		}
		

	}

}
