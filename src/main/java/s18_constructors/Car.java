package s18_constructors;

public class Car {

    String make ;
    String model;
    int year;
    boolean hybrid;

    public Car (String make, String model, int year, boolean hybrid){
       this.make = make;
       this.model = model;
       this.year = year;
       this.hybrid = hybrid;
   }

   public Car (String make, String model){
       this.make = make;
       this.model = model;
   }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }

}