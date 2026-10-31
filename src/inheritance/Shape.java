package inheritance;

public abstract class Shape {
    private double a;
    private double b;

    public Shape(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Shape() {
        this(0, 0);
    }

    public final double getB() {
        return b;
    }

    public final double getA() {
        return a;
    }

    public abstract double perimeter();
}
