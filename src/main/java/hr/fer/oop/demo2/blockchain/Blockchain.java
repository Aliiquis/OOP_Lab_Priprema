package hr.fer.oop.demo2.blockchain;

import java.util.Arrays;

public class Blockchain {
    private final Block[] blocks;
    private int size;

    public Blockchain(int maxBlocks) {
        this.blocks = new Block[maxBlocks];
        this.size = 0;
    }

    public int add(Block newBlock) {
        if (blocks[0] == null) {
            newBlock.setPrevHash(new byte[]{0});
        } else {
            Block prevBlock = blocks[size - 1];
            newBlock.setPrevHash(prevBlock.hash(prevBlock.getPrevHash()));
        }
        blocks[size] = newBlock;
        return size++;
    }

    public boolean isAltered(int blockIndex, byte[] expectedHash) {
        for (int i = 1; i <= blockIndex; i++) {
            if (!Arrays.equals(blocks[i].getPrevHash(), blocks[i - 1].hash(blocks[i - 1].getPrevHash()))) {
                return true;
            }
        }
        return !Arrays.equals(blocks[blockIndex].hash(blocks[blockIndex].getPrevHash()), expectedHash);
    }
}
