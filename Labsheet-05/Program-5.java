class Medicine {
    String medicineName;
    int ageLimit;

    Medicine(String medicineName, int ageLimit) {
        this.medicineName = medicineName;
        this.ageLimit = ageLimit;
    }

    String checkEligibility(int patientAge) {

        // Local variable to store the result
        String result;

        if (patientAge >= ageLimit) {
            result = "Eligible";
        } else {
            result = "Not Eligible";
        }

        return result;
    }
}

public class EligibilityMain {
    public static void main(String[] args) {

        Medicine m = new Medicine("Medicine A", 18);

        System.out.println("Patient Age 20: " + m.checkEligibility(20));
        System.out.println("Patient Age 15: " + m.checkEligibility(15));
    }
}