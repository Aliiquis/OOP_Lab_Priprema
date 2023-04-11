package hr.fer.oop.demo2.blockchain;

public interface Hasher {
    byte[] hash(byte[] prevHash, String[] transactions);
}
