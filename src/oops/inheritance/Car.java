package oops.inheritance;

public class Car extends Vehicle {
    private String modelName = "Mustang";  //attribute
    public static void main(String[] args) {


        Car myCar = new Car();
        System.out.println(myCar.modelName);

        Vehicle obj1 = new Vehicle();

        // obj1.honk();
        myCar.honk();
        
    }
}
