package les2.figure;

public class Square extends Figure{

    String type;
    private double a;
    private double b;

    public Square(String type) {
        super(type);

    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double area() {
        return a*b;
    }

    @Override
    public double perimeter() {
        return (a+b)*2;
    }
}
