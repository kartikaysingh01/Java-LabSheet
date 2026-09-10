class Person {

    String name;
    int age;

    static String country = "India";

    void checkEligibility() {

        String personName = "Kartikay";
        int personAge = 20;

        name = personName;
        age = personAge;

        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Country = " + country);

        if (age >= 18) {
            System.out.println("Eligible for voting");
        } else {
            System.out.println("Not eligible for voting");
        }
    }

    public static void main(String[] args) {

        Person p = new Person();

        p.checkEligibility();
    }
}