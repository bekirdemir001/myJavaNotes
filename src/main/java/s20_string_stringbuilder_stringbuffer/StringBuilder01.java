package s20_string_stringbuilder_stringbuffer;

public class StringBuilder01 {

    public static void main(String[] args) {

        //Immutable
        String s = "Java";
        System.out.println(s);//Java

        String t = s + "!";
        System.out.println(s);//Java
        System.out.println(t);//Java!

        String w = t + "?";
        System.out.println(s);//Java
        System.out.println(t);//Java!
        System.out.println(w);//Java!?

        //Mutable
        //1.Way:
        StringBuilder sb1 = new StringBuilder("Python");
        System.out.println(sb1);//Python
        sb1.append("!").append("?").append(".");
        System.out.println(sb1);//Python!?.

        //2.Way
        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.length());//0
        System.out.println(sb2.capacity());//16

        sb2.append("Java");
        System.out.println(sb2.length());//4
        System.out.println(sb2.capacity());//16

        /*
        When we use StringBuilder, the initial capacity is 16. When the capacity is exceeded, twice the existing capacity is added
        to the existing capacity.
                16 --> 16*2+2 = 34      34 --> 34*2+2 = 70
         */

        sb2.append("xxxxxxxxxxxxxxx");
        System.out.println(sb2.length());//19
        System.out.println(sb2.capacity());//34 = 16*2+2

        sb2.append("yyyyyyyyyyyyyyyy");
        System.out.println(sb2.length());//35
        System.out.println(sb2.capacity());//70 = 34*2+2

        //3.Way
        StringBuilder sb3 = new StringBuilder(2);
        sb3.append("Flo");
        System.out.println(sb3.length());//3
        System.out.println(sb3.capacity());//6

        sb3.insert(2,"xxxxxx");
        System.out.println(sb3);//Flxxxxxxo

        //toString() method converts StringBuilder to String. When we need String Class methods, we switch to String Class using
        //the toString() method and use String Class methods we need, such as the split() method.
        sb3.toString().split("l");

        //We can convert String back to StringBuilder.
        StringBuilder sb4 = new StringBuilder(sb3);

        sb3.reverse();
        System.out.println(sb3);//oxxxxxxlF

        sb3.deleteCharAt(1);
        System.out.println(sb3);//oxxxxxlF

        sb3.delete(1,6);
        System.out.println(sb3);//olF

        StringBuilder sb5 = new StringBuilder("Kava");
        StringBuilder sb6 = new StringBuilder("Java");

        //The compareTo() method compares StringBuilders in alphabetical order.
        //If sb5 is before sb6 in the alphabetical order, the result will be negative, if it is after, the result will be positive.
        System.out.println(sb5.compareTo(sb6));//1

        sb6.setCharAt(2,'m');
        System.out.println(sb6);//Jama

        sb6.replace(1,3,"xyz");
        System.out.println(sb6);//Jxyza

        /*
        There are some String Class methods, such as the substring() method, that we are allowed to use in the StringBuilder
        Class. When we use these methods on StringBuilder, the original value of StringBuilder does not change.
         */
        String s7 = sb6.substring(1,3);
        System.out.println(s7);//xy
        System.out.println(sb6);//Jxyza
    }

}