package enums;

public class Task2 {
    public static void main(String[] args) {
        soundAll();
    }

    public static void soundAll() {
        for (Animal element : Animal.values()) {
            element.sound();
        }
    }
}
