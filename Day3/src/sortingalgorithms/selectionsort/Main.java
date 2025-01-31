package sortingalgorithms.selectionsort;
import java.util.*;
public class Main{
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of students:");
    int n = sc.nextInt();

    int arr[] = new int[n];
    System.out.println("Enter the exam scores:");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    // Sorting the array
    SelectionSort.selectionSort(arr);

    // Displaying the sorted scores
    System.out.println("Sorted exam scores:");
    for (int score : arr) {
        System.out.print(score + " ");
    }
}
}

