package problemstatements.inputstreamreader.convertbytestreamtocharacterstreamusingInputstreamreader;
import java.io.*;

public class ConvertByteStreamToCharacterStreamUsingInputStreamReader {

    public static String converter(String string) {
        // Sample byte array from given hexadecimal values
        byte[] byteArray = {
                (byte)0x48, (byte)0x65, (byte)0x6C, (byte)0x6C, (byte)0x6F, (byte)0x2C, (byte)0x20,
                (byte)0x57, (byte)0x6F, (byte)0x72, (byte)0x6C, (byte)0x64, (byte)0x21
        };

        // Convert byte array to InputStream
        ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
        StringBuilder str = new StringBuilder();
        try (InputStreamReader isr = new InputStreamReader(bais, "UTF-8");
             BufferedReader br = new BufferedReader(isr)) {

            String line;
            while ((line = br.readLine()) != null) {
                str.append(line);
            }
        } catch (IOException e) {
            System.err.println("IOException occurred: " + e.getMessage());
        }
        return str.toString();
    }
}
