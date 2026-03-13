package generics;
//this example demostrates user defined generic methods

public class GenericMethod {
	static <T> void genericDisplay(T element) {  //A generic method example
		System.out.println(element);
		System.out.println(element.getClass().getName()+"="+element);	
	}
	public static void main(String[]args) {
		//Calling generic method with Integer argument
		genericDisplay(11);
		//Calling generic method with String argument
		genericDisplay("Test");
		//Calling generic method with float argument
		genericDisplay(1.0);
	}

}
