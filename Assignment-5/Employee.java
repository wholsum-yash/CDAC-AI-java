import java.util.Scanner;

class Employee {
    private int employeeId;
    private String employeeName;
    private double basicSalary;
    private double hra;
    private double da;
    private double grossSalary;

    private static int employeeCount = 0;
    private static final String COMPANY_NAME = "Tech Solutions Pvt. Ltd.";

    public Employee(Scanner sc) {
        read(sc);
        employeeCount++;
    }

    public void read(Scanner sc) {
        System.out.print("Employee ID: ");
        employeeId = sc.nextInt();
        sc.nextLine();

        System.out.print("Employee Name: ");
        employeeName = sc.nextLine();

        System.out.print("Basic Salary: ");
        basicSalary = sc.nextDouble();

        System.out.print("HRA: ");
        hra = sc.nextDouble();

        System.out.print("DA: ");
        da = sc.nextDouble();
        sc.nextLine();
    }

    public void calculateSalary() {
        grossSalary = basicSalary + hra + da;
    }

    public void display() {
        System.out.println("Company: " + COMPANY_NAME);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.printf("Basic Salary: %.2f%n", basicSalary);
        System.out.printf("HRA: %.2f%n", hra);
        System.out.printf("DA: %.2f%n", da);
        System.out.printf("Gross Salary: %.2f%n", grossSalary);
        System.out.println("-----------------------------");
    }

    public static void displayEmployeeCount() {
        System.out.println("Total employees: " + employeeCount);
    }
}

public class EmployeeSalaryDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            employees[i] = new Employee(sc);
            employees[i].calculateSalary();
        }

        System.out.println("\n----- Employee Salary Details -----");
        for (Employee e : employees) {
            e.display();
        }

        Employee.displayEmployeeCount();
        sc.close();
    }
}
