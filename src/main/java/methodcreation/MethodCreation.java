package methodcreation;

public class MethodCreation {
     /*
        1. Create and use the method that calculates the area of the rectangle.
        2. Create and use the method that calculates the perimeter of the rectangle.
        3. Create and use the method that calculates the area of the circle.
        4. Create and use the method that calculates the circumference of the circle.
     */
     public static void main(String[] args) {

         int square1 = squareOfRectangle(3,5);
         System.out.println(square1);//15

         int perimeter1 = perimeterOfRectangle(3,5);
         System.out.println(perimeter1);//16

         double square2 = squareOfCircle(3);
         System.out.println(square2);//28.259999999999998

         double perimeter2 = perimeterOfCircle(3);
         System.out.println(perimeter2);//18.84
     }

    public static int squareOfRectangle(int width, int length){
        return width*length;
    }

    protected static int perimeterOfRectangle(int width, int length){
        return 2*(width+length);
    }

    public static double squareOfCircle(int radius){
        double pi = 3.14;
        return pi*radius*radius;
    }

    protected static double perimeterOfCircle(int radius){
        double pi = 3.14;
        return 2*pi*radius;
    }
}