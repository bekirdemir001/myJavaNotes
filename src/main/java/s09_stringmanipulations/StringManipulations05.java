package s09_stringmanipulations;

public class StringManipulations05 {
    public static void main(String[] args) {

        //trim():
        String str = "   Bekir!...  ";
        String strTrimmed = str.trim();
        System.out.println(strTrimmed);//Bekir!...

        //isEmpty():
        String str1 = "";
        String str2 = "x";

            //1. Way: With length()
        boolean result1 = str1.length()==0;
        System.out.println("Result 1: Is String empty?: " + result1);//true
        boolean result2 = str2.length()==0;
        System.out.println("Result 2: Is String empty?: " + result2);//false

            //2. Way: With isEmpty()
        boolean result3 = str1.isEmpty();
        System.out.println("Result 3: Is String empty?: " + result3);//true

        boolean result4 = str2.isEmpty();
        System.out.println("Result 4: Is String empty?: " + result4);//false

        //isBlank():
        String str3 = "       ";

            //1. Way: With length()
        boolean result5 = str3.length()==0;
        System.out.println("Result 5: Is String empty?: " + result5);//false

            //2. Way: With isEmpty()
        boolean result6 = str3.isEmpty();
        System.out.println("Result 6: Is String empty?: " + result6);//false

            //3. Way: With isBlank()
        boolean result7 = str3.isBlank();
        System.out.println("Result 7: Is String empty?: " + result7);//true

        //indexOf(int ch)
        String str4 = "Java is easy to learn";//For a, e, i --> 1+8+5 = 14

        int idxA = str4.indexOf('a');
        System.out.println(idxA);//1

        int idxE = str4.indexOf('e');
        System.out.println(idxE);//8

        int idxI = str4.indexOf('i');
        System.out.println(idxI);//5

        System.out.println("Sum Of Indexes: " + (idxA + idxI + idxE));//14

        //indexOf(String str):
        String str5 = "Sentences: Java is easy, Java uses OOP Concept, Java is popular";

        int idxJava = str5.indexOf("Java");
        System.out.println(idxJava);//11

        int idxXyz = str5.indexOf("xyz");
        System.out.println(idxXyz);//-1

        //lastIndexOf(int ch):
        String str6 = "Java is easy to learn";//18+17+5 = 40

        int idxOfA = str6.lastIndexOf('a');
        System.out.println(idxOfA);//18

        int idxOfE = str6.lastIndexOf('e');
        System.out.println(idxOfE);//17

        int idxOfI = str6.lastIndexOf('i');
        System.out.println(idxOfI);//5

        System.out.println("Sum Of LastIndexes: " + (idxOfA + idxOfE + idxOfI));//40
    }
}