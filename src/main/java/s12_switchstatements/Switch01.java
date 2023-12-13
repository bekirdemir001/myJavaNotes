package s12_switchstatements;

import java.util.Scanner;

public class Switch01 {

    /*
    Get the day names from the user and type the code that prints which day it is.
         Sunday --> 1, Saturday --> 7
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day name");
        String dayName = scanner.next();

        switch (dayName.toLowerCase()){
            case "sunday":
                System.out.println(1);
                break;
            case "monday":
                System.out.println(2);
                break;
            case "tuesday":
                System.out.println(3);
                break;
            case "wednesday":
                System.out.println(4);
                break;
            case "thursday":
                System.out.println(5);
                break;
            case "friday":
                System.out.println(6);
                break;
            case "saturday":
                System.out.println(7);
                break;
            default:
                System.out.println("Please enter a valid day name!");
        }

        scanner.close();
    }
}
