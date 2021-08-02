package com.revature.week1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayMissing {

    public static List<Integer> missing(List<Integer> list){
        Collections.sort(list);
        ArrayList<Integer> antiList = new ArrayList<>();
        for(int i = list.get(0); i < list.get(list.size()-1); i++){
            if(!list.contains(i)) antiList.add(i);
        }
        return antiList;
    }
}
