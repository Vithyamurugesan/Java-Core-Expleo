package generics;
//This example demostrate bouunded type

public class BoundedType {
	//A generic method with bounded type
		static<T extends Number> T genericDisplay(T one, T two) {
			return (T)(Integer)(one.intValue()+ two.intValue());
		}

		public static void main(String[] args) {
			System.out.println(genericDisplay(11, 5));
			//System.out.println(genericDisplay("Generics", null));


		}

}
