package problemstatements.stringbuilder.removeduplicatesusingstringbuffer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import problemstatements.stringbuilder.removeduplicatesfromastringusingstringbuilder.RemoveDuplicates;

public class RemoveDuplicatesTest {
    @Test
    public void removeTest(){
        String actual = RemoveDuplicates.remove("Gagannanaan");
        String expected = "Gagn";
        Assertions.assertEquals(actual,expected);
    }

}
