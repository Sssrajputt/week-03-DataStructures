package problemstatements.binarysearch.findthepeakelementinanarray;
public class FindPeakElement {

    // Method to find a peak element in the array using binary search
    public static int findPeak(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        // Perform binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid is a peak element, considering edge cases
            if ((mid == 0 || arr[mid] >= arr[mid - 1]) &&
                    (mid == arr.length - 1 || arr[mid] >= arr[mid + 1])) {
                return mid; // Mid is a peak element
            }
            // If the element at mid is less than the left neighbor, search the left half
            else if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            }
            // If the element at mid is less than the right neighbor, search the right half
            else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        // Find and print the peak element index
        int peakIndex = findPeak(arr);
        if (peakIndex != -1) {
            System.out.println("Peak element index: " + peakIndex + ", Value: " + arr[peakIndex]);
        } else {
            System.out.println("No peak element found");
        }
    }
}
