package inheritance;

public class Cook implements Worker, Driver {
    @Override
    public void work() {
        System.out.println("Варю");
    }

    @Override
    public void drive() {
        System.out.println("Повар везёт");
    }
}
