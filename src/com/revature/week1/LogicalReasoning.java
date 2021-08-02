package com.revature.week1;

import java.util.Locale;

public class LogicalReasoning {
    public static void decoder(String s){
        char [] chars = s.toUpperCase().toCharArray();
        int [] primes = {2,3,5,7,11,13,17,19,23};
        for(char c : chars){
            if(c=='A') System.out.print("A1");
            else {
                int i = 0;
                while (((int) c - 64) % primes[i] != 0) {
                    i++;
                }
                System.out.print((char) (primes[i] + 64));
                System.out.print(((int) (c - 64)) / primes[i]);
            }
        }
    }
}
