import java.util.Scanner;

public class Employee {
    int employeeId;
    String employeeName;
    double basicSalary, hra, da, grossSalary;

    void read() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        employeeId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        employeeName = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();

        System.out.print("Enter HRA: ");
        hra = sc.nextDouble();

        System.out.print("Enter DA: ");
        da = sc.nextDouble();
    }

    void calculateSalary() {
        grossSalary = basicSalary + hra + da;
    }

    void display() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("HRA           : " + hra);
        System.out.println("DA            : " + da);
        System.out.println("Gross Salary  : " + grossSalary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.read();
        emp.calculateSalary();
        emp.display();
    }
}
