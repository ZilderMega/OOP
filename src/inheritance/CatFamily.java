package inheritance;

public class CatFamily {
    protected int legs;
    protected int eyes;

    public boolean isCanEatPerson() {
        return canEatPerson;
    }

    public int getLegs() {
        return legs;
    }

    public int getEyes() {
        return eyes;
    }

    protected boolean canEatPerson;

    public CatFamily(int legs, int eyes, boolean canEatPerson) {
        this.legs = legs;
        this.eyes = eyes;
        this.canEatPerson = canEatPerson;
    }

    public CatFamily() {
        legs = 4;
        eyes = 2;
        canEatPerson = true;
    }

    public void eat() {
        System.out.println("Кушаю");
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setCanEatPerson(boolean canEatPerson) {
        this.canEatPerson = canEatPerson;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }
}
