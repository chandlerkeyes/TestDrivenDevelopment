package com.gc;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by chand on 7/27/2017.
 */
public class primeTest {
    @Test
    public void isPrimeTest1() throws Exception {
        prime tester = new prime();
        boolean expected = true;
        boolean actual = tester.isPrime(11);
    }
    @Test
    public void isPrimeTest2() throws Exception {
        prime tester = new prime();
        boolean expected = false;
        boolean actual = tester.isPrime(3);
    }

    @Test
    public void sequencePrimeTest1() throws Exception {
        prime tester = new prime();
        int expected = 2;
        int actual = tester.sequencePrime(1);
    }
    @Test
    public void sequencePrimeTest2() throws Exception {
        prime tester = new prime();
        int expected = 5;
        int actual = tester.sequencePrime(3);
    }
}