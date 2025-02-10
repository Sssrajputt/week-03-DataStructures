package problemstatements.stringbuilder.removeduplicatesfromastringusingstringbuilder;

import problemstatements.stringbuilder.reverseastringusingstringbuilder.ReverseAString;

import java.util.Scanner;
//Creating main class
public class Main {
    public static void main(String args[]){
        //creating scanner class object
        Scanner sc = new Scanner(System.in);

        // taking user input of a string
        System.out.println("Enter a text: ");
        String string = sc.nextLine();

        // calling reverse method
        String removeDuplicates = RemoveDuplicates.remove(string);
        System.out.println("String after removeDuplicates: " + removeDuplicates);
    }
}
