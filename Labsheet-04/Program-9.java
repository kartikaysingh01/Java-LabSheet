class Laptop {

    String brand;
    int RAM;

    static String os = "Windows";

    void display() {

        String laptopBrand = "Dell";
        int laptopRAM = 8;

        brand = laptopBrand;
        RAM = laptopRAM;

        System.out.println("Brand = " + brand);
        System.out.println("RAM = " + RAM + " GB");
        System.out.println("Operating System = " + os);
    }

    public static void main(String[] args) {

        Laptop l = new Laptop();

        l.display();
    }
}