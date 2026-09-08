class Car {

    String brand;
    double mileage;

    static int wheels = 4;

    void display() {

        String carBrand = "Toyota";
        double carMileage = 18.5;

        brand = carBrand;
        mileage = carMileage;

        System.out.println("Brand = " + brand);
        System.out.println("Mileage = " + mileage + " km/l");
        System.out.println("Wheels = " + wheels);
    }

    public static void main(String[] args) {

        Car c = new Car();

        c.display();
    }
}