public class Person {
    private String firstName;
    private String lastName;
    private int meetCount;

    // Constructor to initialize the first name and last name
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.meetCount = 0;
    }

    // Method for meeting another person, printing introductions and increasing meeting counts
    public void meet(Person other) {
        System.out.println("Hello, my name is " + this.firstName + ".");
        System.out.println("Hi, my name is " + other.firstName + ".");
        this.meetCount++;
        other.meetCount++;
    }

    // Getter for the first name
    public String getFirstName() {
        return firstName;
    }

    // Setter for the first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter for the last name
    public String getLastName() {
        return lastName;
    }

    // Setter for the last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Method to get the number of meetings the person has had
    public int getMeetCount() {
        return meetCount;
    }
}
