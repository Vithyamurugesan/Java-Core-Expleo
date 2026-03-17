package collectionslevel1;

import java.util.HashMap;
import java.util.Stack;

public class StudentStackExample {

    // Function to push names with marks > 75 into stack
    public static void pushToStack(HashMap<String, Integer> map, Stack<String> stack) {
        for (String name : map.keySet()) {
            if (map.get(name) > 75) {
                stack.push(name);
            }
        }
    }

    // Function to pop and display stack
    public static void popAndDisplay(Stack<String> stack) {
        System.out.println("Student Marks above 75 in the stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {

        // Create HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Mano", 85);
        map.put("Shan", 85);
        map.put("John", 55);
        map.put("Anu", 60);
        map.put("Aju", 90);
        map.put("Frank", 80);

        System.out.println("Student Marks in the HashMap: " + map);

        // Create Stack
        Stack<String> stack = new Stack<>();

        // Call functions
        pushToStack(map, stack);
        popAndDisplay(stack);
    }
}