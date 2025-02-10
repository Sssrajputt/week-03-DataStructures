package problemstatements.stringbuilder.removeduplicatesfromastringusingstringbuilder;

import java.util.HashSet;
//creating removeduplicates class
public class RemoveDuplicates {
    //Creating method to remove duplicates
    public static String remove(String str) {
        //creating string buffer object
        StringBuilder sb = new StringBuilder();
        //creating empty hashset
        HashSet<Character> seenChars = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (!seenChars.contains(c)) {
                seenChars.add(c);
                sb.append(c);
            }
        }

        return sb.toString();
    }
}