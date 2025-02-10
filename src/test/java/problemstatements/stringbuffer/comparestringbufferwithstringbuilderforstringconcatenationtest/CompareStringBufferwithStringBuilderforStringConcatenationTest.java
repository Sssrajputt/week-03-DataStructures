package problemstatements.stringbuffer.comparestringbufferwithstringbuilderforstringconcatenationtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import problemstatements.stringbuffer.comparestringbufferwithstringbuilderforstringconcatenation.CompareStringBufferWithStringBuilder;

public class CompareStringBufferwithStringBuilderforStringConcatenationTest {
    @Test
    public void Test(){
        boolean actual = CompareStringBufferWithStringBuilder.compare();
        boolean expected = true;
        Assertions.assertEquals(actual,expected);
    }
}

