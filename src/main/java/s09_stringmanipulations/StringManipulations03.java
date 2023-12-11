package s09_stringmanipulations;

public class StringManipulations03 {
    public static void main(String[] args) {

        String str = "Bekir is 33 years old!...";

        //Example 1: replaceAll(String regex, String replacement)
        String str1 = str.replaceAll("[0-9]", "*");
        System.out.println(str1);//Bekir is ** years old!...

        //Example 2: replaceAll(String regex, String replacement)
        String str2 = str.replaceAll("[a-zA-Z0-9]", "&");
        System.out.println(str2);//&&&&& && && &&&&& &&&!...

        //Example 3: replaceAll(String regex, String replacement)
        String str3 = str.replaceAll("[aeiouAEIOU]", "?");
        System.out.println(str3);//B?k?r ?s 33 y??rs ?ld!...

        //Example 4: replaceAll(String regex, String replacement)
        String str4 = str.replaceAll("[^a-z]", "<>");
        System.out.println(str4);//<>ekir<>is<><><><>years<>old<><><><>

        //Example 5: replaceAll(String regex, String replacement)
        String str5 = str.replaceAll("[^a-zA-Z]", "+");
        System.out.println(str5);//Bekir+is++++years+old++++

        //Example 6: replaceAll(String regex, String replacement)
        String str6 = str.replaceAll("[^ ]", "-");
        System.out.println(str6);//----- -- -- ----- -------

        //Example 7: replaceAll(String regex, String replacement)
        String str7 = str.replaceAll("[^aeiouAEIOU]", "#");
        System.out.println(str7);//#e#i##i######ea###o######
    }
}