//find max and min

public class Question2
{
    public static void main(String[] args)
    {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int i=0;
        int[] a=new int[]{4,-1,3,-2,3};
        int first=a[0];
        while(i<a.length)
        {
            if (max<a[i])
             max=a[i];
            if (min>a[i])
                min=a[i];
            i++;
        }
        System.out.println(max);
        System.out.println(min);

    }
}
