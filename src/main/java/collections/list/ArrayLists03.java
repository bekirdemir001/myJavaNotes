package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists03 {

    /*
    Create the Salary List and raise salaries according to the following rules.
        1. 20% for those whose salary is below 5000
        2. 15% for those whose salary is below 7500
        3. 10% for those whose salary is below 10000
        4. 5% for those whose salary is 10000 and above
     */
    public static void main(String[] args) {

        //1.Way: For-Each-Loop (Recommended)
        List<Double> salaries = new ArrayList<>();
        salaries.add(12500.25);
        salaries.add(8350.50);
        salaries.add(4500.75);
        salaries.add(7500.25);
        salaries.add(9000.00);
        salaries.add(6000.50);
        salaries.add(4750.75);


        int index = 0;
        for (Double w : salaries){
            if (w<5000){
                salaries.set(index, salaries.get(index)*1.20);
                index++;
            } else if (w<7500) {
                salaries.set(index, salaries.get(index)*1.15);
                index++;
            } else if (w<10000) {
                salaries.set(index, salaries.get(index)*1.10);
                index++;
            }else {
                salaries.set(index, salaries.get(index)*1.05);
                index++;
            }
        }

        System.out.println(salaries);//[13125.26, 9185.55, 5400.9, 8250.27, 9900.0, 6900.57, 5700.9]

        //2.Way: For-Loop
        List<Double> salaries2 = new ArrayList<>();
        salaries2.add(12500.25);
        salaries2.add(8350.50);
        salaries2.add(4500.75);
        salaries2.add(7500.25);
        salaries2.add(9000.00);
        salaries2.add(6000.50);
        salaries2.add(4750.75);

        for (int i = 0; i< salaries2.size(); i++){
            if (salaries2.get(i)<5000){
                salaries2.set(i, salaries2.get(i)*1.20);
            } else if (salaries2.get(i)<7500) {
                salaries2.set(i, salaries2.get(i)*1.15);
            } else if (salaries2.get(i)<10000) {
                salaries2.set(i, salaries2.get(i)*1.10);
            }else {
                salaries2.set(i, salaries2.get(i)*1.05);
            }
        }
        System.out.println(salaries2);//[13125.26, 9185.55, 5400.9, 8250.27, 9900.0, 6900.57, 5700.9]

        //3.Way: While-Loop
        List<Double> salaries3 = new ArrayList<>();
        salaries3.add(12500.25);
        salaries3.add(8350.50);
        salaries3.add(4500.75);
        salaries3.add(7500.25);
        salaries3.add(9000.00);
        salaries3.add(6000.50);
        salaries3.add(4750.75);

        int i = 0;
        while (i< salaries3.size()){
            if (salaries3.get(i)<5000){
                salaries3.set(i, salaries3.get(i)*1.20);
            } else if (salaries3.get(i)<7500) {
                salaries3.set(i, salaries3.get(i)*1.15);
            } else if (salaries3.get(i)<10000) {
                salaries3.set(i, salaries3.get(i)*1.10);
            }else {
                salaries3.set(i, salaries3.get(i)*1.05);
            }
            i++;
        }
        System.out.println(salaries3);//[13125.26, 9185.55, 5400.9, 8250.27, 9900.0, 6900.57, 5700.9]
    }
}