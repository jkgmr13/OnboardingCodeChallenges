package com.revature.week1;

public class LongestSubSequence {
    public static int lcs(String s1, String s2){
        int[][] lcs = new int[s1.length()+1][s2.length()+1];
        char [] charr1 = s1.toCharArray();
        char [] charr2 = s2.toCharArray();
        for(int i = 0; i < charr1.length; i++){
            for(int j = 0; j < charr2.length; j++){
                if(charr1[i]==charr2[j]) lcs[i+1][j+1] = lcs[i][j]+1;
                else lcs[i+1][j+1] = Math.max(lcs[i][j+1], lcs[i+1][j]);
            }
        }
        return lcs[charr1.length][charr2.length];
    }
}
