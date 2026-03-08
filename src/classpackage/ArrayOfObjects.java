package classpackage;
public class ArrayOfObjects {
	int empid;
	String empname;
	void setEmployee(int empid,String empname) {
		this.empid=empid;
		this.empname=empname;
	}
	void getEmployee() {
		System.out.println("The employee ID :"+empid);
		System.out.println("The employee Name :"+empname);
	}
	public static void main(String[]args) {
		ArrayOfObjects E1[]=new ArrayOfObjects[2];
		for(int i=0;i<E1.length;i++) {
			E1[i]=new ArrayOfObjects();
		}
		E1[0].setEmployee(1001, "Ram");
		E1[1].setEmployee(1002, "Sita");
		for(int i=0;i<E1.length;i++) {
			E1[i].getEmployee();
		}	
	}
}
