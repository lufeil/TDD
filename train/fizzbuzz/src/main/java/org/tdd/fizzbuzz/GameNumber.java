package org.tdd.fizzbuzz;

public class GameNumber {

    private int rawNumber;

    public GameNumber(int rawNumber) {
        this.rawNumber = rawNumber;
    }

    @Override
    public String toString() {
        if (isRelatedTo(3) && isRelatedTo(5)) {
            return "fizzbuzz";
        }
        if (isRelatedTo(3)) {
            return "fizz";
        }
        if (isRelatedTo(5)) {
            return "buzz";
        }
        return String.valueOf(rawNumber);
    }

    private boolean isRelatedTo(int i) {
        return rawNumber % i == 0 || String.valueOf(rawNumber).contains(String.valueOf(i));
    }
}
