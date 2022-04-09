package math_problems;

public class LowestNumber {

    /** INSTRUCTIONS
     * Write a method to find the lowest number from this array.
     */

    public static void main(String[] args) {

        int[] array = { 4211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123,
                67, 5, 679, 54, 32, 65 };
        int newArray = array [0];

        for(int i=0;i<array.length;i++) {
            if(array[i] < newArray) {
                newArray = array[i];
            }
        }

        System.out.println("The lowest number is " + newArray);

    }

}
