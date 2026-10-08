class Employee {
    int employeeId;
    String employeeName;
    double basicSalary;

    public Employee(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        return basicSalary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

class Manager extends Employee {
    String department;
    double bonus;

    public Manager(int employeeId, String employeeName, double basicSalary,
                   String department, double bonus) {
        super(employeeId, employeeName, basicSalary);
        this.department = department;
        this.bonus = bonus;
    }

    public double calculateTotalSalary() {
        return calculateSalary() + bonus;
    }

    public void displayManagerDetails() {
        displayEmployeeDetails();
        System.out.println("Department: " + department);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
}

public class InheritanceDemo1 {
    public static void main(String[] args) {
        Manager m = new Manager(101, "Alice", 50000, "IT", 10000);
        m.displayManagerDetails();
    }
}
