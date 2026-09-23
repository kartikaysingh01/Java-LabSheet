class Employee {

    private int employeeId;
    private String name;
    private double salary;

    static int employeeCount = 0;

    // Default-access member
    String department = "Pharmacy";

    Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        employeeCount++;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    void displayEmployee() {
        System.out.println("Employee ID = " + employeeId);
        System.out.println("Name = " + name);
        System.out.println("Salary = " + salary);
    }
}

class Pharmacist extends Employee {

    private String licenseNo;

    Pharmacist(int employeeId, String name,
               double salary, String licenseNo) {

        super(employeeId, name, salary);
        this.licenseNo = licenseNo;
    }

    void displayPharmacist() {
        displayEmployee();
        System.out.println("Role = Pharmacist");
        System.out.println("License No = " + licenseNo);
    }
}

class StoreManager extends Employee {

    private String storeSection;

    StoreManager(int employeeId, String name,
                 double salary, String storeSection) {

        super(employeeId, name, salary);
        this.storeSection = storeSection;
    }

    void displayStoreManager() {
        displayEmployee();
        System.out.println("Role = Store Manager");
        System.out.println("Store Section = " + storeSection);
    }
}

class PharmacyManager {

    void processEmployees(Employee[] employees) {

        for (int i = 0; i < employees.length; i++) {

            // Local variable
            String role;

            if (employees[i] instanceof Pharmacist) {
                role = "Pharmacist";
                Pharmacist p = (Pharmacist) employees[i];
                p.displayPharmacist();
            }
            else {
                role = "Store Manager";
                StoreManager s = (StoreManager) employees[i];
                s.displayStoreManager();
            }

            System.out.println("Department = "
                    + employees[i].department);
            System.out.println("Identified Role = " + role);
            System.out.println();
        }
    }
}

public class PharmacyEmployeeMain {

    public static void main(String[] args) {

        Employee[] employees = {
            new Pharmacist(
                101, "Rahul", 45000, "PH12345"
            ),

            new StoreManager(
                102, "Amit", 55000, "Medicine Store"
            )
        };

        // Using a setter
        employees[0].setSalary(48000);

        PharmacyManager manager = new PharmacyManager();
        manager.processEmployees(employees);

        System.out.println(
            "Total Employees = " + Employee.employeeCount
        );
    }
}