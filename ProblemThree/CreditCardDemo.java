package ProblemThree;
public class CreditCardDemo {
    public static void main(String[] args) {
        // Create Address
        Address address = new Address("123 Main St", "Anytown", "CA", "12345");

        // Create Person
        Person person = new Person("John", "Doe", address);

        // Create Money for credit limit
        Money creditLimit = new Money(5000, 0);

        // Create CreditCard
        CreditCard card = new CreditCard(person, creditLimit);

        // Display initial state
        System.out.println(card);

        // Charge $1500.75
        Money charge1 = new Money(1500, 75);
        System.out.println("\nCharging " + charge1);
        if (card.charge(charge1)) {
            System.out.println("Charge accepted.");
        }
        System.out.println("Current balance: " + card.getBalance());

        // Charge $4000.00 (should be denied)
        Money charge2 = new Money(4000, 0);
        System.out.println("\nCharging " + charge2);
        if (card.charge(charge2)) {
            System.out.println("Charge accepted.");
        }
        System.out.println("Current balance: " + card.getBalance());

        // Make a payment of $500.00
        Money payment1 = new Money(500, 0);
        System.out.println("\nMaking payment of " + payment1);
        card.payment(payment1);
        System.out.println("Current balance: " + card.getBalance());

        // Charge $2000.00 (should be accepted)
        Money charge3 = new Money(2000, 0);
        System.out.println("\nCharging " + charge3);
        if (card.charge(charge3)) {
            System.out.println("Charge accepted.");
        }
        System.out.println("Current balance: " + card.getBalance());

        // Final state
        System.out.println("\nFinal Credit Card Status:");
        System.out.println(card);
    }
}
