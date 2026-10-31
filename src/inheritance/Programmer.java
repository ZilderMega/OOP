package inheritance;

public class Programmer implements Worker, Driver {
    @Override
    public void work() {
        System.out.println("Кодю");
    }

    @Override
    public void drive() {
        System.out.println("Программист везёт");
    }
}
