class Patient {
    int patientId;
    String patientName;
    int age;

    Patient(int patientId, String patientName, int age) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
    }

    void displayPatient() {
        System.out.println("Patient ID = " + patientId);
        System.out.println("Patient Name = " + patientName);
        System.out.println("Age = " + age);
        System.out.println();
    }
}

class PatientManager {

    void displayAllPatients(Patient[] patients) {

        // Local loop variable
        int i;

        for (i = 0; i < patients.length; i++) {
            patients[i].displayPatient();
        }
    }
}

public class PatientMain {
    public static void main(String[] args) {

        Patient[] patients = {
            new Patient(101, "Rahul", 20),
            new Patient(102, "Aman", 21),
            new Patient(103, "Priya", 19),
            new Patient(104, "Neha", 22),
            new Patient(105, "Rohit", 20)
        };

        PatientManager manager = new PatientManager();

        manager.displayAllPatients(patients);
    }
}