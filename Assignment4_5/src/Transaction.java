import java.util.ArrayList;
import java.util.List;

public class Transaction {
    private List<TransactionItem> transactionItems;

    Transaction() {
        transactionItems = new ArrayList<>();
    }

    public void addTransactionItem(TransactionItem transactionItem1) {
        transactionItems.add(transactionItem1);
    }

    public List<TransactionItem> getTransactionItems() {
        return this.transactionItems;
    }
}
