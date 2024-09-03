package com.bl.java.dsa;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Enter the size of the Array
        System.out.println("Enter the Number of Integers: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        // Enter the element of the Array
        for (int i = 0; i < size; i++)
        {
            System.out.print("Enter the Elements: ");
            arr[i] = sc.nextInt();
        }

        // Bubble Sort Algorithm

        for (int i = 0; i < size - 1; i++)
        {
            for (int j = i + 1; j < size; j++)
            {
                if (arr[i] > arr[j])
                {
                    // Swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        // Print the Sorted List

        System.out.println("Sorted List:");

        for (int i = 0; i < size; i++)
        {
            System.out.print(arr[i] + " ");

        }

    }
}
