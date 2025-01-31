package sortingalgorithms.bubblesort;

import java.util.*;
public class SchoolMarks {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int numberOfStudents = sc.nextInt();

        int arr[] = new int[numberOfStudents];
        System.out.println("Enter students' marks:");
        for (int i = 0; i < numberOfStudents; i++) { // Fixing the loop condition
            arr[i] = sc.nextInt();
        }

        // Sorting the marks
        BubbleSort.bubbleSort(arr);

        // Display the sorted marks
        System.out.println("Sorted marks:");
        for (int mark : arr) {
            System.out.print(mark + " ");
        }
    }
}