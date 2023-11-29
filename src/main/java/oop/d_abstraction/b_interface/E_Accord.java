package oop.d_abstraction.b_interface;

public class E_Accord implements A_AirCondition, B_Engine, C_Security {

    @Override
    public void cool() {
        System.out.println("Accord cools super");
    }

    @Override
    public void run() {
        System.out.println("Engine run super");
    }
}