class Employee {

    String name;
    double salary;

    static String organization = "ABC Company";

    void compareSalary(Employee e1, Employee e2) {

        System.out.println("Organization = " + organization);

        System.out.println("Employee 1 = " + e1.name);
        System.out.println("Salary = " + e1.salary);

        System.out.println("Employee 2 = " + e2.name);
        System.out.println("Salary = " + e2.salary);

        if (e1.salary > e2.salary) {
            System.out.println(e1.name + " has higher salary");
        }
        else if (e2.salary > e1.salary) {
            System.out.println(e2.name + " has higher salary");
        }
        else {
            System.out.println("Both employees have equal salary");
        }
    }

    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.name = "Rahul";
        e1.salary = 50000;

        e2.name = "Aman";
        e2.salary = 45000;

        e1.compareSalary(e1, e2);
    }
}