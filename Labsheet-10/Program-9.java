
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class StudentRecordFile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter("student_records.txt");

            for (int i = 1; i <= 5; i++) {
                System.out.println("Enter details of Student " + i);

                System.out.print("Roll Number: ");
                String roll = sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Course: ");
                String course = sc.nextLine();

                System.out.print("Marks: ");
                String marks = sc.nextLine();

                writer.write("Roll Number: " + roll + "\n");
                writer.write("Name: " + name + "\n");
                writer.write("Course: " + course + "\n");
                writer.write("Marks: " + marks + "\n");
                writer.write("--------------------\n");
            }

            writer.close();

            System.out.println("\nAll records saved successfully.");
            System.out.println("\nStudent Records:");

            BufferedReader reader =
                    new BufferedReader(new FileReader("student_records.txt"));

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        sc.close();
    }
}
