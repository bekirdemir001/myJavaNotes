package oop.b_polymorphism.a_methodoverloading;

public class MethodOverloading {

    public static void main(String[] args) {

        add (3,5);//8
        add(3.0, 4.0);//7.0
        add(3.0, 2);//5.0
        add(3, 3.0);//6.0
        add(2, 3, 4);//9
    }

    private static void add(int a, int b){
        System.out.println(a+b);
    }

    //1. Data types of parameters can be changed.
    public static void add(double a, double b){
        System.out.println(a+b);
    }

    //2. If the data types of the parameters are different, their locations can be changed.
    public static void add(double a, int b){
        System.out.println(a+b);
    }
    public static void add(int a, double b){
        System.out.println(a+b);
    }

    //3. The number of parameters can be changed.
    public static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }

}