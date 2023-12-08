package s08_swapoperations;

public class SwapOperations {
    public static void main(String[] args) {

        int firstNumber = 8;
        int secondNumber = 17;

        //1. Way: Using temporary variable
        int temp = 0;

        temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        System.out.println("-------1. Way-------");
        System.out.println(firstNumber);
        System.out.println(secondNumber);

        //2. Way: Mathematical operations
        int thirdNumber = 7;
        int fourthNumber = 14;

        thirdNumber = thirdNumber + fourthNumber;
        fourthNumber = thirdNumber - fourthNumber;
        thirdNumber = thirdNumber - fourthNumber;

        System.out.println("-------2. Way-------");
        System.out.println(thirdNumber);
        System.out.println(fourthNumber);
    }
}
