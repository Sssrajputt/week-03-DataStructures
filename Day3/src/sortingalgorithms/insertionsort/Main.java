package sortingalgorithms.insertionsort;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employees: ");
        int numberOfEmployees = sc.nextInt();

        int arr[] = new int[numberOfEmployees];
        System.out.println("Enter employees' marks:");
        for (int i = 0; i < numberOfEmployees; i++) {
            arr[i] = sc.nextInt();
        }

        // Sorting the marks
        SortEmployee.insertionSort(arr);

        // Display the sorted marks
        System.out.println("Sorted marks:");
        for (int mark : arr) {
            System.out.print(mark + " ");
        }
    }
}
