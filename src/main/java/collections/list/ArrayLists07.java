package collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLists07 {

    /*
    Get the product name from the customer. If the product the customer is looking for is in the List, print that name.
    If not, print "Out of Stock".
     */
    public static void main(String[] args) {

        List<String> products = new ArrayList<>();
        products.add("TV");
        products.add("Radio");
        products.add("iPad");
        products.add("PC");
        products.add("Notebook");
        products.add("Mobile Phone");

        Scanner scanner = new Scanner(System.in);
        System.out.println("*********** WELCOME ************");
        System.out.println("For exit, press Q");

        for (String w : products){
            String newProduct = w.toLowerCase();
            products.set(products.indexOf(w), newProduct);
        }

        do {
            System.out.println("Enter a product name you are looking for");
            String product = scanner.nextLine().toLowerCase();

            if (product.equalsIgnoreCase("Q")){
                break;
            } else if (products.contains(product)){
                System.out.println(product + " is in stock");
            }else {
                System.out.println(product + " is out of stock!");
            }
        }while (true);

        System.out.println("******* Thanks for visiting our site, see you later *******");

        scanner.close();
    }
}