class Student {

    String name;
    int age;

    static int count = 0;

    void display() {

        String studentName = "Kartikay";
        int studentAge = 20;

        name = studentName;
        age = studentAge;

        count++;

        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Number of Students = " + count);
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.display();
    }
}