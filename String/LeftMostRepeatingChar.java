package com.durgaprasad.String;

public class LeftMostRepeatingChar {
    public int leftMostIndex(String s){
        int[] alphabets = new int[256];
        int res = Integer.MAX_VALUE;

        for(int i = 0; i < alphabets.length; i++){
            alphabets[i] = -1;
        }

        for(int i = 0; i < s.length(); i++){

            if(alphabets[s.charAt(i)] == -1){
                alphabets[s.charAt(i)] = i;
            }else{
                res = Math.min(alphabets[s.charAt(i)], res);
            }
        }

        if(res == Integer.MAX_VALUE){
            return -1;
        }else {
            return res;
        }
    }

    public int leftMostIndexOptmized(String s){
        int[] alphabets = new int[256];

        // Tracking the index
        int res = Integer.MAX_VALUE;

        for(int i = 0; i < alphabets.length; i++){
            alphabets[i] = -1;
        }

        for(int i = s.length()-1; i >= 0; i--){

            // first time occurring elements.
            if(alphabets[s.charAt(i)] == -1){
                alphabets[s.charAt(i)] = i;
            }else{
                res = i;
            }
        }

        if(res == Integer.MAX_VALUE){
            return -1;
        }else {
            return res;
        }
    }

    public static void main(String[] args){
        String s = "geekforgeeks";
        LeftMostRepeatingChar c = new LeftMostRepeatingChar();
        System.out.println(c.leftMostIndex(s));
        System.out.println(c.leftMostIndexOptmized(s));


        s = "geeks";
        System.out.println(c.leftMostIndex(s));
        System.out.println(c.leftMostIndexOptmized(s));

        s = "daksh";
        System.out.println(c.leftMostIndex(s));
        System.out.println(c.leftMostIndexOptmized(s));

    }
}
