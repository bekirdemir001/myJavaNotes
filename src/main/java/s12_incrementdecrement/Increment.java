package s12_incrementdecrement;

public class Increment {

    public static void main(String[] args) {

        //Increment 1:
        int a = 10;
        System.out.println(a);//10

        a = a + 5;
        System.out.println(a);//15

        a += 5;
        System.out.println(a);//20

        //Increment 2:
        int b = 6;
        System.out.println(b);//6

        b = b * 2;
        System.out.println(b);//12

        b *= 2;
        System.out.println(b);//24

        // Increment by 1
        int c = 12;
        c = c + 1;
        c += 1;
        c++;
        System.out.println(c);//15

        //"post-increment" ve "pre-increment"
        int d = 10;
        int e = d++;//post-increment

        System.out.println(d);//11 --> Since d is incremented at the end of the line, the value of d is 11.
        System.out.println(e);//10 --> Since Java assigns d to e before incrementing it, the value of e is 10.

        int f = 15;
        int g = ++f;//pre-increment

        System.out.println(f);//16 --> Since f is incremented at the end of the line, the value of f is 16.
        System.out.println(g);//16 --> Since Java assigns f to g after incrementing it, the value of g is 16.

    }
}