package hr.fer.oop.demo2.blockchain;

public class Block {
    private byte[] prevHash;
    private String[] transactions;
    private int size;
    private Hasher hasher;

    public Block(int maxTransactions) {
        this.transactions = new String[maxTransactions];
        this.size = 0;
        this.hasher = new SHAHasher();
    }

    public Block(int maxTransactions, Hasher hasher) {
        this.transactions = new String[maxTransactions];
        this.size = 0;
        this.hasher = hasher;
    }

    public byte[] getPrevHash() {
        return prevHash;
    }

    public void setPrevHash(byte[] prevHash) {
        this.prevHash = prevHash;
    }

    public int add(String transaction) {
        transactions[size] = transaction;
        return size++;
    }

    public void remove(int index) {
        for (int i = index + 1; i < transactions.length; i++) {
            transactions[i - 1] = transactions[i];
        }
        transactions[transactions.length - 1] = null;
        size--;
    }

    public byte[] hash(byte[] prevHash) {
        return new SHAHasher().hash(prevHash, this.transactions);
    }
}
