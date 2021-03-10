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
     *
     * p195
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

    /**
     * There are three types of edits that can be performed on strings: insert a character, remove a character,
     * or replace a character. Given two strings, write a function to check if they are one edit (or zero edits) away.
     *
     * p199
     */
    public boolean p5(String s1, String s2){
        if(s1 == null || s2 == null){
            return false;
        }
        if(Math.abs(s1.length() - s2.length()) > 1){
            return false;
        }
        byte[] freq = new byte[128];
        int sumPos = 0, sumNeg = 0;
        for(char c: s1.toCharArray()){ // O(s1)
            freq[c]++;
        }
        for(char c: s2.toCharArray()){ // O(s2)
            freq[c]--;
        }
        for(byte elem: freq){ // O(1)
            if(elem < 0){
                sumNeg += elem;
            } else{
                sumPos += elem;
            }
        }
        if(sumNeg * (-1) > 1 || sumPos > 1){
            return false;
        }
        return true;
    }

    /**
     * Implement a  method to perform basic string compression using the counts of repeated characters. For example,
     * the string aabcccccaaa would become a2blc5a3. If the "compressed" string would not become smaller than the original
     * string, your method should return the original string. You can assume the string has only uppercase and lowercase
     * letters (a - z)
     *
     * p201
     */
    public String p6(String s){
        if(s == null){
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        for(int i=0; i<s.length() - 1;i++){ // O(N) -> n size of the string
            if(s.charAt(i) == s.charAt(i+1)){
                count++;
            } else {
                stringBuilder.append(s.charAt(i)).append(count);
                count = 1;
            }
        }
        stringBuilder.append(s.charAt(s.length()-1)).append(count);
        if(stringBuilder.length() > s.length()){
            return s;
        } else{
          return stringBuilder.toString();
        }
    }
}
