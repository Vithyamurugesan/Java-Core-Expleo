package classpackage;

public class ObjectCreationExample {
	int theatreid=4523;
	String theatrename="INOX";
	String theatrelocation="Kochi";
	public void displayTheatre() {
		System.out.println("Theatre ID: "+theatreid);
		System.out.println("Theatre Name: "+theatrename);
		System.out.println("Theatre Location: "+theatrelocation);
		
	}
	public static void main(String[]args) {
	Theatre T1=new Theatre();//Declare and instantiate
	
	Theatre T2;//Declare the reference
	T2=new Theatre();//Then instantiate
	System.out.println("-------Using the object T1------------");
	T1.displayTheatre();
	System.out.println();
	System.out.println("-------Using the object T2------------");
	T2.displayTheatre();
	
	
	}
}
