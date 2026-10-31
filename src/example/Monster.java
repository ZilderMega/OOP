package example;

public class Monster {
    int eye;
    int hand;
    int leg;

    public Monster(int eye, int hand, int leg) {
        this.eye = eye;
        this.hand = hand;
        this.leg = leg;
    }

    public Monster(int count) {
        this(count, count, count);
    }

    public Monster() {
        this(2);
    }

    static void voice() {
        voice(1,"Grrrrrrrrrr...");
    }

    static void voice(int count, String word) {
        for (int i = 0; i < count; i++) {
            System.out.println(word + " ");
        }
    }

    static void voice(int count) {
        voice(count,"Grrrrrrrrrr...");
    }

}
