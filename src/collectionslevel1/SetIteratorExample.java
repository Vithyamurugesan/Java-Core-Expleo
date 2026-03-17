package collectionslevel1;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class SetIteratorExample {

    public static void main(String[] args) {

        // Create Set
        Set<String> s = new HashSet<>();

        s.add("Java");
        s.add("Hello");
        s.add("Programming");
        s.add("World");

        // Iterator
        Iterator<String> it = s.iterator();

        String result = "";

        while (it.hasNext()) {
            String value = it.next();
            System.out.println("Elements in the Set : " + value);
            result = result + value + " ";
        }

        System.out.println("Concatenated result: " + result.trim());
    }
}