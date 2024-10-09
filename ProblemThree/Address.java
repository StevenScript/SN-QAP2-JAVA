package ProblemThree;

/**
 * The Address class represents a physical address with street, city, state, and zip code.
 * It provides constructors to create Address objects and methods to access and modify the address data.
 */
public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    // Default constructor
    public Address() {
        this("", "", "", "");
    }

    // Parameterized constructor
    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    // Copy constructor
    public Address(Address other) {
        this.street = other.street;
        this.city = other.city;
        this.state = other.state;
        this.zipCode = other.zipCode;
    }

    // toString method
    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + zipCode;
    }

    // Getter and Setter methods
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
