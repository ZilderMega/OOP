package interfaces;
import inheritance.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        Animal animal = new Bird();

        Client client = new Client();
        client.did(new Oficiant() {
            @Override
            public void give(String name) {
                System.out.println("Я принес " + name);
            }
        }, "Козинаха");
    }
}
