package inheritance;

public class Rectangle extends Shape {

    public Rectangle(double a, double b) {
        super(a, b);
    }

    public Rectangle() {
        super();
    }


    @Override
    public double perimeter() {
        return (getA() + getB()) * 2;
    }
}
