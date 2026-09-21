class Employee {

    private int employeeId;
    private String employeeName;
    private double salary;

    // Parameterized constructor
    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    // Getters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void displayEmployee() {
        System.out.println("Employee ID = " + employeeId);
        System.out.println("Employee Name = " + employeeName);
        System.out.println("Salary = " + salary);
    }
}

public class PrivateAccessMain {
    public static void main(String[] args) {

        Employee employee =
            new Employee(101, "Rahul", 35000);

        // Private data cannot be accessed directly.
        // System.out.println(employee.salary); // Not allowed

        System.out.println("Employee ID = " + employee.getEmployeeId());
        System.out.println("Employee Name = " + employee.getEmployeeName());
        System.out.println("Salary = " + employee.getSalary());

        employee.displayEmployee();
    }
}