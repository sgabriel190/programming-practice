package main;

public class Solution {

    private void bubbleSort(int[] a, int[] b){
        int last = a.length - 1;
        boolean ok = true;
        while (last != 0 && ok){
            ok = false;
            for(int i = 0; i < last; ++i){
                if(a[i]>a[i+1]){
                    ok = true;
                    int tmp;
                    tmp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = tmp;
                    tmp = b[i];
                    b[i] = b[i+1];
                    b[i+1] = tmp;
                }
            }
            last--;
        }
    }

    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        if(difficulty == null || profit == null || worker == null){
            return 0;
        }
        int profitResult = 0;
        bubbleSort(difficulty, profit); //O(N^2)
        // O(W*J)
        for(int w: worker){ // O(W)
            int tmpIdx = -1;
            int highestProfit = 0;
            for(int i = 0; i < difficulty.length; i++){ // O(J)
                if(w < difficulty[i]){
                    break;
                }
                if(profit[i] > highestProfit){
                    highestProfit = profit[i];
                    tmpIdx = i;
                }
            }
            if(tmpIdx == -1) continue;
            profitResult += profit[tmpIdx];
        }
        return profitResult;
    }
}
