package s14_arrays;

public class Arrays05 {

    /*
    Type the code that finds the number of digits in an integer Array.
     */
    public static void main(String[] args) {

        int[] number = {32, 24, 2, 474, 52, 1119};//--> 3+2+2+4+2+4+7+4+5+2+1+1+1+9 = 47

        int sumOfDigits = 0;
        for (int w : number){
            for (int i=w ; i>0; i/=10){
                sumOfDigits += i % 10;
            }
        }
        System.out.println(sumOfDigits);//47
    }
}