
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class CountCharacters {
    public static void main(String[] args) {

        try {
            // Create the file and write data
            FileWriter writer = new FileWriter("input.txt");
            writer.write("Java 123 is Easy");
            writer.close();

            FileReader reader = new FileReader("input.txt");

            int ch;
            int vowels = 0;
            int consonants = 0;
            int digits = 0;
            int spaces = 0;

            while ((ch = reader.read()) != -1) {
                char c = (char) ch;

                if (Character.isLetter(c)) {
                    c = Character.toLowerCase(c);

                    if (c == 'a' || c == 'e' || c == 'i'
                            || c == 'o' || c == 'u') {
                        vowels++;
                    } else {
                        consonants++;
                    }
                } else if (Character.isDigit(c)) {
                    digits++;
                } else if (c == ' ') {
                    spaces++;
                }
            }

            reader.close();

            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
            System.out.println("Digits: " + digits);
            System.out.println("Spaces: " + spaces);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
