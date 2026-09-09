class StudentMarks {

    int marks1;
    int marks2;
    int marks3;

    static String universityName = "COER University";

    void calculateAverage() {

        int m1 = 80;
        int m2 = 75;
        int m3 = 85;

        marks1 = m1;
        marks2 = m2;
        marks3 = m3;

        double average = (marks1 + marks2 + marks3) / 3.0;

        System.out.println("University = " + universityName);
        System.out.println("Marks 1 = " + marks1);
        System.out.println("Marks 2 = " + marks2);
        System.out.println("Marks 3 = " + marks3);
        System.out.println("Average = " + average);
    }

    public static void main(String[] args) {

        StudentMarks s = new StudentMarks();

        s.calculateAverage();
    }
}