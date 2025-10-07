import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void readAndPrintFile(String filename) throws IOException {
        System.out.println("Trying to open '" + filename + "'");
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.print("File contains: ");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    public static void main(String[] args) {
        String filename = "data.txt";
        try {
            readAndPrintFile(filename);
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
    }
}
