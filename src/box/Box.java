package box;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box() {
        this(10);
    }

    public Box(Box another) {
        this(another.length, another.width, another.height);
    }

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }


    public void setDimens(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;

    }

    public Box(double size) {
        this(size, size, size);
    }

    private double getVolume() {
        return this.length * this.width * this.height;
    }

    public void showVolume(){
        System.out.println(getVolume());
    }

    public int compare(Box another) {
        double currentVolume = getVolume();
        double anotherVolume = another.getVolume();
        int result;
        if (currentVolume > anotherVolume) {
            result = 1;
        }
        else if (currentVolume < anotherVolume) {
            result = -1;        }
        else {
            result = 0;        }
        return result;
    }

    public Box copy() {
        return new Box(this.length, this.width, this.height);
    }

    public Box increase() {
        return new Box(this.length * 2, this.width * 2, this.height * 2);
    }

    public void showInfo() {
        System.out.println(length + " " + width + " " + height);
    }
}
