package arrayslevel1;

public class AddEvenOdd {

	public static void main(String[] args) {
		int even[]=new int[5];
	    int odd[]=new int[5];
	    int oddcount=0;
	    int evencount=0;
		
		for(int i=1;i<10;i++) {
			if(i%2==0) {
				even[evencount++]=i;	
			}
			else {
				odd[oddcount++]=i;	
			}
		}
		int evensum=0,oddsum=0;
		for(int i=0;i<evencount;i++) {
			evensum+=even[i];
			System.out.print(even[i]+" ");
		}
		System.out.println();
		System.out.println("The even sum is : "+evensum);
		System.out.println();
		for(int i=0;i<oddcount;i++) {
			oddsum+=odd[i];
			System.out.print(odd[i]+" ");
		}	
		System.out.println();
		System.out.println("The odd sum is : "+oddsum);
	}

}
