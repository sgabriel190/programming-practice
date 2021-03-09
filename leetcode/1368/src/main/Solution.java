package main;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    int[][] moves = new int[][] {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public int minCost(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        //track visited cells
        boolean[][] dp = new boolean[n][m];
        //cell which we need to check
        List<int[]> toCheck = new ArrayList<>();
        //filling toCheck with all the cells accessible from the 0,0
        if(fillToCheck(0, 0, toCheck, grid, dp)) {
            return 0;
        }
        int cost = 0;
        while(!toCheck.isEmpty()) {
            cost++;
            //cell to check on the next step
            List<int[]> nextToCheck = new ArrayList<>();
            //checking all the neighbors cells
            for(int[] cell : toCheck) {
                for (int[] move : moves) {
                    int x = cell[0] + move[0];
                    int y = cell[1] + move[1];
                    //check that cell is withing array and wasn't visited before
                    if (x >= 0 && x < n && y >= 0 && y < m && !dp[x][y]) {
                        if (fillToCheck(x, y, nextToCheck, grid, dp)) {
                            return cost;
                        }
                    }
                }
            }
            toCheck = nextToCheck;
        }
        return cost;
    }

    private boolean fillToCheck(int x, int y, List<int[]> list, int[][] grid, boolean[][] dp) {
        if(x == grid.length - 1 && y == grid[0].length - 1) {
            return true;
        }
        list.add(new int[] {x, y});
        dp[x][y] = true;
        //next cell
        int nx = x + moves[grid[x][y] - 1][0];
        int ny = y + moves[grid[x][y] - 1][1];
        //check that cell is within array and wasn't visited before
        if(nx >= 0 && ny >= 0 && nx < grid.length && ny < grid[0].length && !dp[nx][ny]) {
            return fillToCheck(nx, ny, list, grid, dp);
        }

        return false;
    }
}
