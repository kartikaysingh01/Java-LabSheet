class MedicineProduct {

    private String medicineName;
    private String batchNo;
    private double price;

    // Parameterized constructor
    MedicineProduct(String medicineName, String batchNo, double price) {
        this.medicineName = medicineName;
        this.batchNo = batchNo;
        this.price = price;
    }

    // Getters
    public String getMedicineName() {
        return medicineName;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    void displayProduct() {
        System.out.println("Medicine Name = " + medicineName);
        System.out.println("Batch No = " + batchNo);
        System.out.println("Price = " + price);
    }
}

public class MedicineProductMain {
    public static void main(String[] args) {

        MedicineProduct m = new MedicineProduct(
            "Paracetamol", "P101", 50.0
        );

        // Update data using setter
        m.setPrice(60.0);

        // Read data using getter
        System.out.println("Price = " + m.getPrice());

        m.displayProduct();
    }
}