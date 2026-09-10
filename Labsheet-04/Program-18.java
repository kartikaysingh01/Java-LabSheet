class ElectricBill {

    int units;

    static double fixedCharge = 100;

    void calculateBill() {

        int usedUnits = 150;

        units = usedUnits;

        double energyCharge = units * 5;
        double totalBill = energyCharge + fixedCharge;

        System.out.println("Units = " + units);
        System.out.println("Fixed Charge = " + fixedCharge);
        System.out.println("Energy Charge = " + energyCharge);
        System.out.println("Total Bill = " + totalBill);
    }

    public static void main(String[] args) {

        ElectricBill e = new ElectricBill();

        e.calculateBill();
    }
}