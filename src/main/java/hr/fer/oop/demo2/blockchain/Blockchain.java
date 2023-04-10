package hr.fer.oop.demo2.blockchain;

import java.util.Arrays;

public class Blockchain {
    private Block[] blocks;
    private int maxBlocks;
    private int size;

    public Blockchain(int maxBlocks) {
        this.blocks = new Block[maxBlocks];
        this.maxBlocks = maxBlocks;
        this.size = 0;
    }

    public int add(Block newBlock) {
        if (size == maxBlocks) return -1;
        if (blocks[0] == null) {
            newBlock.setPrevHash(newBlock.hash(new byte[]{0}));
        } else {
            Block prevBlock = blocks[size - 1];
            newBlock.setPrevHash(newBlock.hash(prevBlock.getPrevHash()));
        }
        blocks[size] = newBlock;
        return size++;
    }

    public boolean isAltered(int blockIndex, byte[] expectedHash) {
        for (int i = 0; i <= blockIndex; i++) {
            if (i == 0) {
                if (!Arrays.equals(blocks[0].getPrevHash(), blocks[0].hash(new byte[]{0}))) {
                    return true;
                }
            } else {
                if (!Arrays.equals(blocks[i].getPrevHash(), blocks[i].hash(blocks[i - 1].getPrevHash()))) {
                    return true;
                }
            }
        }
        return !Arrays.equals(blocks[blockIndex].getPrevHash(), expectedHash);
    }
}
