package com.revature.week1;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArrayExtremes {

    public static int[] extrema(Iterable<Integer> col){
        int least = Integer.MAX_VALUE;
        int most = Integer.MIN_VALUE;
        for(int num : col){
            if(num > most) most = num;
            if(num < least) least = num;
        }
        int [] arr = {least, most};
        return arr;
    }
}
