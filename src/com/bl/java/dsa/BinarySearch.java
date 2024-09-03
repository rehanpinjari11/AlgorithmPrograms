package com.bl.java.dsa;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class BinarySearch {

    public static boolean binarySearch(String[] wordList, String word)
    {
        int left = 0;
        int right = wordList.length - 1;

        while (left <= right)
        {
            int mid = (left + right) / 2;

            if (wordList[mid].compareTo(word) == 0) {
                return true;
            } else if (wordList[mid].compareTo(word) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(new File("words.txt"));
            String line = scanner.nextLine();
            String[] wordList = line.split(",");

            Arrays.sort(wordList);

            Scanner input = new Scanner(System.in);
            System.out.print("Enter a word to search: ");
            String word = input.nextLine();

            if (binarySearch(wordList, word))
            {
                System.out.println("Word found in the list.");
            } else {
                System.out.println("Word not found in the list.");
            }
        }

        catch (FileNotFoundException e)
        {
            System.out.println("File not found.");
        }
    }
}
