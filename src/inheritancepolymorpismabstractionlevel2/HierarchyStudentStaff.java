package inheritancepolymorpismabstractionlevel2;

import java.util.Scanner;
//Base class Person
class Person{
	private String name;
	private String address;
	Person(String name,String address){
		this.name=name;
		this.address=address;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public String toString() {
		return "Person["+name+","+address+"]";
	}
}
//Derived class Student
class Student extends Person{
	String program;
	int year;
	double fee;
	Student(String name,String address,String program,int year,double fee){
		super(name,address);
		this.program=program;
		this.year=year;
		this.fee=fee;	
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program=program;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year=year;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee=fee;
	}
	public String toString() {
		return "Student[Person[" + super.toString() +"],"
				+ "program= "+program+",year= "+year+", fee=" + fee + "]";
	}	
}
//Derived class Staff
class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public double getPay() {
        return pay;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String toString() {
        return "Staff[" + super.toString() +
                ", school=" + school +
                ", pay=" + pay + "]";
    }
}

//Main Class
public class HierarchyStudentStaff {
	public static void main(String[]args) {
		  Scanner sc = new Scanner(System.in);

	        // Student Input
	        System.out.println("Enter Student Name:");
	        String sname = sc.nextLine();

	        System.out.println("Enter Student Address:");
	        String saddress = sc.nextLine();

	        System.out.println("Enter Program:");
	        String program = sc.nextLine();

	        System.out.println("Enter Year:");
	        int year = sc.nextInt();

	        System.out.println("Enter Fee:");
	        double fee = sc.nextDouble();
	        sc.nextLine();
	        Student s = new Student(sname, saddress, program, year, fee);

	        // Staff Input
	        System.out.println("Enter Staff Name:");
	        String stname = sc.nextLine();

	        System.out.println("Enter Staff Address:");
	        String staddress = sc.nextLine();

	        System.out.println("Enter School:");
	        String school = sc.nextLine();

	        System.out.println("Enter Pay:");
	        double pay = sc.nextDouble();

	        Staff st = new Staff(stname, staddress, school, pay);

	        // Display Details
	        System.out.println("\nStudent Details:");
	        System.out.println(s);

	        System.out.println("\nStaff Details:");
	        System.out.println(st);   
	        sc.close();
	}
}
