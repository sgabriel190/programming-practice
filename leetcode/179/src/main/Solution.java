package main;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String largestNumber(int[] nums) {
        if(nums == null){
            return "";
        }
        StringBuilder result = new StringBuilder();
        List<String> tmpResult = new ArrayList<>();
        // O(N*D) -> length of array * the max size of a int(2^31-1) => O(N)
        for(int number: nums){ // O(N)
            tmpResult.add(number + "");
        }
        tmpResult.sort((x, y) -> {
            String xy = x + y;
            String yx = y + x;
            return yx.compareTo(xy);
        });
        if(tmpResult.get(0).equals("0")){
            return "0";
        }
        while (!tmpResult.isEmpty()){
            result.append(tmpResult.get(0));
            tmpResult.remove(0);
        }
        return result.toString();
    }
}
