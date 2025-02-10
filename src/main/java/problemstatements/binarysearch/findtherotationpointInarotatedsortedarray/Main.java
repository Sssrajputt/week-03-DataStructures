package problemstatements.binarysearch.findtherotationpointInarotatedsortedarray;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 1, 2, 3};
        int rotationPoint = FindTheRotationPointInARotatedSortedArray.rotationPoint(arr);
        System.out.println("Rotation point index: " + rotationPoint);
    }
}