package collection;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo1 {

	public static void main(String[] args) {
		ArrayList<Double> Arr = new ArrayList<>();
        Arr.add(100.5);
        Arr.add(200.75);
        Arr.add(300.25);
        Arr.add(400.0);
		System.out.println("Content of arrayList using tryAdvance");
		Spliterator<Double> sitr=Arr.spliterator();
		while(sitr.tryAdvance((n)->System.out.println(n+" ")));
		System.out.println();
		System.out.println("Contents of ArrayList using for each remaining");
		sitr=Arr.spliterator();
		sitr.forEachRemaining((n)->System.out.println(n+" "));
		System.out.println();
		System.out.println("Size of ArrayList after insertion is "+Arr.size());

	}

}