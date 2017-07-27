package com.gc;

/**
 * Created by chand on 7/27/2017.
 */
public class prime {
        public boolean isPrime(int n) {
            for(int i = 2; i < n; ++i) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
        public int sequencePrime(int userInput){
            int number;
            int count;
            for(number = 2, count = 0; count < userInput; ++number){
                if(isPrime(number)){
                    count++;
                }
            }
            return number -1;
        }
}
