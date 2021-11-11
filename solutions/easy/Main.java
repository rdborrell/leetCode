package solutions.easy;

public class Main
{
    public static void main(String ...args)
    {
        MostWealth wealth = new MostWealth();
        int[][] testArray = {{2,8,7},{7,1,3},{1,9,5}};
        int answer = wealth.maximumWealth(testArray);
        System.out.println(answer);
    }
}