package s13_loops.forloops;

public class ForLoop07 {

    /*
    Type the code that prints all characters except 'a' in a given String
         // "Madagascar" --> Mdgscr
     */
    public static void main(String[] args) {

        String str = "Madagascar";

        //1. Way: replace() method
        String str2 = str.replace("a", "");
        System.out.println(str2);

        //2. Way: For-Loop
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch != 'a'){
                System.out.print(ch);
            }
        }

        System.out.println();

        //3. Way: For-Loop (using continue keyword)
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch == 'a'){
                continue;
            }
            System.out.print(ch);
        }

    }
}