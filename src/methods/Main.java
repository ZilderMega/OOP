package methods;

import methods.Animals.*;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog(),
                new Cat(),
                new Cow()
        };

        for (Animal animal : animals) {
            if (animal.getClass() == Cat.class) {
                ((Cat) animal).meow();
            } else if (animal.getClass() == Dog.class) {
                ((Dog) animal).woof();
            }
            else if (animal.getClass() == Cow.class) {
                ((Cow) animal).moo();
            }
        }
    }
}
