public abstract class TransactionItem {
    Item _item;

    abstract double getTransactionItemPrice();

    int getFrequentRenterPoints() {
        return 0;
    }

    int getPurchaseRewardPoints() {
        return 0;
    }

    public String getSummary() {
        return "\t" + _item.getCategory() + " - " + _item.getTitle() + "\t" + String.valueOf(this.getTransactionItemPrice()) + "\n";
    }
}
