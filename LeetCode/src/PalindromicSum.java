public class PalindromicSum {
    public PalindromicSum(int sum) {
        this.sum = sum;
    }

    private int sum;
    private int total;
    public void findSum()
    {
        driver(0,1);
        System.out.println(total);
    }
    private void driver(int currentSum,int start)
    {
        if(currentSum==sum)
            total++;
        else if(currentSum>sum)
            return;
        else
        {
            for(int i=1;i<=(sum/start);i++)
            {
                driver(currentSum+(i*start),start+1);
                if(i*start==sum)
                    total++;
            }
        }
    }
}
