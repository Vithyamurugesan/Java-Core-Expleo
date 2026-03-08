//Illustration of Static Inner Classes
package innerclasses;

class Person{
	int age=21;static int weight=45;
	static class Gender{
		void nonStaticDisplay() {
			System.out.println("In NonStatic Display Method");
			System.out.println("Weight Value:"+weight);//outer class static variable accessed in non static method
		}
	  static void staticDisplay() {
		  System.out.println("In Static Display Method");
		  System.out.println("Weight Value:"+weight);//outer class static variable accessed in static method
	  }  
	}
	Gender gender=new Gender();
}


public class StaticInnerClass {

	public static void main(String[] args) {
		
		Person person=new Person();
		person.gender.nonStaticDisplay();//Inner class NonStatic Method
		Person.Gender.staticDisplay();//Inner class Static Method
	}
}
