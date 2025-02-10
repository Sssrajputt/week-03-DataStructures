package problemstatements.stringbuffer.comparestringbufferwithstringbuilderforstringconcatenation;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String string = sc.nextLine();
        CompareStringBufferWithStringBuilder cb = new CompareStringBufferWithStringBuilder();
        long timeBuffer = cb.stringBufferTime(string);
        long timeBuilder = cb.stringBuilderTime(string);

        System.out.println("StringBuffer time in ns: " + timeBuffer);
        System.out.println("StringBuilder time in ns: " + timeBuilder);
    }
}
