package sortingalgorithms.countingsort.sortstudentages;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        int[] ages = new int[numberOfStudents];
        System.out.println("Enter students' ages (between 10 and 18): ");
        for (int i = 0; i < numberOfStudents; i++) {
            ages[i] = sc.nextInt();
        }

        // Define the range of ages
        int range = 18; // As ages range from 10 to 18

        System.out.println("Original ages:");
        CountingSort.printArray(ages);

        // Sorting the ages
        CountingSort.countingSort(ages, range);

        System.out.println("Sorted ages:");
        CountingSort.printArray(ages);
    }
}
