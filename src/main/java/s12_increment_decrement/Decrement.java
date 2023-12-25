package s12_increment_decrement;

public class Decrement {

    public static void main(String[] args) {

        //Decrement 1:
        int a = 8;
        System.out.println(a);//8

        a = a - 2;//or a -= 2;
        System.out.println(a);//6

        a -= 2;
        System.out.println(a);//4

        //Decrement 2:
        int b = 24;
        System.out.println(b);//24

        b = b / 2;
        System.out.println(b);//12

        b /= 2;
        System.out.println(b);//6

        // Decrement by 1
        int c = 10;
        c = c - 1;
        c -= 1;
        c--;
        System.out.println(c);//7

        //"post-decrement" ve "pre-decrement"
        int d = 17;
        int e = d--;//post-decrement

        System.out.println(d);//16 --> Since d is decremented at the end of the line, the value of d is 16.
        System.out.println(e);//17 --> Since Java assigns d to e before incrementing it, the value of e is 17.

        int f = 20;
        int g = --f;//pre-decrement çünkü increment variable ın isminden önce yazıldı.

        System.out.println(f);//19 --> Since f is incremented at the end of the line, the value of f is 19.
        System.out.println(g);//19 --> Since Java assigns f to g after incrementing it, the value of g is 19.
    }
}