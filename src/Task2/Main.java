package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = scanner.nextLine();
        scanner.close();

        Task talkable = new Task();

        switch (s) {
            case "Hi":
                talkable.hi();
                break;

            case "Bye":
                talkable.bye();
                break;

            case "How are you":
                talkable.howAreYou();
                break;

            default:
                talkable.unknown();
        }
    }
}
