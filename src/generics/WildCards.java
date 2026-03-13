package generics;
//This example demostrates Upper bounded wildcard
import java.util.ArrayList;
import java.util.List;

public class WildCards {

	public static void main(String[] args) {
		List<Integer> ints=new ArrayList<>();
		ints.add(3);
		ints.add(5);
		ints.add(10);
		double sum=sum(ints);
		System.out.println("Sum of ints="+sum);
		
	}
	public static double sum(List<? extends Number>list) {
		double sum=0;
		for(Number n:list) {
     		sum+=n.doubleValue();	
		}
		return sum;
	}
}
