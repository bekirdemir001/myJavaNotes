package s17_statickeywords_staticblocks;

public class StaticKeyword {

    public static String stdName = "Tom Hanks";
    public int age = 13;

    //Create a method that returns the first letters of the student's name.
    public static String getInitials (String name){
        String first = name.substring(0,1);
        String second = name.split(" ")[1].substring(0,1);
        return first + second;
    }

    //Create a method that counts the vowels (a, e, i, o, u, A, E, I, O, U) in the student's name.
    public int countVowels(String name){
        int counter =0;
        for(int i=0; i<name.length(); i++){
            char ch = name.toLowerCase().charAt(i);
            switch (ch){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    counter++;
                    break;
            }
        }
        return counter;
    }

}