package s15_varargs;

public class Varargs {

    public static void main(String[] args) {

        addTwoNumbers(3, 5);//8
        addThreeNumbers(4, 7, 2);//13

        add();//0
        add(4);//4
        add(4,7);//11
        add(3,2,5,6);//16
        add(4, 5, 6, 7, 8, 9, 10);//49

    }

    //Create a method that adds two numbers.
    public static void addTwoNumbers (int a, int b){
        System.out.println(a + b);
    }

    //Create a method that adds three numbers.
    public static void addThreeNumbers (int a, int b, int c){
        System.out.println(a + b + c);
    }

    //Create a method that adds the desired number of numbers.
    public static void add (int... a){
        int sum = 0;
        for (int w : a){
            sum += w;
        }
        System.out.println(sum);
    }
}