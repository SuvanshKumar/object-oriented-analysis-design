public abstract  class Item {
    String _title;
    int    _priceCode;

    String category;

    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int arg) {
        _priceCode = arg;
    }

    public String getTitle() {
        return _title;
    }

    public String getCategory() {
        return category;
    }
}
