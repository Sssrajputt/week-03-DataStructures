package problemstatements.filereader.counttheoccurrenceofawordinafileusingfilereader;

import java.util.Scanner;

import static problemstatements.filereader.counttheoccurrenceofawordinafileusingfilereader.CountTheOccurrenceOfAWordInAFileUsingFileReader.occurrenceWord;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking user inout of a text file
        System.out.println("Enter a txt file you wants to read: ");
        String string = sc.nextLine();
        String targetWord = "Hello"; // Provide the word you want to count

        int count = occurrenceWord(string, targetWord);
        System.out.println("The word '" + targetWord + "' occurs " + count + " times in the file.");
    }
}
