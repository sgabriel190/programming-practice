package main;

import java.util.Arrays;

public class Solution {
    /**
     *  Implement an algorithm to determine if a string has all unique characters.
     *  What if you cannot use additional data structures?
     *  * Compare every character of the string to every other character of the string. This will take O( n2)  time and 0 (1) space.
     *  * If we are allowed to modify the input string, we could sort the string in O( n log(n)) time and then linearly
     *  check the string for neighboring characters that are identical. Careful, though: many sorting algorithms take up extra space.
     *
     *  p192
     */
    public boolean p1(String string){
        if(string.length() > 128){
            return true;
        }
        boolean[] freq = new boolean[128];
        // O(N) -> n = size of string
        for(int i=0; i<string.length(); ++i){ // O(N)
            int val = Character.getNumericValue(string.charAt(i));
            if(freq[val]){
                return true;
            }
            freq[val] = true;
        }
        return false;
    }

    private String sort(String s){
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    /**
     *  Given two strings, write a method to decide if one is a  permutation of the other.
     *
     *  p194
     */
    public boolean p2(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        String tmp1 = this.sort(s1);
        String tmp2 = this.sort(s2);

        for(int i = 0; i< s1.length(); ++i){
            if(tmp1.charAt(i) != tmp2.charAt(i)){
                return false;
            }
        }
        return true;
    }

    private void permutateCharSeq(char[] cs, int index){
        if (cs.length - 2 - index >= 0) System.arraycopy(cs, index, cs, index + 2, cs.length - 2 - index);
    }

    /**
     * Write a method to replace all spaces in a string with '%20: You may assume that the string has sufficient space
     * at the end to hold the additional characters, and that you are given the "true" length of the string. (Note: If
     * implementing in Java, please use a  character array so that you can perform this operation in place.)
     *
     * A common approach in string manipulation problems is to edit the string starting from the end and working backwards.
     * This is useful because we have an extra buffer at the end, which allows us to change characters without worrying
     * about what we're overwriting.
     *
     * p195
     */
    public String p3(String s){
        if(s == null){
            return null;
        }
        char[] result = s.toCharArray();
        for(int i = 0; i < result.length; ++i){ // O(n)
            if(result[i] == ' '){
                permutateCharSeq(result, i+1);
                result[i] = '%';
                result[i+1] = '2';
                result[i+2] = '0';
                i = i+2;
            }
        }
        return new String(result);
    }

    /**
     * Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or
     * phrase that is the same forwards and backwards. A permutation is a rearrangement of letters. The palindrome does
     * not need to be limited to just dictionary words.
     */
    public boolean p4(String word){
        if(word == null){
            return false;
        }
        boolean ok = true;
        int[] freq = new int[128]; // ASCII
        for(int i = 0; i < word.length(); ++i){ // O(n)
            if(word.charAt(i) != ' ')
                freq[word.charAt(i)]++;
        }
        for(int token: freq){ // O(1)
            if(token % 2 == 1){
                if(!ok && word.length() % 2 == 1){
                    return false;
                }
                ok = false;
            }
        }
        return true;
    }

    /*
    public int addBit(int a, int b){
        while(b != 0){
            int sum = a ^ b;
            int carry = (a & b) << 1;
            a = sum;
            b = carry;
        }
        return a;
    }
    */
}
