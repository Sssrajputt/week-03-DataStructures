package problemstatements.searchforspecificword;

import static problemstatements.searchforspecificword.SearchSpecificWord.searchWordInSentences;

public class Main {
    public static void main(String[] args) {
        // Sample array of sentences
        String[] sentences = {
                "The Technocrats Institute of technology is situated in Bhopal",
                "Java is a programming language.",
                "I love learning new things",
                "My hobby is to explore new places"
        };

        // Word to search for
        String word = "is";

        // Perform the search and print the result
        String result = searchWordInSentences(sentences, word);
        System.out.println(result);  // Output: Java is a programming language.
    }
}
