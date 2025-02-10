package problemstatements.filereadertest.readafilelinebylineusingfilereader;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import problemstatements.filereader.readafilelinebylineusingfilereader1.ReadAFileLineByLineUsingFileReader;

class ReadAFileLinebyLineUsingFileReaderTest {
    @Test
    public void fileReaderTest(){
        String actual = ReadAFileLineByLineUsingFileReader.readFile("Filereader.txt");
        String expected = "Hello world!";
        Assertions.assertEquals(actual,expected);

    }
}
