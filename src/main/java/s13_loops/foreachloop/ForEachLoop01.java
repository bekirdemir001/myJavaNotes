package s13_loops.foreachloop;

public class ForEachLoop01 {

    /*
    Create a String Array, add 5 elements into it, and print the sum of the character numbers of all elements.
     */
    public static void main(String[] args) {

        String[] cities = new String[5];
        cities[0] = "Miami";
        cities[1] = "Istanbul";
        cities[2] = "Frankfurt";
        cities[3] = "Dhaka";
        cities[4] = "Athena";

        //1. Way: For-Loop
        int sum = 0;
        for (int i = 0; i< cities.length; i++){
            sum += cities[i].length();
        }
        System.out.println("The sum of characters(For-Loop): " + sum);//33

       //2. Way: For-Each-Loop: It is recommended as possible.
        int sum2 = 0;
        for (String w : cities){
            sum2 += w.length();
        }
        System.out.println("The sum of characters(For-Each-Loop): " + sum2);//33
    }
}