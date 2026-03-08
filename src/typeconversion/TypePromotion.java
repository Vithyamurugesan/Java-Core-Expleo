package typeconversion;

public class TypePromotion {
		public static void main(String[]args) {
			byte b=42;
			char c='a';
			short s=1024;
			int i=50000;
			float f=5.67f;
			double d=.1234;
			double result=(f*b)+(i/c)-(d*s); //promote into double
			System.out.println("Reuslt="+result);
		}
}