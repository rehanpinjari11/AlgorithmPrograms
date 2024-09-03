package com.bl.java.dsa;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(String[] arr) {
        mergeSortHelper(arr, 0, arr.length);
    }

    private static void mergeSortHelper(String[] arr, int lo, int hi) {
        if (hi - lo <= 1) {
            return; // Base case: subarray is already sorted
        }

        int mid = lo + (hi - lo) / 2;
        mergeSortHelper(arr, lo, mid); // Sort left half
        mergeSortHelper(arr, mid, hi); // Sort right half
        merge(arr, lo, mid, hi); // Merge sorted halves
    }

    private static void merge(String[] arr, int lo, int mid, int hi)
    {
        String[] temp = new String[hi - lo];
        int i = lo, j = mid, k = 0;

        while (i < mid && j < hi)
        {
            if (arr[i].compareTo(arr[j]) <= 0)
            {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i < mid) {
            temp[k++] = arr[i++];
        }

        while (j < hi) {
            temp[k++] = arr[j++];
        }

        System.arraycopy(temp, 0, arr, lo, temp.length);
    }

    public static void main(String[] args)
    {
        String[] arr = {"apple", "banana", "cherry", "date", "elderberry", "fig"};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
