package s17_statickeywords_staticblocks;

public class StaticKeywordRunner {

    public static void main(String[] args) {
        //We did not create an object to access "stdName" because "stdName" is static.
        //Just using the Class name is sufficient.
        System.out.println(StaticKeyword.stdName);//Tom Hanks

        //We have to create an object to reach "age" because "age" is non-static.
        StaticKeyword std1 = new StaticKeyword();
        System.out.println(std1.age);//13

        String initials = StaticKeyword.getInitials("Julia Roberts");
        System.out.println(initials);//JR

        int vowels = std1.countVowels("Morgan Freeman");
        System.out.println(vowels);//5

        //Static method can also be called via an object, but it is not recommended.
        String s = std1.getInitials("Tom Cruise");
        System.out.println(s);//TC
    }

}