package com.durgaprasad.InterviewBit;

import java.util.ArrayList;

public class AddOne{

    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int n = A.size();
        int sum = 0, carry = 0, last_zero = n-1;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            list.add(0);
        }

        for(int i = n-1; i >= 0; i--){
            sum = A.get(i) + 1 + carry;
            if(sum == 10){
                carry = 1;
                list.set(i, 0);
            }else if(sum == 1){
                carry = 0;
                list.set(i, sum);
            }else{
                carry = 0;
                list.set(i, sum);
                last_zero = i;
            }
        }

        for(int i = 0; i < n; i++){
            System.out.println(A.get(i) + " " + list.get(i));
        }

        System.out.println("k : "  + last_zero);

        int k = 0;
        while(k < last_zero) {
            list.remove(0);
            k++;
        }

        return list;
    }

    public static void main(String[] args){
        int[] arr = { 0, 0, 6, 8, 6, 1, 2, 4, 9};
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            a.add(arr[i]);
        }
        ArrayList<Integer> li = plusOne(a);
        System.out.print(li);
    }
}

