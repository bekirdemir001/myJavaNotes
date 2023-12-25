package s20_string_stringbuilder_stringbuffer;

public class StringBuffer01 {

    public static void main(String[] args) {

        StringBuffer sbf = new StringBuffer("Java");
        System.out.println(sbf);//Java
        sbf.append(" has a OOP consept");
        System.out.println(sbf);//Java has a OOP consept
    }

}