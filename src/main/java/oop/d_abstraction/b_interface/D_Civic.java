package oop.d_abstraction.b_interface;

public class D_Civic implements A_AirCondition, B_Engine, C_Security {

    @Override
    public void cool() {
        System.out.println("Civic cools perfectly");
    }

    @Override
    public void run() {
        System.out.println("AC runs perfectly");
    }
}
/*
    1)Bir interface i bir Class ın parent i yapmak için "implements" keyword unu kullanırız.
    2)Java, parent ler Class olduğunda "multiple parent" a müseade etmez ama biz bazen "multiple parent" a ihtiyaç
    duyarız. Bu ihtiyacı gidermek için Java, "interface" ismini verdiği yeni bir yapı oluşturdu. Bu yapı sayesinde
    bir Class için çoklu "interface parent" oluşturabiliriz.
    3)Çoklu interface parent lerin herbirinin içine aynı isimli method lar koyabiliriz. Mesela AC nin, Engine nin
    ve Security nin içlerine "run()" koymak gibi.
    Child Class herhangi birini override ettiğinde hepsini override etmiş olur sonrada body yi Child Class da yazarak
    uygulamasını yapmış olur.
*/