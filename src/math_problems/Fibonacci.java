package math_problems;

public class Fibonacci {

    /** INSTRUCTIONS
     *
     * Write a method that will print or return at least 40 Fibonacci number
     * e.g. - 0,1,1,2,3,5,8,13
     **/

    public static int fib(int n)
    {
      if (n<=1) {
          return n;
      }
      return fib(n-1) + fib(n-2);
      }

    public static void main(String[] args) {
     int n=40;
        System.out.println("F(n)=" + fib(n));
    }

}
