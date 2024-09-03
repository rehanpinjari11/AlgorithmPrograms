package com.bl.java.dsa;

import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of words: ");
        int n = scanner.nextInt();

        String[] words = new String[n];

        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++)
        {
            words[i] = scanner.next();
        }

        insertionSort(words);

        System.out.println("Sorted words:");
        for (String word : words) {
            System.out.println(word);
        }

        scanner.close();
    }

    public static void insertionSort(String[] words) {
        int n = words.length;

        for (int i = 1; i < n; i++) {
            String key = words[i];
            int j = i - 1;

            while (j >= 0 && words[j].compareTo(key) > 0) {
                words[j + 1] = words[j];
                j--;
            }

            words[j + 1] = key;
        }
    }
}
