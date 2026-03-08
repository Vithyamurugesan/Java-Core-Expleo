package arrayslevel2;

public class FindAKey {
	    public static void main(String[] args) {

	        int[] arr = {5, 1, 1, 9, 7, 2, 6, 10};
	        int key = 7;

	        boolean found = false;

	        for(int i = 0; i < arr.length; i++) {
	            if(arr[i] == key) {
	                found = true;
	                break;
	            }
	        }

	        System.out.println(found);
	    }
}
