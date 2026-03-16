package exceptionhandlinglevel1;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

// Exception for invalid employee number
class InvalidEmpNumberException extends Exception {
    InvalidEmpNumberException(String msg) {
        super(msg);
    }
}

// Exception for invalid date
class InvalidDateOfJoinException extends Exception {
    InvalidDateOfJoinException(String msg) {
        super(msg);
    }
}

// Employee class
class Employee {

    int empCode;
    String name;
    LocalDate dob;
    LocalDate doj;

    Employee(int empCode, String name, LocalDate dob, LocalDate doj) {
        this.empCode = empCode;
        this.name = name;
        this.dob = dob;
        this.doj = doj;
    }

    void display() {
        System.out.println("Employee Code: " + empCode);
        System.out.println("Employee Name: " + name);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Date of Appointment: " + doj);

        int experience = Period.between(doj, LocalDate.now()).getYears();
        System.out.println("Years of Experience: " + experience);
    }
}

public class EmployeeTests{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Employee Code: ");
            int code = sc.nextInt();
            sc.nextLine();

            if (code <= 0) {
                throw new InvalidEmpNumberException("Employee code must be positive");
            }

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter DOB (YYYY-MM-DD): ");
            LocalDate dob = LocalDate.parse(sc.nextLine());

            System.out.print("Enter Date of Appointment (YYYY-MM-DD): ");
            LocalDate doj = LocalDate.parse(sc.nextLine());

            if (!dob.isBefore(doj)) {
                throw new InvalidDateOfJoinException("DOB must be before Date of Appointment");
            }

            Employee emp = new Employee(code, name, dob, doj);

            System.out.println("\nEmployee Details");
            emp.display();

        } 
        catch (InvalidEmpNumberException | InvalidDateOfJoinException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
