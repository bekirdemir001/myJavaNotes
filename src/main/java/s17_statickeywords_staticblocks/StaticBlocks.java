package s17_statickeywords_staticblocks;

public class StaticBlocks {

    static double pi;
    static String shape;

    static {
        pi = 3.14;//This code assigns the value to static variable "pi".
        System.out.println("Static block 1");//This code printed first.
    }

    static {
        shape = "Circle";//This code assigns the value to static variable "shape".
        System.out.println("Static block 2");//This code printed second.
    }

    public static void main(String[] args) {
        System.out.println("Main method");//This code printed third.
    }

}