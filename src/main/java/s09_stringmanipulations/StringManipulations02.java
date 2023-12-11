package s09_stringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {
        String str = "Learn Java earn money";

        //Example 1: endsWith(String suffix)
        boolean isEnd = str.endsWith("money");
        System.out.println(isEnd);//true

        //Example 2: replace(CharSequence target, CharSequence replacement)
        String newStr = str.replace("money", "dollar");
        System.out.println(newStr);//Learn Java earn dollar

        //Example 3: replace(CharSequence target, CharSequence replacement)
        String newStr2 = str.replace("earn", "win");
        System.out.println(newStr2);//Lwin Java win money

        //Example 4: replace(char oldChar, char newChar)
        String newStr3 = str.replace("a", "*");
        System.out.println(newStr3);//Le*rn J*v* e*rn money

        /*
        Or;
         String newStr3 = str.replace('a', '*');
        System.out.println(newStr3);//Le*rn J*v* e*rn money
         */

        //Example 5: replace(CharSequence target, CharSequence replacement)
        String newStr4 = str.replace("n", "xxx");
        System.out.println(newStr4);//Learxxx Java earxxx moxxxey

        //Example 6: replace(CharSequence target, CharSequence replacement)
        String newStr5 = str.replace("e", "");
        System.out.println(newStr5);//Larn Java arn mony
    }
}