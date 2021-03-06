package main;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Solution {
    public int dayOfYear(String date){
        if(date.length() != 10 || (date.charAt(4) != '-' && date.charAt(7) != '-')){
            return -1;
        }
        List<Integer> values = Arrays.stream(date.split("-")).map(Integer::parseInt).collect(toList());

        if(values.get(0) < 1900 || values.get(0) > 2019){
            return -1;
        }
        int secondHalf = 1;
        int result = 0;
        for(int month = 1; month < values.get(1); ++month){
            if(month>7){
                secondHalf = 2;
            }
            if((month & 1) == 1){
                result += 30 + (secondHalf & 1);
            }
            else{
                if(month != 2){
                    result += 30 + ((secondHalf >> 1) & 1);
                }
                else{
                    if(values.get(0) % 400 == 0 || (values.get(0) % 4 == 0 && values.get(0) % 100 != 0)){
                        result += 29;
                    }
                    else{
                        result += 28;
                    }
                }
            }
        }
        return result + values.get(2);
    }

    public int dayOfYear2(String date){
        int[] m = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
        int year = Integer.parseInt(date.substring(0,4));
        int month = Integer.parseInt(date.substring(5,7));
        int day = Integer.parseInt(date.substring(8,10));
        int n;

        n = m[month-1]+day;

        if((year%4==0 && year%100!=0 || year%400==0) && month > 2)
            n++;

        return n;
    }
}
