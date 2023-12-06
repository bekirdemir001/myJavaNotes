package s03_methodcreation;

public class MethodCreation {
     /*
        1. Create and use the method that calculates the area of the rectangle.
        2. Create and use the method that calculates the perimeter of the rectangle.
        3. Create and use the method that calculates the area of the circle.
        4. Create and use the method that calculates the circumference of the circle.
        5. Create and use the method that calculates the volume of the cube and print the result.
     */
     public static void main(String[] args) {

         int square1 = squareOfRectangle(3,5);
         System.out.println("Square Of a Rectangle: " + square1);//15

         int perimeter1 = perimeterOfRectangle(3,5);
         System.out.println("Perimeter of a Rectangle" + perimeter1);//16

         double square2 = squareOfCircle(3);
         System.out.println("Square Of a Circle: " + square2);//28.259999999999998

         double perimeter2 = perimeterOfCircle(3);
         System.out.println("Perimeter of a Circle: " + perimeter2);//18.84

         volumeOfCube(5);//125.0
     }

    public static int squareOfRectangle(int width, int length){
        return width*length;
    }

    protected static int perimeterOfRectangle(int width, int length){
        return 2*(width+length);
    }

    static double squareOfCircle(int radius){
        double pi = 3.14;
        return pi*radius*radius;
    }

    private static double perimeterOfCircle(int radius){
        double pi = 3.14;
        return 2*pi*radius;
    }

    public static void volumeOfCube(int length){
         double volume = Math.pow(length, 3);
        System.out.println("Volume of a Cube: " + volume);
    }
}