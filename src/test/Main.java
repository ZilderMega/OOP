package test;

public class Main {
    static void main(String[] args) {
        Daytime current = Daytime.MORNING;
        String message = getMessage(current);
        System.out.println(message);    // Доброе утро

        message = getMessage(Daytime.EVENING);
        System.out.println(message);    // Добрый вечер
    }

    static String getMessage(Daytime dt) {

        return switch (dt) {
            case MORNING -> "Доброе утро";
            case AFTERNOON -> "Добрый день";
            case EVENING -> "Добрый вечер";
            case NIGHT -> "Доброй ночи";
        };

    }
}