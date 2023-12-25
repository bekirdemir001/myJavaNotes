package s16_passbyvalue_passbyreference;

public class PassByValue01 {
    public static void main(String[] args) {

        double shirt = 100;

        double studentShirtPrice = discount("student", shirt);
        double veteranShirtPrice = discount("veteran", shirt);
        double seniorShirtPrice = discount("senior", shirt);

        System.out.println(shirt);//100.0

        System.out.println(studentShirtPrice);//90.0
        System.out.println(veteranShirtPrice);//80.0
        System.out.println(seniorShirtPrice);//95.0

        System.out.println(shirt);//100.0
    }

    public static double discount (String state, double price) {
        switch (state){
            case "student":
                price = price * 0.90;
                break;
            case "veteran":
                price = price * 0.80;
                break;
            case "senior":
                price = price * 0.95;
                break;
        }
        return price;
    }

}