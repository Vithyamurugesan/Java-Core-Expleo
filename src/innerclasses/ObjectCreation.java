////Illustration of Regular Inner Classes
package innerclasses;

class OuterClass{
	int age=18;
	public void checkAge() {
		System.out.println("In CheckAge() Method call");
	}
	class InnerClass{
		public void show() {
			System.out.println("In show() Method call of inner class");
		}
	}
}
public class ObjectCreation {
	public static void main(String[]args) {
		OuterClass outer=new OuterClass();
		System.out.println("OuterClass.Age:"+outer.age);//outer class field member
		System.out.println("OuterClass.checkAge():");
		outer.checkAge();
		OuterClass.InnerClass inner=outer.new InnerClass();//object created for Inner class
	    System.out.println("Inner class method call");
	    inner.show();
	    
	    
	}
}
	

