class Pharmacy {

    // Default / package-private members
    String medicineName;
    double price;

    Pharmacy() {
        medicineName = "Paracetamol";
        price = 50.0;
    }

    void displayMedicine() {
        System.out.println("Medicine Name = " + medicineName);
        System.out.println("Price = " + price);
    }
}

public class DefaultAccessMain {
    public static void main(String[] args) {

        Pharmacy p = new Pharmacy();

        // Direct access because both classes are in the same package
        System.out.println("Medicine Name = " + p.medicineName);
        System.out.println("Price = " + p.price);

        p.displayMedicine();
    }
}