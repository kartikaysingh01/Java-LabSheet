
import java.util.ArrayList;
import java.util.HashSet;

public class HospitalPatientList {
    public static void main(String[] args) {

        ArrayList<String> patientNames = new ArrayList<String>();
        HashSet<String> patientIDs = new HashSet<String>();

        // Adding patients
        patientNames.add("Amit");
        patientNames.add("Rahul");
        patientNames.add("Priya");

        patientIDs.add("P101");
        patientIDs.add("P102");
        patientIDs.add("P103");

        System.out.println("Patient Names: " + patientNames);
        System.out.println("Patient IDs: " + patientIDs);

        // Adding a new patient
        patientNames.add("Neha");
        patientIDs.add("P104");

        // Removing a patient
        patientNames.remove("Rahul");
        patientIDs.remove("P102");

        // Searching for a patient
        if (patientNames.contains("Priya")) {
            System.out.println("Priya is found.");
        } else {
            System.out.println("Priya is not found.");
        }

        // Displaying updated records
        System.out.println("Updated Patient Names: " + patientNames);
        System.out.println("Updated Patient IDs: " + patientIDs);
    }
}
