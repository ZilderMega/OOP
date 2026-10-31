package inheritance;

public class Waiter implements Oficiant {
    @Override
    public void give(String name) {
        System.out.println("Принес заказ " + name);
    }
}
