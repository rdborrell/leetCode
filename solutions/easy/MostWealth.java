package solutions.easy;

public class MostWealth
{
    public int maximumWealth(int[][] accounts)
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
        return runningTotal;
    }
}