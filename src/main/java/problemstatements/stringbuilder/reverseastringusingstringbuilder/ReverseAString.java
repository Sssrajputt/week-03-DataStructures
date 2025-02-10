package problemstatements.stringbuilder.reverseastringusingstringbuilder;

// creating ReverseAString class
public class ReverseAString {

    //creating a method to reverse a String
    public static String reverseAString(String str){

    //creating stringbuilder object
    StringBuilder sc = new StringBuilder();

    //creating stringbuilder
    sc.append(str);
    sc.reverse();
    String reverse = sc.toString();
    return reverse;
    }
}
