package les2.fixed;

public class LightWeightCar extends Car implements Moveable, Openable{


    public void open() {
        System.out.println("Car is open");
    }

    public void move() {
        System.out.println("Car is moving");
    }

}
