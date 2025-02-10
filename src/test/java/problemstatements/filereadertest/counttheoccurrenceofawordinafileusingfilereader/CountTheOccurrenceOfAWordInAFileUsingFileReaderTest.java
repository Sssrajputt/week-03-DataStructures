package problemstatements.filereadertest.counttheoccurrenceofawordinafileusingfilereader;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import problemstatements.filereader.counttheoccurrenceofawordinafileusingfilereader.CountTheOccurrenceOfAWordInAFileUsingFileReader;

public class CountTheOccurrenceOfAWordInAFileUsingFileReaderTest {
    @Test
    public void Test(){
        String target = "Hello";
        int actual = CountTheOccurrenceOfAWordInAFileUsingFileReader.occurrenceWord("Filereader.txt",target);
        int expected = 1;
        Assertions.assertEquals(actual,expected);
    }
}
