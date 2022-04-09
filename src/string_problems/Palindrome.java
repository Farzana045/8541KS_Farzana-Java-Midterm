package string_problems;

public class Palindrome {

    /** INSTRUCTIONS
     * A palindrome is a word that can be reversed, and still remain the same.
     *
     * Example: MOM, DAD, MADAM, RACECAR
     *
     * Create a method to check if any given String is a palindrome or not.
     */


    static boolean isPalindrome(String str) // Returning true if string is palindrome
    {

        int i = 0, j = str.length() - 1;

        while (i < j) {

            if (str.charAt(i) != str.charAt(j))  // if mismatch
                return false;

            i++;
            j--;
        }

        return true;  // if match
    }

    public static void main(String[] args)
    {

        String str = "RACEcar"; // Input string

        str = str.toLowerCase(); //Convert the string to lowercase

        if (isPalindrome(str))

            System.out.print("Yes");
        else

            System.out.print("No");
    }
}
