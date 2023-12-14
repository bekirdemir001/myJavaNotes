package s13_loops.forloops;

public class NestedForLoop {
    /*
    Write the code that will give the following output.
        Week: 1
            Day: 1
            Day: 2
            Day: 3
            ......
        Week: 2
            Day: 1
            Day: 2
            Day: 3
            ......
        Week: 3
            Day: 1
            Day: 2
            Day: 3
            ......
     */
    public static void main(String[] args) {
        for (int i=1; i<4; i++){
            System.out.println("Week: " + i);
            for (int j=1; j<8; j++){
                System.out.println("    Day: " + j);
            }
        }
    }

}