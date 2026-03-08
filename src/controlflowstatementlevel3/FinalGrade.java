package controlflowstatementlevel3;
import java.util.Scanner;

public class FinalGrade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double exercise, exam;
        double finalGrade;
        double total = 0;
        int count = 0;

        while (true) {

            System.out.print("Enter Exercise Grade (-1 to stop): ");
            exercise = sc.nextDouble();

            System.out.print("Enter Exam Grade (-1 to stop): ");
            exam = sc.nextDouble();

            // Stop condition
            if (exercise == -1 || exam == -1) {
                break;
            }

            // Validate range
            if (exercise < 0 || exercise > 10 || exam < 0 || exam > 10) {
                System.out.println("Invalid grade! Grades must be between 0 and 10.");
                continue;
            }

            // Calculate final grade
            if (exercise >= 5 && exam >= 5) {
                finalGrade = (0.3 * exercise) + (0.7 * exam);
            } else {
                finalGrade = Math.min(exercise, exam);
            }

            System.out.println("Final Grade: " + finalGrade);

            total += finalGrade;
            count++;
        }

        // Average calculation
        if (count > 0) {
            double average = total / count;
            System.out.println("Average Grade of all students: " + average);
        } else {
            System.out.println("No student grades entered.");
        }

        sc.close();
    }
}
