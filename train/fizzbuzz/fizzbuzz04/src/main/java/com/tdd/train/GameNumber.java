package com.tdd.train;

import static java.lang.String.valueOf;

public class GameNumber {
    private int rawNumber;

    public GameNumber(int rawNumber) {
        this.rawNumber = rawNumber;
    }

    @Override
    public String toString() {
        if (isRaletedTo(3) && isRaletedTo(5))
            return "fizzbuzz";
        if (isRaletedTo(3))
            return "fizz";
        if (isRaletedTo(5))
            return "buzz";
        return valueOf(rawNumber);
    }

    private boolean isRaletedTo(int i) {
        return rawNumber % i == 0 || valueOf(rawNumber).contains(valueOf(i));
    }
}
