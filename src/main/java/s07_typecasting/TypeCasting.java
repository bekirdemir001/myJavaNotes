package s07_typecasting;

public class TypeCasting {
    public static void main(String[] args) {

        //Example 1:
        byte age = 14;
        int ageInt = age;//Auto Widening

        //Example 2:
        long weight = 238;
        short weightShort = (short) weight;//Explicit Narrowing

        //Example 3:
        int population = 7000000;
        System.out.println(population);//7000000

        float populationFloat = population;//Auto Widening
        System.out.println(populationFloat);//7000000.0

        //Example 4:
        double number = 12.931;
        System.out.println(number);//12.931

        short numberShort = (short) number;//Explicit Narrowing
        System.out.println(numberShort);//12

        //Example 5:
        short num = 260;
        System.out.println(num);//260

        byte numByte = (byte) num;
        System.out.println(numByte);//4

        //Example 6:
        short n = 1023;
        System.out.println(n);//1023

        byte nByte = (byte) n;
        System.out.println(numByte);//4
    }
}