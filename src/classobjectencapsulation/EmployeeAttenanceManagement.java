package classobjectencapsulation;

import java.time.LocalTime;

//Attendance Class
class Attendance {

 // Private attributes
 private int empId;
 private LocalTime checkInTime;
 private LocalTime checkOutTime;
 private boolean isCheckedIn = false;
 private boolean isCheckedOut = false;

 // Constructor
 public Attendance(int empId) {
     this.empId = empId;
 }

 // Mark check-in
 public void markCheckIn() {
     if (!isCheckedIn) {
         checkInTime = LocalTime.now();
         isCheckedIn = true;
         System.out.println("Check-in recorded at " + checkInTime);
     } else {
         System.out.println("Employee already checked in today.");
     }
 }

 // Mark check-out
 public void markCheckOut() {
     if (!isCheckedIn) {
         System.out.println("Cannot check-out before check-in.");
     } 
     else if (isCheckedOut) {
         System.out.println("Employee already checked out today.");
     } 
     else {
         checkOutTime = LocalTime.now();
         isCheckedOut = true;
         System.out.println("Check-out recorded at " + checkOutTime);
     }
 }

 // Attendance summary
 public String getAttendanceDetails() {
     return "Employee ID: " + empId +
            "\nCheck-in Time: " + checkInTime +
            "\nCheck-out Time: " + checkOutTime;
 }
}


//Employee Class
class Employee {

 // Private attributes
 private int empId;
 private String empName;

 // Constructor
 public Employee(int empId, String empName) {
     this.empId=empId;
     this.empName = empName;
 }

 // Mark check-in
 public void markCheckIn(Attendance attendance) {
     attendance.markCheckIn();
 }

 // Mark check-out
 public void markCheckOut(Attendance attendance) {
     attendance.markCheckOut();
 }

 public String getName() {
     return empName;
 }

 public int getEmpId() {
	return empId;
 }

 public void setEmpId(int empId) {
	this.empId = empId;
 }
}


//Main Class
public class EmployeeAttenanceManagement {
 public static void main(String[] args) {

     // Create employee
     Employee emp1 = new Employee(101, "Vithya");

     // Create attendance record
     Attendance attendance = new Attendance(101);

     // Check-in
     emp1.markCheckIn(attendance);

     // Check-out
     emp1.markCheckOut(attendance);

     // Display attendance details
     System.out.println("\nAttendance Summary:");
     System.out.println(attendance.getAttendanceDetails());
 }
}

