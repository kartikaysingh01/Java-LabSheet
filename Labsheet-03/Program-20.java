public class StudentMarks {
    public static void main(String[] args) {

        int[][] marks = {
            {80, 75},
            {90, 85, 88},
            {70, 65, 72, 80}
        };

        for (int i = 0; i < marks.length; i++) {

            System.out.print("Student " + (i + 1) + " marks: ");

            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }

            System.out.println();
        }
    }
}