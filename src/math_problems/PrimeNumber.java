package math_problems;

public class PrimeNumber {

    /** INSTRUCTIONS
     * Write a method to print a list of all prime numbers from 2 to 1,000,000.
     *  Print out the prime numbers in the given range.
     *
     * BONUS: Figure out how to improve algorithmic efficiency
     */

    static void PrimeNum(int N)
    {

        int x, y, find;  // Declaring the variables

        System.out.println(
                "All the Prime numbers within 1 and " + N
                        + " are:");

        for (x = 1; x <= N; x++) {

            if (x == 1 || x == 0) // Omit 0 and 1 as they are not prime

                continue;

                find = 1; // Using find variable to check if x is prime or not

            for (y = 2; y <= x / 2; ++y) {
                if (x % y == 0) {
                    find = 0;
                    break;
                }
            }

            if (find == 1) // If flag is 1 then x is prime but,if flag is 0 then x is not prime
                System.out.print(x + " ");
        }
    }

    public static void main(String[] args)
    {
        int N = 1000000;

        PrimeNum(N);
    }
}


