package classpackage;

public class Theatre {
	int theatreid=4523;
	String theatrename="INOX";
	String theatrelocation="Kochi";
	public void displayTheatre() {
		System.out.println("Theatre ID: "+theatreid);
		System.out.println("Theatre Name: "+theatrename);
		System.out.println("Theatre Location: "+theatrelocation);
		
	}
	public static void main(String[]args) {
	Theatre objTheatre=new Theatre();
	objTheatre.displayTheatre();
	}

}
