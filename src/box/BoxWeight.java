package box;

public class BoxWeight extends Box {

    private double weight;


    public BoxWeight() {
        this.weight = 10;
    }


    public BoxWeight(Box another, double weight) {
        super(another);
        this.weight = weight;
    }

    public BoxWeight(double weight) {
        this.weight = weight;
    }

    public BoxWeight(double length, double width, double height, double weight) {
        super(length, width, height);
        this.weight = weight;
    }

    public BoxWeight(double size, double weight) {
        super(size);
        this.weight = weight;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.print(weight);
    }
}
