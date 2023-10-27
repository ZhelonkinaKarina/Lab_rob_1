package Lab_rob_1;

public class User {
	private String cardNumber;
    private int pin;
    private double balance;

    public User(String cardNumber, int pin, double balance) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void updateBalance(double amount) {
        balance += amount;
    }

    public boolean verifyPin(int enteredPin) {
        return pin == enteredPin;
    }

    public String getCardNumber() {
        return cardNumber;
    }
}
