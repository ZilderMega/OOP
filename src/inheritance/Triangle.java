package inheritance;

public class Triangle extends Shape {
    private double c;

    public Triangle(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }

    public Triangle() {
        super();
        this.c = 0;
    }

    @Override
    public double perimeter() {
        return getA() + getB() + this.c;
    }
}
