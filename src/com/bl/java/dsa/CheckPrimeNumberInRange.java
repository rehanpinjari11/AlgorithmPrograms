package com.bl.java.dsa;

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

        System.out.println("Prime Numbers between " + start + " and " + end + ":");

        for (int number = start; number <= end; number++)
        {
            if (isPrime(number)) // Calling the prime number method
            {
                System.out.print(number + " ");
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

}


