package bank.business.domain;

public class Transaction {
    private String type;
    private int amount;
    private long timestamp;

    public Transaction(String type, int amount) {
        this.type = type;
        this.amount = amount;
        this.timestamp = System.currentTimeMillis();
    }

    public String getType() {
        return type;
    }

    public int getAmount() {
        return amount;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
