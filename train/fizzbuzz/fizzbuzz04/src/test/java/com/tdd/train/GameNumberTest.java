package com.tdd.train;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class GameNumberTest {
    @Test
    public void should_show_raw_number_if_normal_number() {
        checkGameNumberOutput(1, "1");
        checkGameNumberOutput(2, "2");
    }

    @Test
    public void should_show_fizz_if_raw_number_divisible_by_3() {
        checkGameNumberOutput(3, "fizz");
    }

    @Test
    public void should_show_buzz_if_raw_number_divisible_by_5() {
        checkGameNumberOutput(5, "buzz");
    }

    @Test
    public void should_show_fizzbuzz_if_raw_number_divisible_by_3_and_5() {
        checkGameNumberOutput(15, "fizzbuzz");
    }

    @Test
    public void should_show_fizz_or_buzz_if_raw_number_contains_3_or_5() {
        checkGameNumberOutput(13, "fizz");
        checkGameNumberOutput(51, "fizzbuzz");
        checkGameNumberOutput(35, "fizzbuzz");
    }

    private void checkGameNumberOutput(int i, String s) {
        Assert.assertThat(new GameNumber(i).toString(), is(s));
    }
}
