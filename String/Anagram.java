package com.durgaprasad.String;

import java.util.HashMap;
import java.util.Set;

public class Anagram {
    public boolean isAnagram(String s1, String s2){
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        if(s1.length() != s2.length()){
            return false;
        }

        for(int i = 0; i < s1.length(); i++){
            if(map1.containsKey(s1.charAt(i))){
                map1.put(s1.charAt(i), map1.get(s1.charAt(i)) + 1);
            }else{
                map1.put(s1.charAt(i), 1);
            }
        }

        for(int i = 0; i < s2.length(); i++){
            if(map2.containsKey(s2.charAt(i))){
                map2.put(s2.charAt(i), map2.get(s2.charAt(i)) + 1);
            }else{
                map2.put(s2.charAt(i), 1);
            }
        }

        Set<Character> set = map1.keySet();

        for(Character c : set){
            if(!map1.get(c).equals(map2.get(c))){
                return false;
            }
        }
        return true;
    }

    public boolean isAnagramOp(String s1, String s2){
        int[] count = new int[256];
        for(int i = 0; i < s1.length(); i++){
            count[s1.charAt(i)]++;
        }

        for(int i = 0; i < s2.length(); i++){
             count[s2.charAt(i)]--;
        }

        for(int i = 0; i < 256; i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String s1 = "durgaprasad";
        String s2 = "prasaddurga";

        String s3 = "prasad";
        String s4 = "prasa";

        Anagram anagram = new Anagram();
        Boolean a = anagram.isAnagram(s1, s2);
        Boolean b = anagram.isAnagramOp(s1, s2);
        System.out.println(a);
        System.out.println(b);

        a = anagram.isAnagram(s3, s4);
        b = anagram.isAnagramOp(s3, s4);
        System.out.println(a);
        System.out.println(b);
    }
}
