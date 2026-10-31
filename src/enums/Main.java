package enums;

import java.util.Scanner;

import static enums.Dictionary.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sayWord = scanner.nextLine();
        scanner.close();

        Dictionary word = Dictionary.getConstant(sayWord);

        System.out.println(word.getAnswer());
    }
}
