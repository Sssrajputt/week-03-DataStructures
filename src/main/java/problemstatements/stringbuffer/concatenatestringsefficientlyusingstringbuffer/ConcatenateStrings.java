package problemstatements.stringbuffer.concatenatestringsefficientlyusingstringbuffer;

public class ConcatenateStrings {
    public static String concatenateStrings(String[] str) {
        StringBuffer sb = new StringBuffer();
        for (String string : str) {
            sb.append(string);
        }
        return sb.toString();
    }
}
