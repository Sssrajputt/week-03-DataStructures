package problemstatements.stringbuffer.concatenatestringsefficientlyusingstringbuffer;

import problemstatements.stringbuilder.removeduplicatesfromastringusingstringbuilder.RemoveDuplicates;

import java.util.Scanner;

// Creating main class
public class Main {
    public static void main(String args[]) {
        // Creating Scanner class object
        Scanner sc = new Scanner(System.in);

        // Taking user input of array length
        System.out.println("Enter array length: ");
        int length = sc.nextInt();
        sc.nextLine();  // Consume newline character

        // Taking user input of strings
        String[] str = new String[length];
        System.out.println("Enter strings: ");
        for (int i = 0; i < length; i++) {
            str[i] = sc.nextLine();
        }

        // Calling concatenateStrings method
        String concatenatedString = ConcatenateStrings.concatenateStrings(str);
        System.out.println("String array Concatenation: " + concatenatedString);
    }
}
