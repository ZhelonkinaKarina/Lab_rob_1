package Lab_rob_1;

public class Main {
	public static void main(String[] args) {
        BankATM bankATM = new BankATM();

        User user1 = new User("1234567890", 1234, 1000.0);
        User user2 = new User("0987654321", 4321, 1500.0);

        bankATM.users.add(user1);
        bankATM.users.add(user2);

        Transaction transaction1 = new Transaction("Поповнення рахунку +", 500.0);
        Transaction transaction2 = new Transaction("Зняття коштів -", 200.0);

        bankATM.transactions.add(transaction1);
        bankATM.transactions.add(transaction2);

        User authenticatedUser = bankATM.authenticateUser("1234567890", 1234);
        bankATM.displayBalance(authenticatedUser);
        bankATM.displayTransactions(authenticatedUser);
        
        User authenticatedUser2 = bankATM.authenticateUser("2200167495", 1234);
        bankATM.displayBalance(authenticatedUser2);
        bankATM.displayTransactions(authenticatedUser2);
    }
}






