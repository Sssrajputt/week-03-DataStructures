package sortingalgorithms.quicksort.sortproductprices;
import java.util.Scanner;
public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of product prices:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the product prices:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sorting the array
        QuickSort.sort(arr, 0, n - 1);

        // Displaying the sorted prices
        System.out.println("Sorted product prices:");
        for (int price : arr) {
            System.out.print(price + " ");
        }
    }
}