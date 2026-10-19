
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CountFileData {
    public static void main(String[] args) {

        try {
            // Create and write data into the file
            FileWriter writer = new FileWriter("data.txt");
            writer.write("Java is easy\n");
            writer.write("Java is powerful");
            writer.close();

            // Read the file and count data
            BufferedReader reader =
                    new BufferedReader(new FileReader("data.txt"));

            int lines = 0;
            int words = 0;
            int characters = 0;
            String line;

            while ((line = reader.readLine()) != null) {
                lines++;
                characters += line.length();

                String trimmedLine = line.trim();

                if (!trimmedLine.isEmpty()) {
                    words += trimmedLine.split("\\s+").length;
                }
            }

            reader.close();

            System.out.println("Number of Lines: " + lines);
            System.out.println("Number of Words: " + words);
            System.out.println("Number of Characters: " + characters);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
