package com.bl.java.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class CheckPrimeNumberInRange {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Starting number in range
        System.out.print("Enter the Starting Number: ");
        int start = sc.nextInt();

        // Ending number in range
        System.out.print("Enter the Ending Number: ");
        int end = sc.nextInt();

        System.out.println("Prime Numbers between given range is: ");

        for (int number = start; number <= end; number++)
        {
            if (isPrime(number))
            {
                System.out.print(number + " ");
            }
        }

        System.out.println();

        System.out.println("Prime Numbers between given range that are also a Palindrome: ");

        for (int number = start; number <= end; number++)
        {
            if (isPrime(number) && isPalindrome(number)) // Calling the prime number method to check that number is also a palindrome
            {
                System.out.print(number + " ");
            }
            
        }

        System.out.println();

        System.out.println("Prime Numbers between given range that are also a Anagram: ");

        for (int i = start; i <= end; i++)
        {
            if (isPrime(i))
            {
                for (int j = i + 1; j <= end; j++)
                {
                    if (isPrime(j) && isAnagram(i, j)) // calling the prime number method and anagram method to print all anagram numbers
                    {
                        System.out.println(i + " and " + j + " are Anagrams.");
                    }
                    
                }
            }
            
        }

    }

    // Method to check the prime numbers

    public static boolean isPrime(int number)
    {
        if(number <= 1)
        {
            return false;
        }

        for (int i = 2; i <= number/2; i++)
        {
            if (number % i == 0)
            {
                return false; // if the number is divisible by any number then return false
            }
            
        }
        return true; // if any number is only divisible by 1 and itself then return true
    }

    // Method to check if a number is palindrome

    public static boolean isPalindrome(int number)
    {
        int reverseNumber = 0;
        int originalNumber = number;

        while(number != 0)
        {
            reverseNumber = reverseNumber * 10 + number % 10;
            number /= 10;

        }

        return reverseNumber == originalNumber;

    }

    // Method to check if the two number are anagram

    public static boolean isAnagram(int number1, int number2)
    {
        char[] chaArray1 = Integer.toString(number1).toCharArray();
        char[] charArray2 = Integer.toString(number2).toCharArray();

        Arrays.sort(chaArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(chaArray1, charArray2);

    }

}


