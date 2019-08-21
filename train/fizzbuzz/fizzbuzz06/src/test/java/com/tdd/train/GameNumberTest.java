package com.tdd.train;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class GameNumberTest {
    @Test
    public void test_normal_number() {
        checkGameNumberOutput(1, "1");
        checkGameNumberOutput(2, "2");
    }

    @Test
    public void test_fizz() {
        checkGameNumberOutput(3, "fizz");
    }

    @Test
    public void test_buzz() {
        checkGameNumberOutput(5, "buzz");
    }

    @Test
    public void test_fizzbuzz() {
        checkGameNumberOutput(15, "fizzbuzz");
    }

    @Test
    public void test_fizz_or_buzz() {
        checkGameNumberOutput(35, "fizzbuzz");
        checkGameNumberOutput(51, "fizzbuzz");
        checkGameNumberOutput(13, "fizz");
    }

    private void checkGameNumberOutput(int i, String s) {
        Assert.assertThat(new GameNumber(i).toString(), is(s));
    }

}
