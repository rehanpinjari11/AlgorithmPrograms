package com.bl.java.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First String: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the Second String: ");
        String str2 = sc.nextLine();

        isAnagram(str1, str2);

    }

    public static void isAnagram(String str1, String str2)
    {
        str1.toLowerCase();
        str2.toLowerCase();

        if (str1.length() != str2.length())
        {
            System.out.println("Not an Anagram");
        }

        else
        {
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            if (Arrays.equals(charArray1, charArray2))
            {
                System.out.println(str1 + " and " + str2 + " is an Anagram");
            }
            else
            {
                System.out.println(str1 + " and " + str2 + " is not an Anagram");
            }
        }

    }
}
