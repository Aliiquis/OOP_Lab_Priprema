package hr.fer.oop.demo2.blockchain;

public interface Hasher {
    public byte[] hash(byte[] prevHash, String[] transactions);
}
