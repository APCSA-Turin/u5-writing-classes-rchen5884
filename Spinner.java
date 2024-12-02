public class Spinner {
    private int value;
    private int sections;
    private int spinNum;
    private int spinSum;

    // Constructor to initialize the spinner with a given number of sections
    public Spinner(int sections) {
        this.sections = sections;
        this.value = 0;
        this.spinNum = 0;
        this.spinSum = 0;
    }

    // Method to spin the spinner, which updates the current spin value
    public void spin() {
        value = (int) (Math.random() * sections) + 1; // Random value between 1 and sections
        spinNum++;
        spinSum += value;
    }

    // Method to get the current (most recent) spin value
    public int getCurrentSpin() {
        return value;
    }

    // Method to get the total number of spins
    public int getSpinCount() {
        return spinNum;
    }

    // Method to get the sum of all spins
    public int getSpinSum() {
        return spinSum;
    }

    // Method to get the average spin value
    public double getAverageSpin() {
        return spinNum > 0 ? (double) spinSum / spinNum : 0.0;
    }
}
