package s14_arrays;

public class Arrays01 {

    /*
    Create a String Array, add 5 elements into it, and print the sum of the character numbers of all elements to the console.
     */
    public static void main(String[] args) {

        String[] cities = new String[5];
        cities[0] = "Miami";
        cities[1] = "Istanbul";
        cities[2] = "Frankfurt";
        cities[3] = "Dhaka";
        cities[4] = "Athena";

        //1. Way: For-Loop
        int sumOfCharacter = 0;

        for(int i=0; i< cities.length; i++){
            sumOfCharacter += cities[i].length();
        }
        System.out.println(sumOfCharacter);//33

        //2. Way: While-Loop
        int sumOfCharacter2 = 0;

        int j = 0;
        while (j<cities.length){
            sumOfCharacter2 += cities[j].length();
            j++;
        }
        System.out.println(sumOfCharacter2);//33

        //3. Way: For-Each-Loop
        int sumOfCharacter3 = 0;

        for(String w : cities){
            sumOfCharacter3 += w.length();
        }
        System.out.println(sumOfCharacter3);//33

    }
}