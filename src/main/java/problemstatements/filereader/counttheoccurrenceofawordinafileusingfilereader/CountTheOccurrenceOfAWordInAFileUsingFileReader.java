package problemstatements.filereader.counttheoccurrenceofawordinafileusingfilereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountTheOccurrenceOfAWordInAFileUsingFileReader {

    public static int occurrenceWord(String filePath, String targetWord) {
        int occurrence = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equals(targetWord)) {
                        occurrence++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return occurrence;
    }

}