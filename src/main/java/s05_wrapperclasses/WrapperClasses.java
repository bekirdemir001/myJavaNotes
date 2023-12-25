package s05_wrapperclasses;

public class WrapperClasses {
    public static void main(String[] args) {

        int n = 12;
        Integer m = 12;

        byte p = 23;
        Byte r = 43;

        short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort);//32767
        short minShort = Short.MIN_VALUE;
        System.out.println(minShort);//-32768

        int minInteger = Integer.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println(minInteger + maxByte);//-2147483521

        //Autoboxing
        int number = 22;
        Integer wrapperNumber = number;
        System.out.println(wrapperNumber);


        //Unboxing
        Boolean isOld = false;
        boolean isOldWrapper = isOld;
        System.out.println(isOldWrapper);

        //Example:
        String shirt = "2300";
        String shoes = "5200";

        System.out.println(shirt+shoes);//23005200

        int sumOfPrices = Integer.valueOf(shirt) + Integer.valueOf(shoes);
        System.out.println(sumOfPrices);//7500

        //Example2:
        String tv = "$11000";
        String radio = "$3000";

        System.out.println(tv + radio);//$11000$3000

        //Int totalPrice = Integer.valueOf(tv) + Integer.valueOf(radio);
        //Throw NumberFormatException. That is, if a String has characters out of digits, valueOf() method doesn't run.
    }
}