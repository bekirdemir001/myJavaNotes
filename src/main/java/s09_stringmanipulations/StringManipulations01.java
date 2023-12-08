package s09_stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

        String str = "Java is easy";

        //Example 1: toUpperCase()
        String strUpper = str.toUpperCase();
        System.out.println(strUpper);//JAVA IS EASY

        //Example 2: toLowerCase()
        String strLower = str.toLowerCase();
        System.out.println(strLower);//java is easy

        //Example 3: charAt(int index)
        char ch = str.charAt(0);
        System.out.println(ch);//J

        //Example 4: charAt(int index)
        char secondChar = str.charAt(1);
        char lastSecondChar = str.charAt(10);

            //1. Way: Printing in the same line
            System.out.print(secondChar);
            System.out.println(lastSecondChar);//as

            //2. Way: Printing in the same line
            System.out.println(secondChar + " " + lastSecondChar);//a s
            System.out.println("" + secondChar + lastSecondChar);//as

        //Example 5: length()
        int strLength = str.length();
        System.out.println(strLength);//12

        //Example 6: substring(int beginIndex):
        String sub4 = str.substring(8);
        System.out.println(sub4);//easy

        //Example 7: substring(int beginIndex, int endIndex):
        String sub1 = str.substring(0,4);
        System.out.println(sub1);//Java

        //Example 8: substring(int beginIndex, int endIndex):
        String sub2 = str.substring(5,7);
        System.out.println(sub2);//is

        //Example 9: substring(int beginIndex, int endIndex):
        String sub3 = str.substring(8,12);
        System.out.println(sub3);//easy

        //Example 10: contains(CharSequence s):
        boolean isExist = str.contains("money");
        System.out.println(isExist);//false

        //Example 11: startsWith(String prefix):
        boolean isStarts = str.startsWith("Java");
        System.out.println(isStarts);//true

        //Example 12: startsWith(String prefix, int toffset):
        boolean isBegin = str.startsWith("i", 5);
        System.out.println(isBegin);//true
    }
}