// maxsub array sum

public class Question10
{
    public static void main(String[] args)
    {
        int []a= new int[]{1,2,3,5};
        int cur_sum=0;
        int max_sum= Integer.MIN_VALUE;
        int prefix[] = new int[a.length];
        prefix[0]=a[0];
        for (int i=1; i<prefix.length;i++)
        {
            prefix[i]=prefix[i-1]+a[i];
        }
        for (int i=0;i<prefix.length;i++)
        {
            System.out.println(prefix[i]);
        }
        for (int i=0;i<a.length;i++) {
            for (int j = i; j < a.length; j++)
            {
                cur_sum = (i== 0) ? prefix[j] : prefix[j] - prefix[i - 1];
                if (max_sum < cur_sum)
                {
                    max_sum = cur_sum;
                }
            }
        }
        System.out.println(max_sum);
    }
}
