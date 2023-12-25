package s18_constructors;

public class CarRunner {
    public static void main(String[] args) {

        Car c1 = new Car("BMW", "M4", 2023, false);
        Car c2 = new Car("Audi", "R8");
        Car c3 = new Car("Honda", 1999);

        System.out.println(c1);//Car{make='BMW', model='M4', year=2023, hybrid=false}
        System.out.println(c2);//Car{make='Audi', model='R8', year=0, hybrid=false}
        System.out.println(c3);//Car{make='Honda', model='null', year=1999, hybrid=false}
    }

}