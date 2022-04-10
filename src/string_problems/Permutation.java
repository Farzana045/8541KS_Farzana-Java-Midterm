package string_problems;

public class Permutation {

    /** INSTRUCTIONS
     * Create a Java program to compute all permutations of any given string
     *
     * e.g. -  "ABC" = "ABC" "ACB" "BAC" "BCA" "CAB" "CBA"
     */

    static void printPermutn (String str, String ans)  // Function to print all the permutations of str
    {

        if (str.length() == 0)   // If string is empty

        {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++)

        {

            char ch = str.charAt(i); // ith character of str

            String ros = str.substring(0, i) + str.substring(i + 1);  // Rest of the string after excluding   // the ith character

            printPermutn(ros, ans + ch);  // Recursive call
        }
    }
    public static void main(String[] args) {

        String s = "ABC";
        printPermutn(s, " ");
    }
}

