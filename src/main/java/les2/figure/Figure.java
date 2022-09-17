package les2.figure;

public abstract class Figure {

    private String type;

    public Figure(String type) {
        this.type = type;
    }

    public abstract double area();
    public abstract double perimeter();
}
