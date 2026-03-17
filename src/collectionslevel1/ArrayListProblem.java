package collectionslevel1;

import java.util.List;
import java.util.ArrayList;

public class ArrayListProblem {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Anu");
        list.add("Pragathi");
        list.add("Charlie");
        list.add("Shiny");

        for (String m : list) {
            if (m.length() > 5) {
                System.out.println(m);
            }
        }
    }
}
