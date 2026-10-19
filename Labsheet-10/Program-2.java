
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadStudentFile {
    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("student.txt");
            BufferedReader reader = new BufferedReader(file);

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: student.txt file does not exist.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}
