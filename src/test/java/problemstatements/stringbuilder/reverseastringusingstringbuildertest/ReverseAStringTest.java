package problemstatements.stringbuilder.reverseastringusingstringbuildertest;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
import problemstatements.stringbuilder.reverseastringusingstringbuilder.ReverseAString;

public class ReverseAStringTest {
     @Test
     public void reverseAStringTest(){
          String actualResult = ReverseAString.reverseAString("Gagan");
          String expectedResult = "nagaG";
          Assertions.assertEquals(actualResult,expectedResult);

     }
}
