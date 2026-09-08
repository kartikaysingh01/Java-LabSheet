class Circle {

    double radius;

    static double PI = 3.14;

    void calculate() {

        double r = 5;

        radius = r;

        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;

        System.out.println("Radius = " + radius);
        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circumference);
    }

    public static void main(String[] args) {

        Circle c = new Circle();

        c.calculate();
    }
}