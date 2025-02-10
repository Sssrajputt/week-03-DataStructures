package problemstatements.stringbuffer.comparestringbufferwithstringbuilderforstringconcatenation;

public class CompareStringBufferWithStringBuilder {
    public static long stringBuilderTime(String str) {
        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append(str);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long stringBufferTime(String str) {
        long startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < 100000; i++) {
            sbf.append(str);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static boolean compare() {

        boolean br = false;
        long builder = stringBuilderTime("gagan");
        long buffer = stringBufferTime("gagan");
        if (buffer != builder) {
         br = true;
        }
        return br;
    }
}