package problemstatements.stringbuffer.concatenatestring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestConcatenateString {

    @Test
    public void testConcatenate() {
        String[] actual = {"Hello", "Gagan", "My", "Friend"};
        String expected = "HelloGaganMyFriend";
        StringBuilder concatenatedString = new StringBuilder();

        for (String str : actual) {
            concatenatedString.append(str);
        }

        Assertions.assertEquals(expected, concatenatedString.toString());
    }
}
