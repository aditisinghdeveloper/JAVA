import java.io.*;
import java.util.*;

public class Interchange {
    public static void main(String[] args) {
        Interchange arrange = new Interchange();
        int arr[] = { 1, 3, 0, 2 };
        int n = arr.length;

        System.out.println("Given array is ");
        arrange.printArray(arr, n);

        arrange.rearrangeNaive(arr, n);

        System.out.println("Modified array is ");
        arrange.printArray(arr, n);
    }

    void rearrangeNaive(int arr[], int n) {
        int temp[] = new int[n];
        int i;

        for (i = 0; i < n; i++)
            temp[arr[i]] = i;

        for (i = 0; i < n; i++)
            arr[i] = temp[i];
    }

    void printArray(int arr[], int n) {
        int i;
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
