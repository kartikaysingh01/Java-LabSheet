class Person {

    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {

    private int employeeId;
    private double salary;

    static int employeeCount = 0;

    Employee(String name, int age, int employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
        employeeCount++;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void displayEmployee() {
        System.out.println("Employee ID = " + employeeId);
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Salary = " + salary);
    }
}

class Doctor extends Employee {

    private String specialization;

    Doctor(String name, int age, int employeeId,
           double salary, String specialization) {

        super(name, age, employeeId, salary);
        this.specialization = specialization;
    }

    void displayDoctor() {
        displayEmployee();
        System.out.println("Role = Doctor");
        System.out.println("Specialization = " + specialization);
    }
}

class Pharmacist extends Employee {

    private String licenseNo;

    Pharmacist(String name, int age, int employeeId,
               double salary, String licenseNo) {

        super(name, age, employeeId, salary);
        this.licenseNo = licenseNo;
    }

    void displayPharmacist() {
        displayEmployee();
        System.out.println("Role = Pharmacist");
        System.out.println("License No = " + licenseNo);
    }
}

class StaffManager {

    void displayStaff(Employee[] employees) {

        for (int i = 0; i < employees.length; i++) {

            if (employees[i] instanceof Doctor) {
                Doctor doctor = (Doctor) employees[i];
                doctor.displayDoctor();
            }
            else if (employees[i] instanceof Pharmacist) {
                Pharmacist pharmacist = (Pharmacist) employees[i];
                pharmacist.displayPharmacist();
            }

            System.out.println();
        }

        System.out.println("Total Employees = " + Employee.employeeCount);
    }
}

public class HospitalStaffMain {

    public static void main(String[] args) {

        Employee[] employees = {
            new Doctor("Rahul", 35, 101, 75000, "Cardiology"),
            new Pharmacist("Amit", 28, 102, 45000, "PH12345")
        };

        StaffManager manager = new StaffManager();
        manager.displayStaff(employees);
    }
}