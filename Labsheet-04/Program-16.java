class Triangle {

    int a;
    int b;
    int c;

    static String type = "Scalene/Isosceles/Equilateral";

    void checkTriangle() {

        int sideA = 5;
        int sideB = 5;
        int sideC = 5;

        a = sideA;
        b = sideB;
        c = sideC;

        if (a + b > c && a + c > b && b + c > a) {

            System.out.println("Valid Triangle");

            if (a == b && b == c) {
                System.out.println("Type = Equilateral");
            }
            else if (a == b || b == c || a == c) {
                System.out.println("Type = Isosceles");
            }
            else {
                System.out.println("Type = Scalene");
            }

        } else {
            System.out.println("Invalid Triangle");
        }
    }

    public static void main(String[] args) {

        Triangle t = new Triangle();

        t.checkTriangle();
    }
}