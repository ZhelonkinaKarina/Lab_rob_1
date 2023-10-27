package Lab_rob_1;

import java.util.ArrayList;
import java.util.List;

public class BankATM {
	public List<User> users;
    public List<Transaction> transactions;

    public BankATM() {
        users = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    public User authenticateUser(String cardNumber, int pin) {
        for (User user : users) {
            if (user.verifyPin(pin) && user.getCardNumber().equals(cardNumber)) {
                return user;
            }
        }
        return null;
    }

    public void displayBalance(User user) {
        if (user != null) {
            System.out.println("Баланс на картці: " + user.getBalance());
        } else {
            System.out.println("Невірний пін-код або номер картки.");
        }
    }

    public void displayTransactions(User user) {
    	if (user != null) {
    		System.out.println("Останні операції:");
    		for (Transaction transaction : transactions) {
    			System.out.println(transaction.getDescription() + transaction.getAmount());
    		}
    	} else {
    		System.out.println("Невірний пін-код або номер картки.");
    		}
    	}
}
