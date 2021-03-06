package mineField;

import java.io.Serializable;
import java.util.Random;

public class Cell implements Serializable{

    private final double MINED_CHANCE = .2;
    private int neighboringMines;
    private boolean mined;
    private boolean traversed;

    public Cell() {
        mined = Math.random() < MINED_CHANCE;
        traversed = false;
        neighboringMines = 0;
    }

    public void incrementNeighboringMines() {
        neighboringMines++;
    }

    public int getNeighboringMines() {
        return neighboringMines;
    }

    public void mine() {
        mined = true;
    }

    public void unmine() {
        mined = false;
    }

    public boolean isMined() {
        return mined;
    }

    public boolean isTraversed() {
        return traversed;
    }

    public void traverse() {
        traversed = true;
    }
}