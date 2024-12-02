public class Dice {
    private int sides;
    private int count = 0;
    private int roll = 0;

    public Dice(int sides) {
        this.sides = sides;
    }

    // getter methods

    public int getSides() {
        return sides;
    }

    public int getRollValue() {
        return roll;
    }

    public int getRollCount() {
        return count;
    }

    // setter method

    public void setSides(int newSide) {
        sides = newSide;
    }

    public void roll() {
        roll = (int) (Math.random() * sides + 1);
        count++;
    }

}
