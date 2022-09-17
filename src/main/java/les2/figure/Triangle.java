package les2.figure;

public class Triangle extends Figure {

    String type;
    private double a;
    private double b;
    private double c;

    public Triangle(String type) {
        super(type);
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double area() {
        double p = (a+b+c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }

    @Override
    public double perimeter() {
        return a+b+c;
    }
}
