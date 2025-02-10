package problemstatements.inputstreamreader.convertbytestreamtocharacterstreamusingInputstreamreader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "Filereader.txt";

        // Create a FileInputStream to read the binary data from the file
        try (FileInputStream fis = new FileInputStream(filePath);
             InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
             BufferedReader br = new BufferedReader(isr)) {

            // Read and print each line from the file
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.err.println("IOException occurred: " + e.getMessage());
        }
    }
}