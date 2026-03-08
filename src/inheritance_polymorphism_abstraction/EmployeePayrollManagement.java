package inheritance_polymorphism_abstraction;
// Base Class
class Employee {

    protected String empId;
    protected String empName;
    protected double baseSalary;

    // Constructor
    public Employee(String empId, String empName, double baseSalary) {
        this.empId = empId;
        this.empName = empName;
        this.baseSalary = baseSalary;
    }

    // Getter methods
    public String getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    // Method to calculate salary (to be overridden)
    public double calculateSalary() {
        return baseSalary;
    }

    // Display employee details
    public String toString() {
        return "Employee ID: " + empId +
               ", Name: " + empName +
               ", Salary: " + calculateSalary();
    }
}


// Permanent Employee Class
class PermanentEmployee extends Employee {

    private double bonus;

    public PermanentEmployee(String empId, String empName, double baseSalary, double bonus) {
        super(empId, empName, baseSalary);
        this.bonus = bonus;
    }

    // Override salary calculation
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}


// Contract Employee Class
class ContractEmployee extends Employee {

    private double taxRate;
    private double serviceCharge;

    public ContractEmployee(String empId, String empName, double baseSalary,
                            double taxRate, double serviceCharge) {

        super(empId, empName, baseSalary);
        this.taxRate = taxRate;
        this.serviceCharge = serviceCharge;
    }

    // Override salary calculation
    public double calculateSalary() {
        return baseSalary - (baseSalary * taxRate) - serviceCharge;
    }
}


// Intern Class
class Intern extends Employee {

    private double stipend;

    public Intern(String empId, String empName, double stipend) {
        super(empId, empName, 0);
        this.stipend = stipend;
    }

    // Override salary calculation
    public double calculateSalary() {
        return stipend;
    }
}


// Main Class
public class EmployeePayrollManagement {

    public static void main(String[] args) {

        // Polymorphism
        Employee e1 = new PermanentEmployee("E101", "Vithya", 50000, 5000);
        Employee e2 = new ContractEmployee("E102", "Ravi", 40000, 0.10, 2000);
        Employee e3 = new Intern("E103", "Anu", 15000);

        // Display employee details
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}