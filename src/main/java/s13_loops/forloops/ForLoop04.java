package s13_loops.forloops;

public class ForLoop04 {

    /*
    Example 1: Type the code that returns the sum of the integers from 5 to 8.
    Example 2: Type the code that returns the multiply of the integers from 7 to 9.
     */
    public static void main(String[] args) {

        //Example 1:
        int sum = 0;
        for (int i=5; i<9; i++){
            sum += i;
        }
        System.out.println("Sum of numbers: " + sum);

        //Example 2:
        int multiply = 1;
        for (int i=7; i<10; i++){
            multiply *= i;
        }
        System.out.println("Multiply of numbers: " + multiply);
    }
}
