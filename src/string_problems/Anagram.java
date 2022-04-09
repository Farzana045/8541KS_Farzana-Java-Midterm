
package string_problems;

import java.util.Arrays;

public class Anagram {

    /**
     * INSTRUCTIONS
     * Write a Java Program, `isAnagram`, to check if any two strings are anagrams
     * <p>
     * An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all of the
     * original letters exactly once.
     * <p>
     * Ex: "CAT" & "ACT",
     * "ARMY" & "MARY",
     * "FART" & "RAFT"
     */


      static boolean areAnagram(char[] str1, char[] str2)  {   /* function to check whether two strings are anagram of each other */

          int n1 = str1.length;   // Get lengths of both strings
          int n2 = str2.length;

          if (n1 != n2)              // If length of both strings is not same, then they cannot be anagram
                return false;


    Arrays.sort(str1);  // Sort both strings
    Arrays.sort(str2);


    for (int i = 0; i < n1; i++)  // Compare sorted strings
        if (str1[i] != str2[i])
            return false;

        return true;
}

   public static void main(String args[])
    {
        char str1[] = { 'r', 'a', 'c', 'e' };
        char str2[] = { 'c', 'a', 'r', 'e' };


        if (areAnagram(str1, str2))  // Function Call
            System.out.println("The two strings are anagram ");
        else
            System.out.println("The two strings are not anagram of each other");
    }
}


