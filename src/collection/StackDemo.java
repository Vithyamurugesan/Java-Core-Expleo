package collection;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> stk=new Stack<String>();
		System.out.println("size of the stack is: "+stk.size());
		stk.push("A");
		stk.push("B");
		stk.push("C");
		stk.push("D");
		//arraylist-add
		stk.add("E");
		System.out.println("Elements in the stack: "+stk);
		System.out.println("size of the stack is: "+stk.size());
		stk.pop();
		//arraylist-remove also use
		stk.remove("B");
		System.out.println("Elements in the stack: "+stk);
		System.out.println("size of the stack is: "+stk.size());
		

	}

}