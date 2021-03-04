package main;

public class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int result = duration;
        if(timeSeries.length == 0){
            return 0;
        }
        timeSeries[0] += duration;
        for(int index = 1; index<timeSeries.length; index++){
            if(timeSeries[index - 1] > timeSeries[index]){
                result += timeSeries[index] + duration - timeSeries[index - 1];
            }
            else{
                result += duration;
            }
            timeSeries[index] += duration;
        }
        return result;
    }
    public int findPoisonedDuration2(int[] timeSeries, int duration) {
        int n = timeSeries.length;
        if (n == 0) return 0;

        int total = 0;
        for(int i = 0; i < n - 1; ++i)
            total += Math.min(timeSeries[i + 1] - timeSeries[i], duration);
        return total + duration;
    }
}