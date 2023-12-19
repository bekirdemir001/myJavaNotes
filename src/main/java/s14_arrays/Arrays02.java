package s14_arrays;

import java.util.Arrays;

public class Arrays02 {

    /*
    Create an Integer Array and place 6 elements in it. Print the sum of the smallest and largest of these elements on the screen.
     */
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 20;
        arr[1] = 23;
        arr[2] = 19;
        arr[3] = 44;
        arr[4] = 15;
        arr[5] = 32;

        System.out.println(Arrays.toString(arr));//[20, 23, 19, 44, 15, 32]

        //1. Way: sort()
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[15, 19, 20, 23, 32, 44]
        System.out.println(arr[0] + arr[arr.length-1]);//59

        int min = arr[0];
        int max = arr[0];

        for (int w : arr){
            min = Math.min(min, w);
            max = Math.max(max, w);
        }
        System.out.println(min + max);//59
    }
}
