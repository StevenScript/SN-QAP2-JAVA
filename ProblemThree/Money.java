package ProblemThree;

public class Money implements Comparable<Money> {
    private long dollars;
    private int cents;

    // Default constructor
    public Money() {
        this.dollars = 0;
        this.cents = 0;
    }

    // Parameterized constructor
    public Money(long dollars, int cents) {
        if (cents >= 100) {
            this.dollars = dollars + cents / 100;
            this.cents = cents % 100;
        } else {
            this.dollars = dollars;
            this.cents = cents;
        }
    }

    // Copy constructor
    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    // Equals method
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Money) {
            Money other = (Money) obj;
            return this.dollars == other.dollars && this.cents == other.cents;
        }
        return false;
    }

    // CompareTo method
    @Override
    public int compareTo(Money other) {
        if (this.dollars != other.dollars) {
            return Long.compare(this.dollars, other.dollars);
        } else {
            return Integer.compare(this.cents, other.cents);
        }
    }

    // toString method
    @Override
    public String toString() {
        return "$" + dollars + "." + String.format("%02d", cents);
    }

    // Add method
    public void add(Money amount) {
        this.cents += amount.cents;
        this.dollars += amount.dollars + this.cents / 100;
        this.cents %= 100;
    }

    // Subtract method
    public void subtract(Money amount) {
        long totalCents1 = this.dollars * 100 + this.cents;
        long totalCents2 = amount.dollars * 100 + amount.cents;
        long resultCents = totalCents1 - totalCents2;

        if (resultCents < 0) {
            throw new IllegalArgumentException("Resulting amount cannot be negative.");
        }

        this.dollars = resultCents / 100;
        this.cents = (int) (resultCents % 100);
    }

    // Getter methods
    public long getDollars() {
        return dollars;
    }

    public int getCents() {
        return cents;
    }
}
