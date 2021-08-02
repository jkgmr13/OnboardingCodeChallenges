package com.revature.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class week1Runner {
    public static void main(String... args) {
        int [] extremum = ArrayExtremes.extrema(Arrays.asList(1,2,3,4,5,6));
        List<Integer> missingList = ArrayMissing.missing(Arrays.asList(7,5,6,1,4,2));
        List<Integer> missingList2 = ArrayMissing.missing(Arrays.asList(5,3,1,2));
        int lcs = LongestSubSequence.lcs("Minneapolis", "Minnesota");
        System.out.println("Largest: "+extremum[1]+"\nSmallest: "+extremum[0]);
        System.out.println("First missing nums: "+ missingList);
        System.out.println("Second missing nums: "+missingList2);
        LogicalReasoning.decoder("quadrant");
    }
}
