import java.util.Scanner;

public class StudentGradeCalculation {
    static char calculateGrade(int marks) {
        if (marks >= 90 && marks <= 100) {
            return 'A';
            
        }else if (marks >= 75 && marks <= 89) {
            return 'B';
            
        } else if (marks >= 60 && marks <= 74) {
            return 'C';
            
        } else if (marks >= 50 && marks <= 59) {
            return 'D';
            
        } else if (marks >= 0 && marks < 50) {
            return 'F';
            
        } else {
            return 'X';
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        char grade = calculateGrade(marks);

        if (grade == 'X') {
            System.out.println("Invalid marks");
        } else {
            System.out.println("Grade: " + grade);
        }

        sc.close();
    }
}
