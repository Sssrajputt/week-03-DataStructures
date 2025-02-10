package problemstatements.stringbuilder.reverseastringusingstringbuilder;

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
        String reverse = ReverseAString.reverseAString(string);
        System.out.println("Reversed String: " + reverse);
    }
}
