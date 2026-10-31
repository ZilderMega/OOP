package inheritance;

public class Lion extends CatFamily{
    public Lion() {
        super();
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("антилопу");
    }
}
