package figure;

public class Square extends Figure {
    public Square(int a) {
        setA(a);
    }

    @Override
    public void draw() {
        int countSpace = getA();
        System.out.println(this.space + this.length.repeat(getA()));
        for (int i = 0; i < getA() - 2; i++) {
            System.out.println(this.width + this.space.repeat(getA()) + this.width);
        }
        System.out.println(this.space + this.length.repeat(getA()));
    }
}
