package assertion;

public class Assertion {

	    public static void main(String[] args) {
	        int age = 16;
	        
	        // Assertion: We assume the user's age should be 18 or above.
	        // If this condition is false, an AssertionError is thrown.
	        assert age >= 18 : "Age must be 18 or above for voting!";
	        
	        System.out.println("User is allowed to vote.");
	    }
	}