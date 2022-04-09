package math_problems;


/** INSTRUCTIONS
 *
 * Write a method to return the Factorial of any given number using Recursion, and also another way, using iteration
 * I have not taught you recursion. Your job is to look it up, learn about it, and use it to find a solution.
 *
 * HINT: Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
 */

// Using Loop

public class Factorial {

        public static void main (String []args) {

            int i,fact=1;
            int number=6; //It is the number to calculate factorial
            for(i=1;i<=number;i++){
                fact=fact*i;
            }
            System.out.println("Factorial of "+number+" is: "+fact);
        }
    }

    //Using Recursion

 class Factorial2 {
    // Recursion method to find factorial of given number
    static int factorial(int n)
    {
        if (n == 0)
            return 1;

        return n * factorial (n-1);

    }

    // Driver method
    public static void main(String[] args)
    {
        int num = 3;
        System.out.println("Factorial of " + num
                + " is " + factorial (3));
    }
}