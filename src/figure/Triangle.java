package figure;

public class Triangle extends Figure {

    public Triangle(int a) {
        setA(a);
    }

    @Override
    public void draw() {
        int countBottom = 1;
        int countSpace = getA() - 1;
        for (int i = 0; i < getA(); i++) {
            if (i > 0) {
                System.out.println(this.space.repeat(countSpace) + this.right + this.space.repeat(countBottom) + this.left);
                countSpace -= 1;
                countBottom += 2;
            }
            else {
                System.out.println(this.space.repeat(countSpace) + this.right + this.left);
                countSpace -= 1;
                countBottom *= 2;
            }
        }
        System.out.println(this.space + this.length.repeat(countBottom-2));
    }

}
