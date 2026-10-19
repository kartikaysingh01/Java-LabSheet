
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchWordInFile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Create the file and write text
            FileWriter writer = new FileWriter("notes.txt");
            writer.write("Java is easy. Java is powerful.");
            writer.close();

            System.out.print("Enter word to search: ");
            String word = sc.next();

            BufferedReader reader =
                    new BufferedReader(new FileReader("notes.txt"));

            String line;
            int count = 0;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\W+");

                for (String currentWord : words) {
                    if (currentWord.equalsIgnoreCase(word)) {
                        count++;
                    }
                }
            }

            reader.close();

            if (count > 0) {
                System.out.println("Word found in the file.");
                System.out.println("Occurrences: " + count);
            } else {
                System.out.println("Word not found in the file.");
                System.out.println("Occurrences: 0");
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        sc.close();
    }
}
