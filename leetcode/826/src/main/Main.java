package main;

public class Main {

    public static void main(String[] args) {
	    Solution solution = new Solution();
	    int[] d = {5,50,92,21,24,70,17,63,30,53};
        int[] p = {68,100,3,99,56,43,26,93,55,25};
        int[] w = {96,3,55,30,11,58,68,36,26,1};
        /*
        [5,50,92,21,24,70,17,63,30,53]
[68,100,3,99,56,43,26,93,55,25]
[96,3,55,30,11,58,68,36,26,1]

         */
	    System.out.println(solution.maxProfitAssignment(d, p, w));
    }
}
