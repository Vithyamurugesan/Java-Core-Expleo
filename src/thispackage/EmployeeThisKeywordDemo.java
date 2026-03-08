package thispackage;
    class EmployeeDemo {
	int empid;
	String empname;
	double empsalary;
	//1.Using "this" to refer to instance variable.
	EmployeeDemo(int empid,String empname,double empsalary){
		this.empid=empid;
		this.empname=empname;
		this.empsalary=empsalary;
		System.out.println("Employye record created successfully");
	}
	
	//2.Using "this()" to call another constructor(Constructor Chaining)
	//Calling the parameterized constructor from the default constructor 
	
	EmployeeDemo(){
		this(101, "Default Employee", 30000);
		System.out.println("Default constructor called-initialized with default data.\n");
	}
	
	//3.Using "this" to call another method in the same class
	void registerEmployee() {
		System.out.println("Registeration Employee..");
		this.displayDetails();//calls another method
	}
	void displayDetails() {
		System.out.println("Employee ID : "+empid);
		System.out.println("Employee Name : "+empname);
		System.out.println("Employee Salary : "+empsalary);	
	}
	
	//4.Using"this" to pass current object as an argument
	void sendForProcessing() {
		HRDepartment hr=new HRDepartment();
		hr.processEmployee(this);//Pass current object
	}
	
	//5.Using "this to return current object(Method Chaining)
	EmployeeDemo updateSalary(double hikepercentage) {
		this.empsalary=empsalary+(empsalary*hikepercentage/100);
		return this;//Allows chaining
	}
	EmployeeDemo updateName(String newname) {
		this.empname=newname;
		return this;//Allows chaining 	
	}
}
//Helper class representing another department
class HRDepartment{
	void processEmployee(EmployeeDemo e) {
		System.out.println("HR Department Processing Employee..");
		System.out.println("Processed Employee:"+e.empname+"with salary"+e.empsalary+"\n");
	}
}
	public class EmployeeThisKeywordDemo{
		public static void main(String[]args) {
			//Calls default constructor -> internally calls parameterized constructor
			EmployeeDemo emp=new EmployeeDemo();
			//1 and 2 demostrated through constructor chaining
			emp.registerEmployee();
			emp.sendForProcessing();
			
			System.out.println("---Updating Employee Details---");
			emp.updateName("Subhan").updateSalary(15.5).displayDetails();
			
			emp.sendForProcessing();
		}
	}