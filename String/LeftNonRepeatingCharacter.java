package com.durgaprasad.String;

public class LeftNonRepeatingCharacter {
    public int leftMostNonRepeatingCharacter(String s){
        int[] alphabets = new int[256];
        int res = Integer.MAX_VALUE;

        for(int i = 0; i < alphabets.length; i++){
            alphabets[i] = -1;
        }

        for(int i = 0; i < s.length(); i++){
            if(alphabets[s.charAt(i)] == -1){
                alphabets[s.charAt(i)] = i;
            }else{
                alphabets[s.charAt(i)] = -2;
            }
        }

        for(int i = 0; i < alphabets.length; i++){
            if(alphabets[i] >= 0){
                res = Math.min(res, alphabets[i]);
            }
        }

        if(res == Integer.MAX_VALUE){
            return -1;
        }else{
            return res;
        }
    }

    public static void main(String[] args){
        String s = "geekforgeeks";
        LeftNonRepeatingCharacter c = new LeftNonRepeatingCharacter();
        System.out.println(c.leftMostNonRepeatingCharacter(s));
        //System.out.println(c.leftMostIndexOptmized(s));


        s = "geeks";
        System.out.println(c.leftMostNonRepeatingCharacter(s));
        //System.out.println(c.leftMostIndexOptmized(s));

        s = "daksh";
        System.out.println(c.leftMostNonRepeatingCharacter(s));
        //System.out.println(c.leftMostIndexOptmized(s));

    }
}
