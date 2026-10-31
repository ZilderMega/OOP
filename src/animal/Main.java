package animal;

import animal.animals.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во животных");
        int n = scanner.nextInt();

        Voiceable[] animals = new Voiceable[n];
        System.out.println("Что добавить:" +
                "\n1 - собака" +
                "\n2 - кот" +
                "\n3 - корова");
        byte count;
        int i = 0;
        while (i < n) {
            count = scanner.nextByte();
            if (count == 1) {
                animals[i] = new Dog();
                i++;
            } else if (count == 2) {
                animals[i] = new Cat();
                i++;
            } else if (count == 3) {
                animals[i] = new Cow();
                i++;
            }
        }

        for (Voiceable voiceable : animals) {
            voiceable.sound();
        }

    }
}
