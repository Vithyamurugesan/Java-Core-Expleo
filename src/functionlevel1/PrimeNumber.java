package functionlevel1;

public class PrimeNumber {
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
		public static void main(String[]args) {
			System.out.println("Print the prime numbers between the (1-100)");
			for(int i=1;i<=100;i++) {
				if(isPrime(i)) {           //calling the method
					System.out.print(i+" ");
				}
			}
		}
}
	