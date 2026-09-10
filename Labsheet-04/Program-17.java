class StudentGrade {

    String name;
    int marks;

    static int passingMarks = 40;

    void calculateGrade() {

        String studentName = "Kartikay";
        int studentMarks = 85;

        name = studentName;
        marks = studentMarks;

        System.out.println("Name = " + name);
        System.out.println("Marks = " + marks);
        System.out.println("Passing Marks = " + passingMarks);

        if (marks >= 90) {
            System.out.println("Grade = A");
        }
        else if (marks >= 80) {
            System.out.println("Grade = B");
        }
        else if (marks >= 70) {
            System.out.println("Grade = C");
        }
        else if (marks >= passingMarks) {
            System.out.println("Grade = D");
        }
        else {
            System.out.println("Grade = F");
        }
    }

    public static void main(String[] args) {

        StudentGrade s = new StudentGrade();

        s.calculateGrade();
    }
}