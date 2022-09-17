package les2.fixed;

public class Lorry extends Car implements Moveable, Stopable{

    // Тут не хватало имплементированного интерфейса.
    // можно создать еще один интерфейс для метода open(), и убрать его из класса Car.

    public void move(){
        System.out.println("Car is moving");
    }
    public void stop(){
        System.out.println("Car is stop");
    }
}
