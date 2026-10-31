package figure;

public abstract class Figure {
    private int a;

    protected final String length = "-";
    protected final String width = "|";
    protected final String right = "/";
    protected final String left = "\\";
    protected final String space = " ";

    protected int getA() {
        return this.a;
    }

    protected void setA(int a) {
        this.a = a;
    }

    public abstract void draw();
}
