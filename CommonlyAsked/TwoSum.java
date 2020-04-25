package com.durgaprasad.CommonlyAsked;

import java.util.*;

public class TwoSum {

    public static List<Integer> twoSum(int[] arr, int sum){
        List<Integer> ind = new ArrayList<>();

        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                if((arr[i] + arr[j]) == sum){
                    ind.add(i+1);
                    ind.add(j+1);
                    break;
                }
            }
        }
        return ind;
    }

    public static List<Integer> twoSumHash(int[] arr, int sum){
        List<Integer> ind = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap();

        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(sum-arr[i])){
                ind.add(map.get(sum-arr[i])+1);
                ind.add(i+1);
                break;
            }
            map.put(arr[i], i);
        }
        return ind;
    }

    public static void main(String[] args){
        int[] arr = {2, 4, 7, 6, 3, 9};
        int sum = 15;
        sum = 5;
        List<Integer> ind = twoSum(arr, sum);
        System.out.print(ind.get(0) + " " + ind.get(1));
    }
}
