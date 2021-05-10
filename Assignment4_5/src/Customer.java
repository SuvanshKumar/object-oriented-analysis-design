import javax.swing.*;
import java.util.*;

public class Customer {
    private String _name;
    private int _age;
    private List<Transaction> transactions = new ArrayList<>();
    
    public Customer (String name, int age) {
        _name = name;
        _age = age;
    }

    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }
    
    public String getName() {
        return _name;
    }

    public int getAge() {
        return _age;
    }

    public String getStatement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0, purchaseRewardPoints = 0;
        StringBuilder resultBuilder = new StringBuilder("Transaction Record for " + getName() + "\n");

        for (Transaction transaction: this.transactions) {
            for (TransactionItem transactionItem: transaction.getTransactionItems()) {
                totalAmount += transactionItem.getTransactionItemPrice();
                frequentRenterPoints += transactionItem.getFrequentRenterPoints();
                purchaseRewardPoints += transactionItem.getPurchaseRewardPoints();
                resultBuilder.append(transactionItem.getSummary());
            }
        }
        resultBuilder.append("Amount owed is ").append(totalAmount).append("\n");
        resultBuilder.append("You earned ").append(frequentRenterPoints).append(" frequent renter points and ")
                .append(purchaseRewardPoints).append(" purchase reward points");
        return resultBuilder.toString();
    }
}