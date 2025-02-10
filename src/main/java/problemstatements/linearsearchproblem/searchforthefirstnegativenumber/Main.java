package problemstatements.linearsearchproblem.searchforthefirstnegativenumber;

public class Main {
    public static void main(String[] args) {
        // Example array
        int[] arr = {3, 4, -1, 5, 2};

        // Call the function to find the first negative number's index
        int result = SearchForTheFirstNegativeNumber.searchForTheFirstNegativeNumber(arr);

        // Output the result
        if (result != -1) {
            System.out.println("The first negative number is at index: " + result);
        } else {
            System.out.println("No negative number found.");
        }
    }
}