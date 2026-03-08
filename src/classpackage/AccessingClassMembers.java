package classpackage;

public class AccessingClassMembers {
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
		AccessingClassMembers E1=new AccessingClassMembers();//First Object creation
		AccessingClassMembers E2=new AccessingClassMembers();//Second Object creation
		E1.setEmployee(1001, "Ram");
		E2.setEmployee(1002, "sita");
		E1.getEmployee();
		E2.getEmployee();	
	}
}
