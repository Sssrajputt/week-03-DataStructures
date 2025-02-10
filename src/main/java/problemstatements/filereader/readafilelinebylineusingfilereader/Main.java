package problemstatements.filereader.readafilelinebylineusingfilereader;

import java.util.Scanner;

//creating main class
public class Main {
    //creating main method
    public static void main(String args[]){
        //creating scanner class object
        Scanner sc = new Scanner(System.in);
        //taking user inout of a text file
        System.out.println("Enter a txt file you wants to read: ");
        String string = sc.nextLine();
        //calling method to readfile
        ReadAFileLineByLineUsingFileReader.readFile(string);
    }
}
