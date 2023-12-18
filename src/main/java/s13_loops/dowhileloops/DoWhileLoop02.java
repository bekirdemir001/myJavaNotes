package s13_loops.dowhileloops;

import java.util.Scanner;

public class DoWhileLoop02 {

    /*
    Valid Username = "admin" and Password = "psw123".
         Get Username and Password from the user.
         If the Username and Password are correct, click on the console "Welcome to your Account!" print.
         If Username and Password are incorrect, print "Enter your Username and Password" 3 times.
         If Username and Password are entered incorrectly for the 4th time, complete the process by giving the message
         "Your Account Has Been Blocked".
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte counter = 3;

        do {
            if (counter==0){
                System.out.println("Your Account Has Been Blocked");
                break;
            }
            System.out.println("Enter username");
            String username = scanner.nextLine();

            System.out.println("Enter password");
            String password = scanner.nextLine();

            if (username.equals("admin") && password.equals("psw123")){
                System.out.println("Welcome to your Account!");
                break;
            } else {
                counter--;
                System.out.println("Your Reminder Rights: " + counter);
            }

        }while (true);

        scanner.close();
    }
}
