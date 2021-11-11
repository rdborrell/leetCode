package solutions.easy;

import java.util.HashMap;

public class MostWealth
{
    public void solve(int[][] accounts)
    {
        int runningTotal =0;
        int tempTotal =0;
        for(int i=0; i<accounts.length;i++)
        {
            for(int j=0; j<accounts[i].length; j++)
            {
                tempTotal += accounts[i][j];
            }
            if(tempTotal > runningTotal)
            {
                runningTotal = tempTotal;
            }
            tempTotal =0;
        }
        System.out.println(runningTotal);
    }
}