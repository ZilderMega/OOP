package Task2;

public class Task implements Talkable {
    @Override
    public void hi() {
        System.out.println("Hello");
    }

    @Override
    public void bye() {
        System.out.println("Bye");
    }

    @Override
    public void howAreYou() {
        System.out.println("How are your doing");
    }

    @Override
    public void unknown() {
        System.out.println("Unknown message");
    }
}
