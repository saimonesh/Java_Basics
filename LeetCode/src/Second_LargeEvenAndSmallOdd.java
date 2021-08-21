public class Second_LargeEvenAndSmallOdd {
    int size;
    int[] array;

    public Second_LargeEvenAndSmallOdd(int size, int[] array) {
        this.size = size;
        this.array = array;
    }

    public void print()
    {
        int large=Integer.MIN_VALUE,largest=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE,smallest=Integer.MAX_VALUE;
        for(int i=0;i<size;i++)
        {
            if(array[i]%2!=0)
            {
                if(array[i]<smallest)
                {
                    int temp=smallest;
                    smallest=array[i];
                    if(temp>array[i])
                    {
                        small=temp;
                    }
                }else if(array[i]<small)
                {
                    small=array[i];
                }
            }
            if(array[i]%2==0)
            {
                if(array[i]>largest)
                {
                    int temp=largest;
                    largest=array[i];
                    if(temp<array[i])
                    {
                        large=temp;
                    }
                }else if(array[i]>large)
                {
                    large=array[i];
                }
            }
        }
        if(large==Integer.MIN_VALUE)
        System.out.println("No second max value");
        else
            System.out.println(large);
        if(small==Integer.MAX_VALUE)
            System.out.println("No second min value");
        else
            System.out.println(small);

    }
}
