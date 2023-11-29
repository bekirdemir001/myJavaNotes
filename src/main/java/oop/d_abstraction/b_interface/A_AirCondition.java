package oop.d_abstraction.b_interface;

public interface A_AirCondition {

    int price = 2000;

    String model = "Mitsubishi";

    void cool();

    void run();

}
/*
    1)interface lerin içine "concrete" method KONULAMAZ. Çünkü "concrete" method larda body vardır ve body o method un
    işi nasıl yapacağını belirtir. İşin nasıl yapılacağı bir çok detay içerir ve bu Child Class larda kafa
    karışıklığına sebeb olur. Halbuki sadece yapılması gereken işi söyleyip nasıl yapılacağını Child e bırakırsak
    Child Class ın kafa karışıklığını engellemiş oluruz.
    2)interface lerdeki tüm method lar otamatik olarak "public", "abstract" ve "static" değildir.
    3)interface ler "concrete" method içermezler, dolayısıyla interface in içindeki hiçbirşey isteğe bağlı değildir.
    Herşey Child Class lar için mecburidir. Bu yüzden interface lere "to-do list" de denir.
    4)interface lerdeki variable ler  otamatik olarak "public", "static" ve "final" dir.
    5)interface ler class değildir. Interface ler interface dir.
    6)OOP nin 4. prensibi olan Abstraction 2 bölümden oluşur. Bunlar; abstract class ve interface dir. Abstract class
     ların içine hem abstract hem de concrete methodlar konulabiliyor. Bu yüzden abstract class lara "semi abstract"
     denir. Fakat interface ler de concrete method olamaz hepsi abstract olmalıdır. Bu yüzden interface lere
      "fully abstract" denir.
    7)interface lerin Constructor ları YOKTUR.
     */