public class ScheduleJob {
    private int min=Integer.MAX_VALUE;
    private int[] mat;
    private int days;
    ScheduleJob(int[] mat,int days)
    {
        this.mat=mat;
        this.days=days;
    }
    public int MinimumSchedule()
    {
        if(mat.length<days)return -1;
      DFSUtil(0,days,0);
      return min;
    }
    private void DFSUtil(int start,int days,int currentSum)
    {
        if(days==0)
        {
          this.min=Math.min(min,currentSum);
        }
        else
        {
            int max;
            for(int i=start;i<mat.length-(days-1);i++)
            {
                if(days-1==0) max=findMax(start,mat.length-1);
                else max=findMax(start,i);
                DFSUtil(i+1,days-1,currentSum+max);
            }

        }


    }
    private int findMax(int start,int end)
    {
        int max=Integer.MIN_VALUE;
        for(int i=start;i<=end;i++) {
            max = Math.max(mat[i], max);
        }
        return max;
    }
}
