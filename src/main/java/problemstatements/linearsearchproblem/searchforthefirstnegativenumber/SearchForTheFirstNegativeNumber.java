package problemstatements.linearsearchproblem.searchforthefirstnegativenumber;

public class SearchForTheFirstNegativeNumber {
    public static int searchForTheFirstNegativeNumber(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return -1;
            }
        }
        return -1;
    }
}
