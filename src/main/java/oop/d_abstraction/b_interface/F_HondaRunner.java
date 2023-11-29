package oop.d_abstraction.b_interface;

public class F_HondaRunner {
    public static void main(String[] args) {

        D_Civic myCivic = new D_Civic();
        myCivic.cool();
        System.out.println(A_AirCondition.price);
        System.out.println(A_AirCondition.model);
        System.out.println(B_Engine.price);
        System.out.println(C_Security.price);

        E_Accord myAccord = new E_Accord();
        myAccord.cool();

    }
}