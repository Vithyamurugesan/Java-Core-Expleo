package generics;

class Demo<T>{
	private T t;
	//T stands for "Type"
	public void set(T t) {
		this.t=t;
	}
	public T get() {
		return t;
	}	
}
public class GenericDemo {

	public static void main(String[] args) {
		//instance of Integer type
		Demo<Integer> iObj=new Demo<Integer>();
		iObj.set(25);
		System.out.println(iObj.get());
		
		//instance of string type
		Demo<String> sObj=new Demo<String>();
		sObj.set("Demo");
		System.out.println(sObj.get());
	}

}
