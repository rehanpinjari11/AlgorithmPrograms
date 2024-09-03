package com.bl.java.dsa;

import java.util.*;

public class StringPermutations {

        public static List<String> iterativePermutations(String str)
        {
            List<String> permutations = new ArrayList<>();

            if (str == null || str.length() == 0)
            {
                return permutations;
            }

            permutations.add(String.valueOf(str.charAt(0)));

            for (int i = 1; i < str.length(); i++)
            {
                char currentChar = str.charAt(i);

                List<String> newPermutations = new ArrayList<>();

                for (String perm : permutations)
                {
                    for (int j = 0; j <= perm.length(); j++)
                    {
                        String newPerm = perm.substring(0, j) + currentChar + perm.substring(j);
                        newPermutations.add(newPerm);
                    }
                }
                permutations = newPermutations;
            }
            return permutations;
        }

    public static List<String> recursivePermutations(String str)
    {
        List<String> permutations = new ArrayList<>();
        if (str == null || str.length() == 0) {
            permutations.add("");
            return permutations;
        }

        char firstChar = str.charAt(0);
        String remainingStr = str.substring(1);

        List<String> words = recursivePermutations(remainingStr);

        for (String word : words) {
            for (int i = 0; i <= word.length(); i++) {
                String newPerm = word.substring(0, i) + firstChar + word.substring(i);
                permutations.add(newPerm);
            }
        }
        return permutations;
    }

    public static boolean arePermutationsEqual(List<String> list1, List<String> list2)
    {
        if (list1.size() != list2.size()) {
            return false;
        }

        Collections.sort(list1);
        Collections.sort(list2);

        return list1.equals(list2);
    }

    public static void main(String[] args) {
        String input = "abc";

        List<String> iterativePerms = iterativePermutations(input);
        List<String> recursivePerms = recursivePermutations(input);

        System.out.println("Iterative Permutations: " + iterativePerms);
        System.out.println("Recursive Permutations: " + recursivePerms);

        boolean isEqual = arePermutationsEqual(iterativePerms, recursivePerms);
        System.out.println("Are both permutation methods equal? " + isEqual);
    }
}
