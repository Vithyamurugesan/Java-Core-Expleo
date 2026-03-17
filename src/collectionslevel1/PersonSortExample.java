package collectionslevel1;

import java.util.*;

class Person {
    String firstName;
    String lastName;

    // Constructor
    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

public class PersonSortExample {

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person("Priscilla", "Wagner"));
        list.add(new Person("Tom", "Parker"));
        list.add(new Person("Elvis", "Presley"));

        // Sort using Comparator (by first name)
        Collections.sort(list, new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return p1.firstName.compareTo(p2.firstName);
            }
        });

        // Display result
        System.out.println("Sorted people by first name:");
        for (Person p : list) {
            System.out.println(p.firstName + " " + p.lastName);
        }
    }
}