package enums;

public class UsStatesRunner {
    public static void main(String[] args) {

        String stateNameOfAlaska = UsStates.ALASKA.getStateName();
        String stateAbbreviationOfAlaska = UsStates.ALASKA.getAbbreviation();
        String stateCapitalOfAlaska = UsStates.ALASKA.getCapital();

        System.out.println("State Name Of Alaska = " + stateNameOfAlaska);
        System.out.println("State Abbreviation Of Alaska = " + stateAbbreviationOfAlaska);
        System.out.println("State Capital Of Alaska = " + stateCapitalOfAlaska);

    }
}