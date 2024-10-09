package ProblemThree;

public class Person {
    private String firstName;
    private String lastName;
    private Address address;

    // Default constructor
    public Person() {
        this("", "", new Address());
    }

    // Parameterized constructor
    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = new Address(address);
    }

    // Copy constructor
    public Person(Person other) {
        this.firstName = other.firstName;
        this.lastName = other.lastName;
        this.address = new Address(other.address);
    }

    // toString method
    @Override
    public String toString() {
        return firstName + " " + lastName + "\n" + address.toString();
    }

    // Getter and Setter methods
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return new Address(address);
    }

    public void setAddress(Address address) {
        this.address = new Address(address); 
    }
}
