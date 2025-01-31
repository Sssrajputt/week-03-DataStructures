package sortingalgorithms.heapsort.sortjobapplicantsbysalary;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employees: ");
        int numberOfEmployees = sc.nextInt();

        int arr[] = new int[numberOfEmployees];
        System.out.println("Enter employees' salary demands:");
        for (int i = 0; i < numberOfEmployees; i++) {
            arr[i] = sc.nextInt();
        }

        // Creating an instance of HeapSort
        HeapSort sorter = new HeapSort();

        System.out.println("Original salary demands:");
        sorter.printArray(arr);

        // Sorting the salary demands
        sorter.heapSort(arr);

        System.out.println("Sorted salary demands:");
        sorter.printArray(arr);
    }
}