package ProblemThree;

public class CreditCard {
    private Person owner;
    private Money balance;
    private Money creditLimit;

    // Constructor
    public CreditCard(Person owner, Money creditLimit) {
        this.owner = new Person(owner);
        this.balance = new Money(0, 0);
        this.creditLimit = new Money(creditLimit);
    }

    // Charge method
    public boolean charge(Money amount) {
        Money newBalance = new Money(balance);
        newBalance.add(amount);

        if (newBalance.compareTo(creditLimit) <= 0) {
            balance = newBalance;
            return true;
        } else {
            System.out.println("Charge denied: Credit limit exceeded.");
            return false;
        }
    }

    // Payment method
    public void payment(Money amount) {
        balance.subtract(amount);
    }

    // Getter methods
    public Money getBalance() {
        return new Money(balance);
    }

    public Person getOwner() {
        return new Person(owner);
    }

    // toString method
    @Override
    public String toString() {
        return "Credit Card owned by:\n" + owner.toString() +
               "\nBalance: " + balance.toString() +
               "\nCredit Limit: " + creditLimit.toString();
    }
}
