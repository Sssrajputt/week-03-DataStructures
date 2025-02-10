package problemstatements.filereader.readafilelinebylineusingfilereader1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


//creating ReadAFileLineByLineUsingFileReader class
public class ReadAFileLineByLineUsingFileReader {

    //creating mathod to readfile
    public static String readFile(String string) {
        String string1 = "";
        // Use a try-with-resources block to ensure the file is closed after reading
        try (BufferedReader br = new BufferedReader(new FileReader(string))) {
            String line;

            // Read each line from the file and print it to the console
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                string1+=line;
            }
        } catch (IOException e) {
            // Print stack trace in case of an exception
            e.printStackTrace();
        }
        return string1;
    }
}
