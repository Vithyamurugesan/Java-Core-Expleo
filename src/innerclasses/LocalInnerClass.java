//Illustration of Local Inner Classes
package innerclasses;
class OutClass{
	int value=56;
	public void outerClassMethod() {
		System.out.println("Inside the method of outer class");
		class InClass{
			public void innerClassMethod() {
				System.out.println("Inside the method of inner class");
				System.out.println("value "+value);	
			}
		}
		InClass inner=new InClass();
		inner.innerClassMethod();
	}
	
}

public class LocalInnerClass {
	public static void main(String[] args) {
		OutClass outer=new OutClass();
		outer.outerClassMethod() ;	
	}
}
