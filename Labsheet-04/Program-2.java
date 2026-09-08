class Rectangle {

    int length;
    int breadth;

    static String shapeName = "Rectangle";

    void displayArea() {

        int l = 10;
        int b = 5;

        length = l;
        breadth = b;

        int area = length * breadth;

        System.out.println("Shape = " + shapeName);
        System.out.println("Length = " + length);
        System.out.println("Breadth = " + breadth);
        System.out.println("Area = " + area);
    }

    public static void main(String[] args) {

        Rectangle r = new Rectangle();

        r.displayArea();
    }
}