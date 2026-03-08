package constructor;

public class ParameterizedConstructor {
	int theatreid;
	String theatreName;
	String theatrelocation;
	ParameterizedConstructor(int id,String tname,String tlocation) {
		theatreid=id;
		theatreName=tname;
		theatrelocation=tlocation;
	}
	public void getdetials() {
		System.out.println("Theatre Details");
		System.out.println("Theatre Id "+theatreid);
		System.out.println("Theatre Name "+theatreName);
		System.out.println("Theatre Location "+theatrelocation);	
	}
	public static void main(String[]args) {
		ParameterizedConstructor t=new ParameterizedConstructor(123,"INOX","Kochi");
		t.getdetials();	
	}
}
