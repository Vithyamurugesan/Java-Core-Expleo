package generics;
//This example demostrates multiple type parameters in java generics
//We use <> to specify Parameter type

class Test<T,U,R>{
	T ob1;//An object of Type T
	U ob2;//An object of Type U
	R ob3;//An object of Type R
	Test(T ob1, U ob2, R ob3) {
		this.ob1 = ob1;         //Constructor
		this.ob2 = ob2;
		this.ob3 = ob3;
	}
	public void print() {
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob3);
	}
}
//Driver Class 
public class MultipleTypeParameter {

	public static void main(String[] args) {
		//instance of Integer type
		Test<String,Integer,Float> Obj=new Test<>("Test",15, 3.14f);
		Obj.print();
		
		
	}

}
